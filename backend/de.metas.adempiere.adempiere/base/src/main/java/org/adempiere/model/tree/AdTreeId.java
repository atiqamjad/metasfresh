package org.adempiere.model.tree;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import de.metas.util.Check;
import de.metas.util.lang.RepoIdAware;
import lombok.Value;

import javax.annotation.Nullable;
import java.util.Objects;

/*
 * #%L
 * de.metas.adempiere.adempiere.base
 * %%
 * Copyright (C) 2019 metas GmbH
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
public class AdTreeId implements RepoIdAware
{
	@Nullable
	public static AdTreeId ofRepoIdOrNull(final int repoId)
	{
		return repoId > 0 ? ofRepoId(repoId) : null;
	}

	@JsonCreator
	public static AdTreeId ofRepoId(final int repoId)
	{
		if (repoId == DEFAULT_MENU_TREE_ID.repoId)
		{
			return DEFAULT_MENU_TREE_ID;
		}
		else
		{
			return new AdTreeId(repoId);
		}
	}

	public static int toRepoId(@Nullable final AdTreeId id)
	{
		return id != null ? id.getRepoId() : -1;
	}

	public static final AdTreeId DEFAULT_MENU_TREE_ID = new AdTreeId(10);

	int repoId;

	private AdTreeId(final int repoId)
	{
		this.repoId = Check.assumeGreaterThanZero(repoId, "AD_Tree_ID");
	}

	@Override
	@JsonValue
	public int getRepoId()
	{
		return repoId;
	}

	public static boolean equals(@Nullable final AdTreeId id1, @Nullable final AdTreeId id2)
	{
		return Objects.equals(id1, id2);
	}
}
