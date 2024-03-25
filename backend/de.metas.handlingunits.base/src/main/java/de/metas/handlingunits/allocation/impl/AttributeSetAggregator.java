package de.metas.handlingunits.allocation.impl;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.adempiere.mm.attributes.AttributeCode;
import org.adempiere.mm.attributes.AttributeValueType;
import org.adempiere.mm.attributes.api.IAttributeSet;
import org.compiere.model.I_M_Attribute;

import java.util.HashMap;
import java.util.HashSet;

class AttributeSetAggregator
{
	private final HashMap<AttributeCode, AttributeAggregator> attributeAggregators = new HashMap<>();

	void collect(@NonNull final IAttributeSet from)
	{
		for (final I_M_Attribute attribute : from.getAttributes())
		{
			getAttributeAggregator(attribute).collect(from);
		}
	}

	@NonNull
	private AttributeAggregator getAttributeAggregator(final I_M_Attribute attribute)
	{
		return attributeAggregators.computeIfAbsent(
				AttributeCode.ofString(attribute.getValue()),
				attributeCode -> new AttributeAggregator(attributeCode, AttributeValueType.ofCode(attribute.getAttributeValueType()))
		);
	}

	void updateAggregatedValuesTo(@NonNull final IAttributeSet to)
	{
		attributeAggregators.values()
				.forEach(attributeAggregator -> attributeAggregator.updateAggregatedValueTo(to));
	}

	//
	//
	//

	@RequiredArgsConstructor
	private static class AttributeAggregator
	{
		private final AttributeCode attributeCode;
		private final AttributeValueType attributeValueType;
		private final HashSet<Object> values = new HashSet<>();

		void collect(@NonNull final IAttributeSet from)
		{
			final Object value = attributeValueType.map(new AttributeValueType.CaseMapper<Object>()
			{
				@Override
				public Object string() {return from.getValueAsString(attributeCode);}

				@Override
				public Object number() {return from.getValueAsBigDecimal(attributeCode);}

				@Override
				public Object date() {return from.getValueAsDate(attributeCode);}

				@Override
				public Object list() {return from.getValueAsString(attributeCode);}
			});

			values.add(value);
		}

		void updateAggregatedValueTo(@NonNull final IAttributeSet to)
		{
			if (values.size() == 1 && to.hasAttribute(attributeCode))
			{
				to.setValue(attributeCode, values.iterator().next());
			}
		}
	}
}
