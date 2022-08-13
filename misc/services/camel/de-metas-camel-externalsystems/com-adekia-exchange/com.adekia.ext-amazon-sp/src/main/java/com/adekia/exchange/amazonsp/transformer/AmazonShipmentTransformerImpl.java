/*
 * #%L
 * ext-metasfresh
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

package com.adekia.exchange.amazonsp.transformer;

import com.adekia.exchange.amazonsp.util.AmazonShipment;
import com.adekia.exchange.sender.ShipmentSender;
import com.adekia.exchange.transformer.ShipmentTransformer;
import oasis.names.specification.ubl.schema.xsd.despatchadvice_23.DespatchAdviceType;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression(value = "'${shipment.sender}' matches '.*amazon.*'")
public class AmazonShipmentTransformerImpl implements ShipmentTransformer
{

    @Override
    public Object transform(final DespatchAdviceType despatchAdvice) throws Exception {
        if (despatchAdvice == null)
            return null;        // todo best behaviour ?

        return AmazonShipment.fromDespatch(despatchAdvice);

    }
}
