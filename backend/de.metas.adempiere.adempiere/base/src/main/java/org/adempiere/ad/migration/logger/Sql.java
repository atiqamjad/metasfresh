/*
 * #%L
 * de.metas.adempiere.adempiere.base
 * %%
 * Copyright (C) 2022 metas GmbH
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

package org.adempiere.ad.migration.logger;

import de.metas.dao.sql.SqlParamsInliner;
import de.metas.util.StringUtils;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import javax.annotation.Nullable;
import java.time.Instant;
import java.util.Map;

@EqualsAndHashCode(exclude = "_sqlWithInlinedParams")
public final class Sql
{
	@NonNull private final String sqlCommand;
	@NonNull private final SqlParams sqlParams;
	private final Instant timestamp = Instant.now();
	private final boolean appendTimestampToFinalSql;

	private transient String _sqlWithInlinedParams = null; // lazy

	private static final SqlParamsInliner sqlParamsInliner = SqlParamsInliner.builder().failOnError(true).build();

	public static Sql ofSql(@NonNull final String sql)
	{
		return new Sql(sql, null, true);
	}

	public static Sql ofSql(@NonNull final String sql, @Nullable Map<Integer, Object> sqlParamsMap)
	{
		return new Sql(sql, SqlParams.ofMap(sqlParamsMap), true);
	}

	public static Sql ofSql(@NonNull final String sql, @Nullable SqlParams sqlParamsMap)
	{
		return new Sql(sql, sqlParamsMap, true);
	}

	public static Sql ofComment(@NonNull final String comment)
	{
		String sqlComment = toSqlCommentLine(comment);
		if (sqlComment.isEmpty())
		{
			sqlComment = "-- ";
		}

		return new Sql(sqlComment, null, false);
	}

	private static String toSqlCommentLine(@Nullable final String comment)
	{
		final String commentNorm = StringUtils.trimBlankToNull(comment);
		if (commentNorm == null)
		{
			return "";
		}
		return "-- "
				+ commentNorm
				.replace("\r\n", "\n")
				.replace("\n", "\n-- ")
				+ "\n";
	}

	private Sql(
			@NonNull final String sql,
			@Nullable final SqlParams sqlParams,
			final boolean appendTimestampToFinalSql)
	{
		this.sqlCommand = sql;
		this.sqlParams = sqlParams != null ? sqlParams : SqlParams.EMPTY;
		this.appendTimestampToFinalSql = appendTimestampToFinalSql;
	}

	@Override
	@Deprecated
	public String toString() {return toSql();}

	public String getSqlWithoutParamsResolved() {return sqlCommand;}

	public String toSql()
	{
		String sqlWithInlinedParams = this._sqlWithInlinedParams;
		if (sqlWithInlinedParams == null)
		{
			sqlWithInlinedParams = this._sqlWithInlinedParams = buildFinalSql();
		}
		return sqlWithInlinedParams;
	}

	private String buildFinalSql()
	{
		final StringBuilder finalSql = new StringBuilder();

		if (appendTimestampToFinalSql)
		{
			finalSql.append(toSqlCommentLine(timestamp.toString()));
		}

		final String sqlWithParams = !sqlParams.isEmpty()
				? sqlParamsInliner.inline(sqlCommand, sqlParams.toList())
				: sqlCommand;
		finalSql.append(sqlWithParams).append("\n;\n\n");

		return finalSql.toString();

	}
}
