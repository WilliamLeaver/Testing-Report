package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Date;

import Main.AppointmentService;

class AppointmentServiceTest {
	Date testDate = new Date(2022, 12, 30);
	@Test
	void testAdd() {
		AppointmentService appointmentService = new AppointmentService();
		appointmentService.addAppointment("12345", testDate, "This is a test desc");
		for (int i = 1; i < appointmentService.getAppointmentList().size(); i++) {
			assertTrue(appointmentService.getAppointmentList().get(i).getID().equals("12345"));
			assertTrue(appointmentService.getAppointmentList().get(i).getDate().equals(testDate));
			assertTrue(appointmentService.getAppointmentList().get(i).getDesc().equals("This is a test desc"));
		
		}
	}
	
	@Test
	void testRemove() {
		AppointmentService appointmentService = new AppointmentService();
		appointmentService.addAppointment("12345", testDate, "This is a test desc");
		appointmentService.deleteAppointment("12345");
		for (int i = 1; i < appointmentService.getAppointmentList().size(); i++) {
			assertTrue(appointmentService.getAppointmentList().get(i).getID().equals(null));
			assertTrue(appointmentService.getAppointmentList().get(i).getDate().equals(null));
			assertTrue(appointmentService.getAppointmentList().get(i).getDesc().equals(null));
		}
	}
}
