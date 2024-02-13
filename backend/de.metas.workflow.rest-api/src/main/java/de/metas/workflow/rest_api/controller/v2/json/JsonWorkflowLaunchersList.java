/*
 * #%L
 * de.metas.workflow.rest-api
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

package de.metas.workflow.rest_api.controller.v2.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.google.common.collect.ImmutableList;
import de.metas.global_qrcodes.JsonDisplayableQRCode;
import de.metas.workflow.rest_api.model.WorkflowLaunchersList;
import lombok.Builder;
import lombok.NonNull;
import lombok.Singular;
import lombok.Value;

import javax.annotation.Nullable;
import java.time.Instant;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@Value
@Builder
public class JsonWorkflowLaunchersList
{
	@Singular
	@NonNull ImmutableList<JsonWorkflowLauncher> launchers;
	@Nullable JsonDisplayableQRCode filterByQRCode;
	@NonNull Instant computedTime;

	public static JsonWorkflowLaunchersList of(
			@NonNull final WorkflowLaunchersList list,
			@NonNull final JsonOpts jsonOpts)
	{
		return builder()
				.launchers(list.stream()
						.map(launcher -> JsonWorkflowLauncher.of(launcher, jsonOpts))
						.collect(ImmutableList.toImmutableList()))
				.filterByQRCode(list.getFilterByQRCode() != null ? list.getFilterByQRCode().toJsonDisplayableQRCode() : null)
				.computedTime(list.getTimestamp())
				.build();
	}
}
