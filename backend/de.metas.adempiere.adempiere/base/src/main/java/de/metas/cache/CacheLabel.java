package de.metas.cache;

import lombok.NonNull;
import lombok.Value;

import javax.annotation.Nullable;

/*
 * #%L
 * de.metas.adempiere.adempiere.base
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
public class CacheLabel
{
	public static final String NO_TABLENAME_PREFIX = "$NoTableName$";

	public static CacheLabel ofTableName(final String tableName)
	{
		return new CacheLabel(tableName);
	}

	String name;

	private CacheLabel(@NonNull final String name)
	{
		this.name = name;
	}

	public boolean equalsByName(@Nullable final String otherName)
	{
		return this.name.equals(otherName);
	}

	public boolean isApplicationDictionaryTableName()
	{
		return name.startsWith("AD_");
	}

	public boolean containsNoTableNameMarker()
	{
		return name.contains(NO_TABLENAME_PREFIX);
	}
}
