package de.metas.ui.web.process.descriptor;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import org.adempiere.util.Check;

import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

import de.metas.i18n.ITranslatableString;
import de.metas.i18n.ImmutableTranslatableString;
import de.metas.ui.web.process.ProcessId;
import de.metas.ui.web.window.descriptor.DocumentEntityDescriptor;
import de.metas.ui.web.window.descriptor.DocumentFieldDescriptor;
import de.metas.ui.web.window.descriptor.DocumentLayoutElementDescriptor;
import de.metas.ui.web.window.descriptor.DocumentLayoutElementFieldDescriptor;

/*
 * #%L
 * metasfresh-webui-api
 * %%
 * Copyright (C) 2016 metas GmbH
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

public class ProcessLayout
{
	public static final Builder builder()
	{
		return new Builder();
	}

	public static enum ProcessLayoutType
	{
		Panel("panel"), SingleOverlayField("singleOverlayField");

		private final String json;

		private ProcessLayoutType(final String json)
		{
			this.json = json;
		}

		@JsonValue
		public String toJson()
		{
			return json;
		}
	};

	private final ProcessId processId;

	private final ProcessLayoutType layoutType;

	private final ITranslatableString caption;
	private final ITranslatableString description;

	private final List<DocumentLayoutElementDescriptor> elements;

	private ProcessLayout(final Builder builder)
	{
		super();

		Preconditions.checkNotNull(builder.processId, "processId not set: %s", builder);
		processId = builder.processId;

		Preconditions.checkNotNull(builder.layoutType, "layoutType not set: %s", builder);
		layoutType = builder.layoutType;

		caption = builder.caption != null ? builder.caption : ImmutableTranslatableString.empty();
		description = builder.description != null ? builder.description : ImmutableTranslatableString.empty();
		elements = ImmutableList.copyOf(builder.elements);
	}

	@Override
	public String toString()
	{
		return MoreObjects.toStringHelper(this)
				.omitNullValues()
				.add("processId", processId)
				.add("caption", caption)
				.add("elements", elements.isEmpty() ? null : elements)
				.toString();
	}

	public ProcessLayoutType getLayoutType()
	{
		return layoutType;
	}

	public ITranslatableString getCaption()
	{
		return caption;
	}

	public String getCaption(final String adLanguage)
	{
		return caption.translate(adLanguage);
	}

	public ITranslatableString getDescription()
	{
		return description;
	}

	public String getDescription(final String adLanguage)
	{
		return description.translate(adLanguage);
	}

	public List<DocumentLayoutElementDescriptor> getElements()
	{
		return elements;
	}

	public static final class Builder
	{
		private ProcessId processId;
		private ProcessLayoutType layoutType = ProcessLayoutType.Panel;
		private ITranslatableString caption;
		private ITranslatableString description;

		private final List<DocumentLayoutElementDescriptor> elements = new ArrayList<>();

		private Builder()
		{
			super();
		}

		public ProcessLayout build()
		{
			return new ProcessLayout(this);
		}

		@Override
		public String toString()
		{
			return MoreObjects.toStringHelper(this)
					.add("processId", processId)
					.add("caption", caption)
					.add("elements-count", elements.size())
					.toString();
		}

		public Builder setProcessId(final ProcessId processId)
		{
			this.processId = processId;
			return this;
		}

		public Builder setLayoutType(final ProcessLayoutType layoutType)
		{
			this.layoutType = layoutType;
			return this;
		}

		public Builder setCaption(final ITranslatableString caption)
		{
			this.caption = caption;
			return this;
		}

		public Builder setDescription(final ITranslatableString description)
		{
			this.description = description;
			return this;
		}

		public Builder addElement(final DocumentLayoutElementDescriptor element)
		{
			Check.assumeNotNull(element, "Parameter element is not null");
			elements.add(element);
			return this;
		}

		public Builder addElement(final DocumentFieldDescriptor processParaDescriptor)
		{
			Check.assumeNotNull(processParaDescriptor, "Parameter processParaDescriptor is not null");
			final DocumentLayoutElementDescriptor element = DocumentLayoutElementDescriptor.builder()
					.setCaption(processParaDescriptor.getCaption())
					.setDescription(processParaDescriptor.getDescription())
					.setWidgetType(processParaDescriptor.getWidgetType())
					.addField(DocumentLayoutElementFieldDescriptor.builder(processParaDescriptor.getFieldName())
							.setLookupSource(processParaDescriptor.getLookupSourceType())
							.setPublicField(true)
							.setSupportZoomInto(processParaDescriptor.getWidgetType().isLookup()))
					.build();

			addElement(element);

			return this;
		}

		public Builder addElements(@Nullable final DocumentEntityDescriptor parametersDescriptor)
		{
			if (parametersDescriptor != null)
			{
				parametersDescriptor.getFields().forEach(this::addElement);
			}

			return this;
		}

	}
}
