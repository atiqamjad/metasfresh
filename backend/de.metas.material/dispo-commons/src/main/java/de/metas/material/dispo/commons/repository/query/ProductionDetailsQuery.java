package de.metas.material.dispo.commons.repository.query;

import de.metas.material.dispo.commons.candidate.businesscase.ProductionDetail;
import de.metas.material.dispo.commons.candidate.businesscase.ProductionDetail.ProductionDetailBuilder;
import de.metas.material.dispo.model.I_MD_Candidate;
import de.metas.material.dispo.model.I_MD_Candidate_Prod_Detail;
import de.metas.material.event.pporder.PPOrderRef;
import de.metas.util.InSetPredicate;
import de.metas.util.Services;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import org.adempiere.ad.dao.IQueryBL;
import org.adempiere.ad.dao.IQueryBuilder;
import org.eevolution.api.PPOrderBOMLineId;
import org.eevolution.api.PPOrderId;

import javax.annotation.Nullable;

/*
 * #%L
 * metasfresh-material-dispo-commons
 * %%
 * Copyright (C) 2018 metas GmbH
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

@Value
@Builder
public class ProductionDetailsQuery
{
	public static final ProductionDetailsQuery NO_PRODUCTION_DETAIL = ProductionDetailsQuery.builder()
			.productPlanningId(-10)
			.productBomLineId(-10)
			.ppOrderId(null)
			.ppOrderLineIds(InSetPredicate.any())
			.build();

	public static ProductionDetailsQuery ofProductionDetailOrNull(
			@Nullable final ProductionDetail productionDetail)
	{
		if (productionDetail == null)
		{
			return null;
		}

		return ProductionDetailsQuery.builder()
				.productPlanningId(productionDetail.getProductPlanningId())
				.productBomLineId(productionDetail.getProductBomLineId())
				.ppOrderId(productionDetail.getPpOrderId())
				.ppOrderLineIds(InSetPredicate.onlyOrAny(productionDetail.getPpOrderBOMLineId()))
				.ppOrderCandidateId(productionDetail.getPpOrderCandidateId())
				.build();
	}

	int productPlanningId;
	int productBomLineId;

	@Nullable PPOrderId ppOrderId;
	@NonNull @Builder.Default InSetPredicate<PPOrderBOMLineId> ppOrderLineIds = InSetPredicate.any();
	int ppOrderCandidateId;
	int ppOrderCandidateLineId;

	/**
	 * Convenience method that uses this instance to kickstart an return a builder.
	 */
	public ProductionDetailBuilder toProductionDetailBuilder()
	{
		return ProductionDetail.builder()
				.productPlanningId(productPlanningId)
				.productBomLineId(productBomLineId)
				.ppOrderRef(toPPOrderRef());
	}

	@Nullable
	private PPOrderRef toPPOrderRef()
	{
		if (ppOrderCandidateId <= 0 && ppOrderId == null)
		{
			return null;
		}

		return PPOrderRef.builder()
				.ppOrderCandidateId(ppOrderCandidateId)
				.ppOrderLineCandidateId(ppOrderCandidateLineId)
				.ppOrderId(ppOrderId)
				.build();
	}

	public void augmentQueryBuilder(@NonNull final IQueryBuilder<I_MD_Candidate> builder)
	{
		final IQueryBL queryBL = Services.get(IQueryBL.class);

		final IQueryBuilder<I_MD_Candidate_Prod_Detail> productDetailSubQueryBuilder = queryBL
				.createQueryBuilder(I_MD_Candidate_Prod_Detail.class)
				.addOnlyActiveRecordsFilter();

		if (ProductionDetailsQuery.NO_PRODUCTION_DETAIL.equals(this))
		{
			builder.addNotInSubQueryFilter(I_MD_Candidate.COLUMN_MD_Candidate_ID,
					I_MD_Candidate_Prod_Detail.COLUMN_MD_Candidate_ID,
					productDetailSubQueryBuilder.create());
		}
		else
		{
			boolean doFilter = false;
			if (productPlanningId > 0)
			{
				productDetailSubQueryBuilder.addEqualsFilter(I_MD_Candidate_Prod_Detail.COLUMN_PP_Product_Planning_ID, productPlanningId);
				doFilter = true;
			}
			if (productBomLineId > 0)
			{
				productDetailSubQueryBuilder.addEqualsFilter(I_MD_Candidate_Prod_Detail.COLUMN_PP_Product_BOMLine_ID, productBomLineId);
				doFilter = true;
			}
			if (ppOrderId != null)
			{
				productDetailSubQueryBuilder.addEqualsFilter(I_MD_Candidate_Prod_Detail.COLUMN_PP_Order_ID, ppOrderId);
				doFilter = true;
			}

			if (ppOrderLineIds.isOnly())
			{
				productDetailSubQueryBuilder.addInArrayFilter(I_MD_Candidate_Prod_Detail.COLUMNNAME_PP_Order_BOMLine_ID, ppOrderLineIds.toSet());
				doFilter = true;
			}

			if (ppOrderCandidateId > 0)
			{
				productDetailSubQueryBuilder.addEqualsFilter(I_MD_Candidate_Prod_Detail.COLUMNNAME_PP_Order_Candidate_ID, ppOrderCandidateId);
				doFilter = true;
			}
			if (ppOrderCandidateLineId > 0)
			{
				productDetailSubQueryBuilder.addEqualsFilter(I_MD_Candidate_Prod_Detail.COLUMNNAME_PP_OrderLine_Candidate_ID, ppOrderCandidateLineId);
				doFilter = true;
			}
			else if (ppOrderLineIds.isNone())
			{
				productDetailSubQueryBuilder.addEqualsFilter(I_MD_Candidate_Prod_Detail.COLUMNNAME_PP_Order_BOMLine_ID, null);
				doFilter = true;
			}

			if (doFilter)
			{
				builder.addInSubQueryFilter(I_MD_Candidate.COLUMN_MD_Candidate_ID,
						I_MD_Candidate_Prod_Detail.COLUMN_MD_Candidate_ID,
						productDetailSubQueryBuilder.create());
			}
		}
	}
}
