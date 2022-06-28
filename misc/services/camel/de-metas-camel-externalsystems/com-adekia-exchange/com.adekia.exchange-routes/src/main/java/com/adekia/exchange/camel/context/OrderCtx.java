/*
 * #%L
 * camel-routes
 * %%
 * Copyright (C) 2022 Adekia
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

package com.adekia.exchange.camel.context;

import com.adekia.exchange.context.Ctx;
import lombok.Builder;
import lombok.Data;
import oasis.names.specification.ubl.schema.xsd.order_23.OrderType;

import java.util.Map;

@Data
public class OrderCtx extends Ctx {
    @Builder
    public OrderCtx(Map<String, String> properties, final OrderType order) {
        super(properties);
        this.order = order;
    }

    public static String CAMEL_PROPERTY_NAME = "camelProperty";

    private OrderType order;
}
