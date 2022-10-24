package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Date;
import Main.Appointment;

class AppointmentTest {
	Date testDate = new Date(122, 12, 30);
	@Test
	void testAppointment() {
		Appointment appointment = new Appointment("12345", testDate, "This is a test desc");
		assertTrue(appointment.getID().equals("12345"));
		assertTrue(appointment.getDate().equals(testDate));
		assertTrue(appointment.getDesc().equals("This is a test desc"));
	}
	
	@Test
	void testAppointmentIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, testDate, "This is a test desc");
		}); 
	}
	
	@Test
	void testAppointmentDatePast() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", new Date(97, 5, 30), "This is a test desc");
		}); 
	}
	
	@Test
	void testAppointmentDescLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", new Date(122, 12, 30), "A LOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOONGGGGG Desc");
		}); 
	}
	
}
