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

package de.metas.contracts.modular.computing.purchasecontract.subtractedvalue.interim;

import de.metas.contracts.modular.ModularContractService;
import de.metas.contracts.modular.invgroup.interceptor.ModCntrInvoicingGroupRepository;
import de.metas.contracts.modular.log.LogEntryContractType;
import de.metas.contracts.modular.log.ModularContractLogDAO;
import de.metas.contracts.modular.log.ModularContractLogEntry;
import de.metas.contracts.modular.log.ModularContractLogService;
import de.metas.contracts.modular.workpackage.impl.AbstractInterimInvoiceLineLog;
import de.metas.product.ProductPrice;
import de.metas.util.Check;
import lombok.Getter;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import javax.annotation.Nullable;

@Component
@Getter
public class InterimInvoiceLineLog extends AbstractInterimInvoiceLineLog
{
	@NonNull private final LogEntryContractType logEntryContractType = LogEntryContractType.MODULAR_CONTRACT;

	private final SVInterimComputingMethod computingMethod;

	public InterimInvoiceLineLog(
			@NonNull final ModularContractService modularContractService,
			@NonNull final ModularContractLogDAO contractLogDAO,
			@NonNull final ModularContractLogService modularContractLogService,
			@NonNull final ModCntrInvoicingGroupRepository modCntrInvoicingGroupRepository,
			@NonNull final SVInterimComputingMethod computingMethod)
	{
		super(modularContractService, contractLogDAO, modularContractLogService, modCntrInvoicingGroupRepository);
		this.computingMethod = computingMethod;
	}

	protected int getMultiplier(final @NonNull CreateLogRequest createLogRequest)
	{
		return -1 * super.getMultiplier(createLogRequest);
	}

	public @Nullable ProductPrice getPriceActual(final @NonNull ModularContractLogEntry logEntry)
	{
		final ProductPrice priceActual = super.getPriceActual(logEntry);
		Check.assumeNotNull(priceActual, "PriceActual shouldn't be null");
		return priceActual.negate();
	}
}
