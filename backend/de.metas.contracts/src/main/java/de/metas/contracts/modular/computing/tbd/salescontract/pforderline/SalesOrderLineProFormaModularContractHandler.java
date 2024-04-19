/*
 * #%L
 * de.metas.contracts
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

package de.metas.contracts.modular.computing.tbd.salescontract.pforderline;

import de.metas.contracts.FlatrateTermId;
import de.metas.contracts.IFlatrateBL;
import de.metas.contracts.flatrate.TypeConditions;
import de.metas.contracts.modular.ComputingMethodType;
import de.metas.contracts.modular.computing.ComputingRequest;
import de.metas.contracts.modular.computing.ComputingResponse;
import de.metas.contracts.modular.computing.IComputingMethodHandler;
import de.metas.contracts.modular.log.LogEntryContractType;
import de.metas.lang.SOTrx;
import de.metas.order.IOrderBL;
import de.metas.order.IOrderLineBL;
import de.metas.order.OrderId;
import de.metas.order.OrderLineId;
import de.metas.util.Services;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.adempiere.util.lang.impl.TableRecordReference;
import org.compiere.model.I_C_Order;
import org.compiere.model.I_C_OrderLine;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

import static de.metas.contracts.modular.ComputingMethodType.SALES_ORDER_LINE_PRO_FORMA_MODULAR_DEPRECATED;

/**
 * @deprecated If needed, please move/use code in the new computing methods in package de.metas.contracts.modular.computing.salescontract
 */
@Deprecated
@Component
@RequiredArgsConstructor
public class SalesOrderLineProFormaModularContractHandler implements IComputingMethodHandler
{
	private final IOrderBL orderBL = Services.get(IOrderBL.class);
	private final IOrderLineBL orderLineBL = Services.get(IOrderLineBL.class);
	private final IFlatrateBL flatrateBL = Services.get(IFlatrateBL.class);

	@Override
	public boolean applies(@NonNull final TableRecordReference recordRef, @NonNull final LogEntryContractType logEntryContractType)
	{
		if (recordRef.getTableName().equals(I_C_OrderLine.Table_Name) && logEntryContractType.isModularContractType())
		{
			final I_C_OrderLine orderLineRecord = orderLineBL.getOrderLineById(OrderLineId.ofRepoId(recordRef.getRecord_ID()));
			final I_C_Order orderRecord = orderBL.getById(OrderId.ofRepoId(orderLineRecord.getC_Order_ID()));

			return SOTrx.ofBoolean(orderRecord.isSOTrx()).isSales() && orderBL.isProFormaSO(orderRecord);
		}
		return false;
	}

	@Override
	public @NonNull Stream<FlatrateTermId> streamContractIds(@NonNull final TableRecordReference recordRef)
	{
		if (recordRef.getTableName().equals(I_C_OrderLine.Table_Name))
		{
			final I_C_OrderLine orderLineRecord = orderLineBL.getOrderLineById(OrderLineId.ofRepoId(recordRef.getRecord_ID()));
			final I_C_Order order = orderBL.getById(OrderId.ofRepoId(orderLineRecord.getC_Order_ID()));
			if (!order.isSOTrx())
			{
				return Stream.empty();
			}

			return flatrateBL.getByOrderLineId(OrderLineId.ofRepoId(orderLineRecord.getC_OrderLine_ID()), TypeConditions.MODULAR_CONTRACT)
					.map(flatrateTerm -> FlatrateTermId.ofRepoId(flatrateTerm.getC_Flatrate_Term_ID()))
					.stream();
		}
		return Stream.empty();

	}

	@Override
	public @NonNull ComputingResponse compute(final @NonNull ComputingRequest request)
	{
		return null;
	}

	@Override
	public @NonNull ComputingMethodType getComputingMethodType()
	{
		return SALES_ORDER_LINE_PRO_FORMA_MODULAR_DEPRECATED;
	}
}
