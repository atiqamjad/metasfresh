package de.metas.handlingunits.picking.candidate.commands;

import com.google.common.collect.ImmutableList;
import de.metas.bpartner.BPartnerLocationId;
import de.metas.common.util.time.SystemTime;
import de.metas.handlingunits.HuId;
import de.metas.handlingunits.HuPackingInstructionsId;
import de.metas.handlingunits.HuPackingInstructionsItemId;
import de.metas.handlingunits.IHUCapacityBL;
import de.metas.handlingunits.IHUContext;
import de.metas.handlingunits.IHUPIItemProductBL;
import de.metas.handlingunits.IHandlingUnitsBL;
import de.metas.handlingunits.allocation.IHUProducerAllocationDestination;
import de.metas.handlingunits.allocation.impl.AllocationUtils;
import de.metas.handlingunits.allocation.impl.HUListAllocationSourceDestination;
import de.metas.handlingunits.allocation.impl.HULoader;
import de.metas.handlingunits.allocation.impl.HUProducerDestination;
import de.metas.handlingunits.allocation.transfer.impl.LUTUProducerDestination;
import de.metas.handlingunits.inventory.CreateVirtualInventoryWithQtyReq;
import de.metas.handlingunits.inventory.InventoryService;
import de.metas.handlingunits.model.I_M_HU;
import de.metas.handlingunits.model.I_M_HU_PI_Item_Product;
import de.metas.handlingunits.model.X_M_HU;
import de.metas.handlingunits.picking.PackToSpec;
import de.metas.handlingunits.storage.IHUStorage;
import de.metas.organization.OrgId;
import de.metas.product.ProductId;
import de.metas.quantity.Capacity;
import de.metas.quantity.Quantity;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import org.adempiere.exceptions.AdempiereException;
import org.adempiere.mm.attributes.AttributeSetInstanceId;
import org.adempiere.model.PlainContextAware;
import org.adempiere.service.ClientId;
import org.adempiere.util.lang.impl.TableRecordReference;
import org.adempiere.warehouse.LocatorId;
import org.compiere.model.I_C_UOM;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PackToHUsProducer
{
	private final IHandlingUnitsBL handlingUnitsBL;
	private final IHUPIItemProductBL huPIItemProductBL;
	private final IHUCapacityBL huCapacityBL;
	private final InventoryService inventoryService;

	// Params
	private final boolean alwaysPackEachCandidateInItsOwnHU;

	// State
	private static final int PACKAGE_NO_ZERO = 0;
	private final AtomicInteger nextPackageNo = new AtomicInteger(100);
	private final HashMap<PackToInfo, IHUProducerAllocationDestination> packToDestinations = new HashMap<>();

	@Builder
	private PackToHUsProducer(
			@NonNull final IHandlingUnitsBL handlingUnitsBL,
			@NonNull final IHUPIItemProductBL huPIItemProductBL,
			@NonNull final IHUCapacityBL huCapacityBL,
			@NonNull InventoryService inventoryService,
			//
			final boolean alwaysPackEachCandidateInItsOwnHU)
	{
		this.handlingUnitsBL = handlingUnitsBL;
		this.huPIItemProductBL = huPIItemProductBL;
		this.huCapacityBL = huCapacityBL;
		this.inventoryService = inventoryService;

		this.alwaysPackEachCandidateInItsOwnHU = alwaysPackEachCandidateInItsOwnHU;
	}

	public List<I_M_HU> packToHU(
			@NonNull final IHUContext huContext,
			@NonNull final HuId pickFromHUId,
			@NonNull final PackToInfo packToInfo,
			@NonNull final ProductId productId,
			@NonNull final Quantity qtyPicked,
			@NonNull final TableRecordReference documentRef,
			final boolean checkIfAlreadyPacked,
			final boolean createInventoryForMissingQty)
	{
		final List<I_M_HU> pickFromHUs;
		if (createInventoryForMissingQty)
		{
			final I_M_HU pickFromHU = handlingUnitsBL.getById(pickFromHUId);
			final IHUStorage pickFromHUStorage = huContext.getHUStorageFactory().getStorage(pickFromHU);
			final Quantity huQty = pickFromHUStorage.getQuantity(productId, qtyPicked.getUOM());

			pickFromHUs = new ArrayList<>();
			final Quantity qtyMissing;
			if (huQty.signum() <= 0)
			{
				qtyMissing = qtyPicked;
			}
			else
			{
				qtyMissing = qtyPicked.subtract(huQty).toZeroIfNegative();
				pickFromHUs.add(pickFromHU);
			}

			if (qtyMissing.signum() > 0)
			{
				final HuId newHuId = inventoryService.createInventoryForMissingQty(CreateVirtualInventoryWithQtyReq.builder()
						.clientId(ClientId.ofRepoId(pickFromHU.getAD_Client_ID()))
						.orgId(OrgId.ofRepoId(pickFromHU.getAD_Org_ID()))
						.warehouseId(packToInfo.getShipFromLocatorId().getWarehouseId())
						.productId(productId)
						.qty(qtyMissing)
						.movementDate(SystemTime.asZonedDateTime())
						.attributeSetInstanceId(AttributeSetInstanceId.NONE)
						.build());

				final I_M_HU newHU = handlingUnitsBL.getById(newHuId);
				pickFromHUs.add(newHU);
			}
		}
		else
		{
			final I_M_HU pickFromHU = handlingUnitsBL.getById(pickFromHUId);
			pickFromHUs = ImmutableList.of(pickFromHU);
		}

		//
		// Case: the PickFrom HU can be considered already packed
		// i.e. it's an HU with exactly required qty and same packing instructions
		if (checkIfAlreadyPacked
				&& pickFromHUs.size() == 1
				&& huContext.getHUStorageFactory().getStorage(pickFromHUs.get(0)).isSingleProductWithQtyEqualsTo(productId, qtyPicked)
				&& HuPackingInstructionsId.equals(packToInfo.getPackingInstructionsId(), handlingUnitsBL.getPackingInstructionsId(pickFromHUs.get(0))))

		{
			final I_M_HU pickFromHU = pickFromHUs.get(0);
			handlingUnitsBL.setHUStatus(pickFromHU, PlainContextAware.newWithThreadInheritedTrx(), X_M_HU.HUSTATUS_Picked);
			return ImmutableList.of(pickFromHU);
		}
		//
		// Case: We have to split out and pack our HU
		else
		{
			final IHUProducerAllocationDestination packToDestination;
			HULoader.builder()
					.source(HUListAllocationSourceDestination.of(pickFromHUs).setDestroyEmptyHUs(true))
					.destination(packToDestination = getPackToDestination(packToInfo))
					.load(AllocationUtils.builder()
							.setHUContext(huContext)
							.setProduct(productId)
							.setQuantity(qtyPicked)
							.setFromReferencedTableRecord(documentRef)
							.setForceQtyAllocation(true)
							.create());

			return packToDestination.getCreatedHUs();
		}
	}

	public PackToInfo extractPackToInfo(
			@NonNull final PackToSpec packToSpec,
			@NonNull final BPartnerLocationId shipToBPLocationId,
			@NonNull final LocatorId shipFromLocatorId)
	{
		final HuPackingInstructionsId packingInstructionsId;
		final Capacity tuCapacity;
		if (packToSpec.isVirtual())
		{
			packingInstructionsId = HuPackingInstructionsId.VIRTUAL;
			tuCapacity = null;
		}
		else if (packToSpec.getTuPackingInstructionsId() != null)
		{
			final I_M_HU_PI_Item_Product tuPIItemProduct = huPIItemProductBL.getById(packToSpec.getTuPackingInstructionsId());
			final HuPackingInstructionsItemId piItemId = HuPackingInstructionsItemId.ofRepoId(tuPIItemProduct.getM_HU_PI_Item_ID());
			packingInstructionsId = handlingUnitsBL.getPackingInstructionsId(piItemId);
			tuCapacity = getCapacity(tuPIItemProduct);
		}
		else if (packToSpec.getGenericPackingInstructionsId() != null)
		{
			packingInstructionsId = packToSpec.getGenericPackingInstructionsId();
			tuCapacity = null;
		}
		else
		{
			throw new AdempiereException("Unsupported pack to spec: " + packToSpec);
		}

		final int packageNo = isPackEachCandidateInItsOwnHU(packingInstructionsId) ? nextPackageNo.getAndIncrement() : PACKAGE_NO_ZERO;

		return PackToInfo.builder()
				.shipToBPLocationId(shipToBPLocationId)
				.shipFromLocatorId(shipFromLocatorId)
				.packingInstructionsId(packingInstructionsId)
				.tuCapacity(tuCapacity)
				.packageNo(packageNo)
				.build();
	}

	private boolean isPackEachCandidateInItsOwnHU(final HuPackingInstructionsId packingInstructionsId)
	{
		return this.alwaysPackEachCandidateInItsOwnHU
				|| packingInstructionsId.isVirtual(); // if we deal with virtual handling units, pack each candidate individually (in a new VHU).
	}

	private Capacity getCapacity(@NonNull final I_M_HU_PI_Item_Product tuPIItemProduct)
	{
		final ProductId productId = ProductId.optionalOfRepoId(tuPIItemProduct.getM_Product_ID())
				.orElseThrow(() -> new AdempiereException("Product shall be set for " + tuPIItemProduct));

		final I_C_UOM uom = IHUPIItemProductBL.extractUOMOrNull(tuPIItemProduct);
		if (uom == null)
		{
			throw new AdempiereException("Cannot determine the UOM of " + tuPIItemProduct);
		}

		return huCapacityBL.getCapacity(tuPIItemProduct, productId, uom);
	}

	public IHUProducerAllocationDestination getPackToDestination(final PackToInfo packToInfo)
	{
		return packToDestinations.computeIfAbsent(packToInfo, this::createPackToDestination);
	}

	private IHUProducerAllocationDestination createPackToDestination(final PackToInfo packToInfo)
	{
		@NonNull final HuPackingInstructionsId packingInstructionsId = packToInfo.getPackingInstructionsId();
		if (packingInstructionsId.isVirtual())
		{
			final HUProducerDestination vhuProducer = HUProducerDestination.ofVirtualPI();
			setupPackToDestinationCommonOptions(vhuProducer, packToInfo);
			vhuProducer.setMaxHUsToCreate(1);
			return vhuProducer;
		}
		else if (packToInfo.getTuCapacity() != null)
		{
			final LUTUProducerDestination tuProducer = new LUTUProducerDestination();
			setupPackToDestinationCommonOptions(tuProducer, packToInfo);

			tuProducer.setNoLU();
			tuProducer.setTUPI(handlingUnitsBL.getPI(packingInstructionsId));
			tuProducer.addCUPerTU(packToInfo.getTuCapacity());

			return tuProducer;
		}
		else
		{
			final HUProducerDestination huProducer = HUProducerDestination.of(packingInstructionsId);
			setupPackToDestinationCommonOptions(huProducer, packToInfo);
			huProducer.setMaxHUsToCreate(1);
			return huProducer;
		}
	}

	private static void setupPackToDestinationCommonOptions(@NonNull final IHUProducerAllocationDestination producer, @NonNull final PackToInfo packToInfo)
	{
		producer.setHUStatus(X_M_HU.HUSTATUS_Picked);
		producer.setBPartnerAndLocationId(packToInfo.getShipToBPLocationId());
		producer.setLocatorId(packToInfo.getShipFromLocatorId());
	}

	//
	//
	// ------------------------------------
	//
	//
	@Value
	@Builder
	public static class PackToInfo
	{
		@NonNull BPartnerLocationId shipToBPLocationId;
		@NonNull LocatorId shipFromLocatorId;

		@NonNull HuPackingInstructionsId packingInstructionsId;
		@Nullable Capacity tuCapacity;
		int packageNo;
	}
}
