package de.metas.manufacturing.job.service;

import de.metas.device.accessor.DeviceAccessorsHubFactory;
import de.metas.device.config.DeviceConfigPoolFactory;
import de.metas.device.websocket.DeviceWebsocketNamingStrategy;
import de.metas.global_qrcodes.service.GlobalQRCodeService;
import de.metas.handlingunits.inventory.InventoryRepository;
import de.metas.handlingunits.inventory.InventoryService;
import de.metas.handlingunits.pporder.api.issue_schedule.PPOrderIssueScheduleRepository;
import de.metas.handlingunits.pporder.api.issue_schedule.PPOrderIssueScheduleService;
import de.metas.handlingunits.qrcodes.service.HUQRCodesRepository;
import de.metas.handlingunits.qrcodes.service.HUQRCodesService;
import de.metas.handlingunits.reservation.HUReservationRepository;
import de.metas.handlingunits.reservation.HUReservationService;
import de.metas.handlingunits.sourcehu.SourceHUsService;
import de.metas.organization.ClientAndOrgId;
import de.metas.resource.ResourceService;
import de.metas.util.Services;
import org.adempiere.service.ISysConfigDAO;
import org.adempiere.test.AdempiereTestHelper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ManufacturingJobServiceTest
{
	private ManufacturingJobService manufacturingJobService;
	private ISysConfigDAO sysConfigDAO;

	@BeforeEach
	void beforeEach()
	{
		AdempiereTestHelper.get().init();

		this.manufacturingJobService = new ManufacturingJobService(
				ResourceService.newInstanceForJUnitTesting(),
				new PPOrderIssueScheduleService(
						new PPOrderIssueScheduleRepository(),
						new InventoryService(new InventoryRepository(), new SourceHUsService())
				),
				new HUReservationService(new HUReservationRepository()),
				new DeviceAccessorsHubFactory(new DeviceConfigPoolFactory()),
				new DeviceWebsocketNamingStrategy("/test/"),
				new HUQRCodesService(new HUQRCodesRepository(), new GlobalQRCodeService())
		);

		this.sysConfigDAO = Services.get(ISysConfigDAO.class);
	}

	@Nested
	class getDefaultFilters
	{
		@Test
		void empty()
		{
			Assertions.assertThat(manufacturingJobService.getDefaultFilters()).isEmpty();
		}

		@Test
		void userPlant()
		{
			// IMPORTANT: set the value as plain string to also enforce the name of the enums are not changed on refactoring
			sysConfigDAO.setValue(ManufacturingJobService.SYSCONFIG_defaultFilters, "UserPlant", ClientAndOrgId.SYSTEM);

			Assertions.assertThat(manufacturingJobService.getDefaultFilters())
					.contains(ManufacturingJobDefaultFilter.UserPlant);
		}

		@Test
		void allEnumValues()
		{
			// IMPORTANT: set the value as plain string to also enforce the name of the enums are not changed on refactoring
			sysConfigDAO.setValue(ManufacturingJobService.SYSCONFIG_defaultFilters, "UserPlant, TodayDatePromised", ClientAndOrgId.SYSTEM);

			Assertions.assertThat(manufacturingJobService.getDefaultFilters())
					.contains(ManufacturingJobDefaultFilter.UserPlant, ManufacturingJobDefaultFilter.TodayDatePromised);
		}
	}
}