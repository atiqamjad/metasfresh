/*
 * #%L
 * de-metas-common-ordercandidates
 * %%
 * Copyright (C) 2021 metas GmbH
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

package de.metas.common.ordercandidates.v2.request;

import de.pentabyte.springfox.ApiEnum;

public enum JsonApplySalesRepFrom
{
	@ApiEnum("The sales partner set in the order candidate is forwarded to both the order and the business partner master data.")
	Candidate,
	@ApiEnum("The sales partner set in the order candidate is for information purposes only. The internal sales partner from the master data is always forwarded to the order.")
	BPartner,
	@ApiEnum("Like \"Dispo\", but if the sales partner set in the order candidate is \"empty\", then the internal sales partner is used.")
	CandidateFirst
}
