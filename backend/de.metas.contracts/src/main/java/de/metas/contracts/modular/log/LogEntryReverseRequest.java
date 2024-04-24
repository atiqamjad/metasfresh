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

package de.metas.contracts.modular.log;

import de.metas.contracts.FlatrateTermId;
import de.metas.contracts.modular.settings.ModularContractTypeId;
import lombok.Builder;
import lombok.NonNull;
import org.adempiere.exceptions.AdempiereException;
import org.adempiere.util.lang.impl.TableRecordReference;

import javax.annotation.Nullable;

@Builder(toBuilder = true)
public record LogEntryReverseRequest(
		@Nullable ModularContractLogEntryId id,
		@Nullable TableRecordReference referencedModel,
		@Nullable FlatrateTermId flatrateTermId,
		@Nullable String description,
		@NonNull LogEntryContractType logEntryContractType,
		@NonNull ModularContractTypeId modularContractTypeId)
{
	public LogEntryReverseRequest
	{
		if (id == null && referencedModel == null)
		{
			throw new AdempiereException("LogEntryReverseRequest - either an ID or a tableRecordReference must be present.");
		}
	}
}
