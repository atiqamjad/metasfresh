/*
 * #%L
 * de.metas.contracts
 * %%
 * Copyright (C) 2023 metas GmbH
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

package de.metas.contracts.modular.process;

import com.google.common.collect.ImmutableSet;
import de.metas.contracts.FlatrateTermId;
import de.metas.contracts.flatrate.TypeConditions;
import de.metas.contracts.model.I_C_Flatrate_Term;
import de.metas.contracts.model.I_ModCntr_Module;
import de.metas.contracts.model.I_ModCntr_Specific_Price;
import de.metas.contracts.modular.ComputingMethodType;
import de.metas.contracts.modular.ModCntrSpecificPrice;
import de.metas.contracts.modular.ModCntrSpecificPriceId;
import de.metas.contracts.modular.ModularContractPriceService;
import de.metas.contracts.modular.log.ModCntrLogPriceUpdateRequest;
import de.metas.contracts.modular.log.ModularContractLogService;
import de.metas.contracts.modular.settings.ModularContractSettingsService;
import de.metas.contracts.modular.settings.ModularContractTypeId;
import de.metas.contracts.modular.workpackage.ModularContractLogHandlerRegistry;
import de.metas.document.engine.DocStatus;
import de.metas.money.CurrencyId;
import de.metas.money.Money;
import de.metas.process.IProcessPrecondition;
import de.metas.process.IProcessPreconditionsContext;
import de.metas.process.JavaProcess;
import de.metas.process.Param;
import de.metas.process.ProcessPreconditionsResolution;
import de.metas.product.ProductId;
import de.metas.uom.UomId;
import de.metas.util.Services;
import lombok.NonNull;
import org.adempiere.ad.dao.IQueryBL;
import org.adempiere.ad.dao.IQueryBuilder;
import org.adempiere.ad.dao.IQueryFilter;
import org.compiere.SpringContextHolder;
import org.compiere.model.IQuery;

import java.math.BigDecimal;
import java.util.Set;

public class ModCntr_Specific_Price_Update_Selection extends JavaProcess implements IProcessPrecondition
{
	@NonNull private final ModularContractLogService contractLogService = SpringContextHolder.instance.getBean(ModularContractLogService.class);
	@NonNull private final ModularContractPriceService modularContractPriceService = SpringContextHolder.instance.getBean(ModularContractPriceService.class);
	@NonNull private final ModularContractLogHandlerRegistry logHandlerRegistry = SpringContextHolder.instance.getBean(ModularContractLogHandlerRegistry.class);
	@NonNull private final ModularContractSettingsService modularContractSettingsService = SpringContextHolder.instance.getBean(ModularContractSettingsService.class);
	@NonNull private final IQueryBL queryBL = Services.get(IQueryBL.class);

	@Param(parameterName = "M_Product_ID")
	private ProductId p_M_Product_ID;

	@Param(parameterName = "ModCntr_Type_ID")
	private ModularContractTypeId p_ModCntr_Type_ID;

	@Param(parameterName = "Price")
	private BigDecimal p_price;

	@Param(parameterName = "MinValue")
	private BigDecimal p_minValue;

	@Param(parameterName = "Price_Old")
	private BigDecimal p_Price_Old;

	@Param(parameterName = "C_UOM_ID")
	private UomId p_C_UOM_ID;

	@Param(parameterName = "C_Currency_ID")
	private CurrencyId p_C_Currency_ID;

	@Override
	public ProcessPreconditionsResolution checkPreconditionsApplicable(final @NonNull IProcessPreconditionsContext context)
	{
		final IQueryFilter<I_C_Flatrate_Term> flatrateTermFilter = context.getQueryFilter(I_C_Flatrate_Term.class);

		queryBL.createQueryBuilder(I_C_Flatrate_Term.class)
				.filter(flatrateTermFilter)
				.addEqualsFilter(I_C_Flatrate_Term.COLUMNNAME_Type_Conditions, TypeConditions.MODULAR_CONTRACT.getCode())
				.addEqualsFilter(I_C_Flatrate_Term.COLUMNNAME_DocStatus, DocStatus.Completed)
				.addEqualsFilter(I_C_Flatrate_Term.COLUMNNAME_C_Currency_ID, DocStatus.Completed)
				.create();

		return ProcessPreconditionsResolution.accept();
	}

	@Override
	protected String doIt()
	{
		retrieveContractSpecificPricesFromSelection().stream()
				.forEach(this::updatePrice);

		return MSG_OK;
	}

	public ImmutableSet<ModCntrSpecificPriceId> retrieveContractSpecificPricesFromSelection()
	{
		final IQueryBuilder<I_ModCntr_Specific_Price> queryBuilder = queryBL.createQueryBuilder(I_ModCntr_Specific_Price.class)
				.addOnlyActiveRecordsFilter()
				.addEqualsFilter(I_ModCntr_Specific_Price.COLUMNNAME_M_Product_ID, p_M_Product_ID)
				.addEqualsFilter(I_ModCntr_Specific_Price.COLUMNNAME_C_UOM_ID, p_C_UOM_ID)
				.addInArrayFilter(I_ModCntr_Specific_Price.COLUMNNAME_C_Flatrate_Term_ID, getSelectedContracts())
				.addEqualsFilter(I_ModCntr_Specific_Price.COLUMNNAME_C_Currency_ID, p_C_Currency_ID);

		if (p_ModCntr_Type_ID != null)
		{

			final IQuery<I_ModCntr_Module> modules = queryBL.createQueryBuilder(I_ModCntr_Module.class)
					.addOnlyActiveRecordsFilter()
					.addEqualsFilter(I_ModCntr_Module.COLUMNNAME_ModCntr_Type_ID, p_ModCntr_Type_ID)
					.create();

			queryBuilder
					.addInSubQueryFilter()
					.matchingColumnNames(I_ModCntr_Specific_Price.COLUMNNAME_ModCntr_Module_ID, I_ModCntr_Module.COLUMNNAME_ModCntr_Module_ID)
					.subQuery(modules)
					.end();

			if (modularContractSettingsService.isMatchingComputingMethodType(p_ModCntr_Type_ID, ComputingMethodType.AverageAddedValueOnShippedQuantity))
			{
				queryBuilder.addEqualsFilter(I_ModCntr_Specific_Price.COLUMNNAME_MinValue, p_minValue)
						.addEqualsFilter(I_ModCntr_Specific_Price.COLUMNNAME_Price, p_Price_Old)
						.addEqualsFilter(I_ModCntr_Specific_Price.COLUMNNAME_IsScalePrice, true);
			}
			else
			{
				queryBuilder
						.addEqualsFilter(I_ModCntr_Specific_Price.COLUMNNAME_IsScalePrice, false);
			}
		}
		else
		{
			queryBuilder
					.addEqualsFilter(I_ModCntr_Specific_Price.COLUMNNAME_IsScalePrice, false);
		}

		return queryBuilder
				.create()
				.listIds(ModCntrSpecificPriceId::ofRepoId);

	}

	private Set<FlatrateTermId> getSelectedContracts()
	{
		return queryBL.createQueryBuilder(I_C_Flatrate_Term.class)
				.addFilter(getProcessInfo().getQueryFilterOrElseFalse())
				.create()
				.listIds(FlatrateTermId::ofRepoId);
	}

	private void updatePrice(final ModCntrSpecificPriceId contractPriceId)
	{
		ModCntrSpecificPrice newContractPrice = modularContractPriceService.updateById(contractPriceId, contractPrice -> contractPrice.toBuilder()
				.amount(Money.of(p_price, p_C_Currency_ID))
				.uomId(p_C_UOM_ID)
				.minValue(p_minValue)
				.build());

		contractLogService.updatePriceAndAmount(ModCntrLogPriceUpdateRequest.builder()
						.unitPrice(newContractPrice.getProductPrice())
						.flatrateTermId(newContractPrice.flatrateTermId())
						.modularContractModuleId(newContractPrice.modularContractModuleId())
						.build(),
				logHandlerRegistry);
	}

}
