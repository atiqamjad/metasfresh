package de.metas.purchasecandidate;

import java.time.LocalDateTime;

import org.adempiere.mm.attributes.AttributeSetInstanceId;
import org.adempiere.service.OrgId;
import org.adempiere.warehouse.WarehouseId;

import de.metas.money.Currency;
import de.metas.product.ProductId;
import de.metas.quantity.Quantity;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

/*
 * #%L
 * metasfresh-webui-api
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
public class PurchaseDemand
{
	@NonNull
	PurchaseDemandId id;

	@NonNull
	OrgId orgId;
	WarehouseId warehouseId;

	@NonNull
	ProductId productId;
	AttributeSetInstanceId attributeSetInstanceId;

	Quantity qtyToDeliverTotal;
	@NonNull
	Quantity qtyToDeliver;

	@NonNull
	Currency currency;

	@NonNull
	LocalDateTime datePromised;
	LocalDateTime preparationDate;

	public int getUOMId()
	{
		return qtyToDeliver.getUOMId();
	}
}
