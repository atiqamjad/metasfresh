/*
 * #%L
 * de.metas.picking.rest-api
 * %%
 * Copyright (C) 2024 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

package de.metas.picking.workflow;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import de.metas.bpartner.BPartnerLocationId;
import de.metas.bpartner.service.IBPartnerDAO;
import de.metas.document.location.IDocumentLocationBL;
import de.metas.handlingunits.picking.job.model.PickingJob;
import de.metas.handlingunits.picking.job.model.PickingJobCandidate;
import de.metas.handlingunits.picking.job.model.PickingJobReference;
import de.metas.handlingunits.picking.job.model.RenderedAddressProvider;
import de.metas.i18n.ITranslatableString;
import de.metas.i18n.TranslatableStrings;
import de.metas.organization.IOrgDAO;
import de.metas.picking.config.MobileUIPickingUserProfile;
import de.metas.picking.config.PickingJobField;
import de.metas.util.StringUtils;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.I_C_BPartner_Location;

import javax.annotation.Nullable;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;

public class DisplayValueProvider
{
	@NonNull private final IBPartnerDAO partnerDAO;
	@NonNull private final IOrgDAO orgDAO;
	@NonNull private final RenderedAddressProvider renderedAddressProvider;

	@NonNull private final MobileUIPickingUserProfile profile;

	@NonNull private final HashMap<BPartnerLocationId, Optional<String>> ruestplatzCache = new HashMap<>();

	@Builder
	private DisplayValueProvider(
			@NonNull final IBPartnerDAO partnerDAO,
			@NonNull final IOrgDAO orgDAO,
			@NonNull final IDocumentLocationBL documentLocationBL,
			//
			@NonNull final MobileUIPickingUserProfile profile)
	{
		this.partnerDAO = partnerDAO;
		this.orgDAO = orgDAO;
		this.renderedAddressProvider = RenderedAddressProvider.newInstance(documentLocationBL);

		this.profile = profile;
	}

	public void cacheWarmUpForPickingJobReferences(final ImmutableList<PickingJobReference> pickingJobReferences)
	{
		if (pickingJobReferences.isEmpty())
		{
			return;
		}

		final ImmutableList<Context> contexts = pickingJobReferences.stream().map(DisplayValueProvider::toContext).collect(ImmutableList.toImmutableList());
		cacheWarmUpForContexts(contexts);
	}

	public void cacheWarmUpForPickingJobCandidates(final ImmutableList<PickingJobCandidate> pickingJobCandidates)
	{
		if (pickingJobCandidates.isEmpty())
		{
			return;
		}

		final ImmutableList<Context> contexts = pickingJobCandidates.stream().map(this::toContext).collect(ImmutableList.toImmutableList());
		cacheWarmUpForContexts(contexts);
	}

	private void cacheWarmUpForContexts(final ImmutableList<Context> contexts)
	{
		if (contexts.isEmpty())
		{
			return;
		}

		if (profile.isLauncherField(PickingJobField.RUESTPLATZ_NR))
		{
			loadRuestplatz(contexts);
		}

		final HashSet<BPartnerLocationId> locationIds = new HashSet<>();
		if (profile.isLauncherField(PickingJobField.DELIVERY_ADDRESS))
		{
			locationIds.addAll(extractDeliveryLocationIds(contexts));
		}
		if (profile.isLauncherField(PickingJobField.HANDOVER_LOCATION))
		{
			locationIds.addAll(extractHandoverLocationIds(contexts));
		}

		renderedAddressProvider.warmUpForBPartnerLocationIds(locationIds);
	}

	private void loadRuestplatz(@NonNull final ImmutableList<Context> contexts)
	{
		final ImmutableSet<BPartnerLocationId> deliveryLocationIds = extractDeliveryLocationIds(contexts);

		final ImmutableMap<BPartnerLocationId, I_C_BPartner_Location> locationsById = Maps.uniqueIndex(
				partnerDAO.retrieveBPartnerLocationsByIds(deliveryLocationIds),
				location -> BPartnerLocationId.ofRepoId(location.getC_BPartner_ID(), location.getC_BPartner_Location_ID())
		);

		deliveryLocationIds.forEach(locationId -> {
			ruestplatzCache.put(locationId, extractRuestplatz(locationsById.get(locationId)));
		});
	}

	private static ImmutableSet<BPartnerLocationId> extractDeliveryLocationIds(final @NonNull ImmutableList<Context> contexts)
	{
		return contexts.stream().map(Context::getDeliveryLocationId).collect(ImmutableSet.toImmutableSet());
	}

	private static ImmutableSet<BPartnerLocationId> extractHandoverLocationIds(final @NonNull ImmutableList<Context> contexts)
	{
		return contexts.stream().map(Context::getHandoverLocationId).filter(Objects::nonNull).collect(ImmutableSet.toImmutableSet());
	}

	@NonNull
	public ITranslatableString computeLauncherCaption(@NonNull final PickingJob pickingJob)
	{
		return computeLauncherCaption(toContext(pickingJob));
	}

	@NonNull
	public ITranslatableString computeLauncherCaption(@NonNull final PickingJobCandidate pickingJobCandidate)
	{
		return computeLauncherCaption(toContext(pickingJobCandidate));
	}

	@NonNull
	public ITranslatableString computeLauncherCaption(@NonNull final PickingJobReference pickingJobReference)
	{
		return computeLauncherCaption(toContext(pickingJobReference));
	}

	@NonNull
	private ITranslatableString computeLauncherCaption(@NonNull final Context context)
	{
		final ImmutableList<ITranslatableString> parts = profile.getLauncherFieldsInOrder()
				.stream()
				.map(uiFiled -> getDisplayValue(uiFiled, context))
				.filter(caption -> !TranslatableStrings.isBlank(caption))
				.collect(ImmutableList.toImmutableList());

		return TranslatableStrings.join(" | ", parts);
	}

	@NonNull
	private Context toContext(@NonNull final PickingJobCandidate pickingJobCandidate)
	{
		return Context.builder()
				.deliveryLocationId(pickingJobCandidate.getDeliveryBPLocationId())
				.salesOrderDocumentNo(pickingJobCandidate.getSalesOrderDocumentNo())
				.customerName(pickingJobCandidate.getCustomerName())
				.preparationDate(pickingJobCandidate.getPreparationDate().toZonedDateTime(orgDAO::getTimeZone))
				.handoverLocationId(pickingJobCandidate.getHandoverLocationId())
				.build();
	}

	@NonNull
	private static Context toContext(@NonNull final PickingJobReference pickingJobReference)
	{
		return Context.builder()
				.deliveryLocationId(pickingJobReference.getDeliveryLocationId())
				.salesOrderDocumentNo(pickingJobReference.getSalesOrderDocumentNo())
				.customerName(pickingJobReference.getCustomerName())
				.preparationDate(pickingJobReference.getPreparationDate())
				.handoverLocationId(pickingJobReference.getHandoverLocationId())
				.build();
	}

	@NonNull
	private static Context toContext(@NonNull final PickingJob pickingJob)
	{
		return Context.builder()
				.deliveryLocationId(pickingJob.getDeliveryBPLocationId())
				.salesOrderDocumentNo(pickingJob.getSalesOrderDocumentNo())
				.customerName(pickingJob.getCustomerName())
				.preparationDate(pickingJob.getPreparationDate())
				.handoverLocationId(pickingJob.getHandoverLocationId())
				.build();
	}

	@NonNull
	public ITranslatableString getDisplayValue(@NonNull final PickingJobField uiField, @NonNull final PickingJob pickingJob)
	{
		return getDisplayValue(uiField, toContext(pickingJob));
	}

	@NonNull
	private ITranslatableString getDisplayValue(@NonNull final PickingJobField uiField, @NonNull final Context pickingJob)
	{
		switch (uiField)
		{
			case CUSTOMER:
				return TranslatableStrings.anyLanguage(pickingJob.getCustomerName());
			case DATE_READY:
				return TranslatableStrings.dateAndTime(pickingJob.getPreparationDate());
			case DOCUMENT_NO:
				return TranslatableStrings.anyLanguage(pickingJob.getSalesOrderDocumentNo());
			case RUESTPLATZ_NR:
				return TranslatableStrings.anyLanguage(getRuestplatz(pickingJob).orElse(null));
			case DELIVERY_ADDRESS:
				return TranslatableStrings.anyLanguage(getDeliveryAddress(pickingJob));
			case HANDOVER_LOCATION:
				return TranslatableStrings.anyLanguage(getHandoverAddress(pickingJob));
			default:
				throw new AdempiereException("Unknown filed: " + uiField);
		}
	}

	private Optional<String> getRuestplatz(@NonNull final Context pickingJob)
	{
		final BPartnerLocationId deliveryLocationId = pickingJob.getDeliveryLocationId();
		return ruestplatzCache.computeIfAbsent(deliveryLocationId, this::retrieveRuestplatz);
	}

	private Optional<String> retrieveRuestplatz(final BPartnerLocationId deliveryLocationId)
	{
		return extractRuestplatz(partnerDAO.getBPartnerLocationByIdEvenInactive(deliveryLocationId));
	}

	private static Optional<String> extractRuestplatz(@Nullable final I_C_BPartner_Location location)
	{
		return Optional.ofNullable(location)
				.map(I_C_BPartner_Location::getSetup_Place_No)
				.map(StringUtils::trimBlankToNull);
	}

	@NonNull
	private String getHandoverAddress(@NonNull final Context pickingJob)
	{
		return renderedAddressProvider.getAddress(pickingJob.getHandoverLocationIdWithFallback());
	}

	@NonNull
	private String getDeliveryAddress(@NonNull final Context context)
	{
		return renderedAddressProvider.getAddress(context.getDeliveryLocationId());
	}

	@Value
	@Builder
	private static class Context
	{
		@NonNull String salesOrderDocumentNo;
		@NonNull String customerName;
		@NonNull ZonedDateTime preparationDate;
		@NonNull BPartnerLocationId deliveryLocationId;
		@Nullable BPartnerLocationId handoverLocationId;

		@NonNull
		public BPartnerLocationId getHandoverLocationIdWithFallback()
		{
			return handoverLocationId != null ? handoverLocationId : deliveryLocationId;
		}
	}
}
