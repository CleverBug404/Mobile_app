import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppointmentTest {
	
	protected String appointmentID, appointmentDescription, longAppointmentID, longAppointmentDescription;
	protected Date appointmentDate;
	@BeforeEach
	void setUp() {				
		appointmentID = "DkZ31p";
		appointmentDescription = "Go to the dentist";
		appointmentDate = new Date();
		longAppointmentID = "12345678901";
		longAppointmentDescription = "0123456789asdfghjklz1234567890asdfghjklz1234567890.";
	}
	
	@Test
	void testAppointment() {
		Appointment appointment = new Appointment ();
		assertAll("Constructor",
				() -> assertNotNull(appointment.getAppointmentID()),
				() -> assertNotNull(appointment.getAppointmentDate()),
				() -> assertNotNull(appointment.getDescription())
				);
	}
	
	@Test 
	void testAppointmentID() {
		Appointment appointment = new Appointment(appointmentID);
		assertAll("Constructor ID",
				() -> assertEquals(appointmentID, appointment.getAppointmentID()),
				() -> assertNotNull(appointment.getAppointmentDate()),
				() -> assertNotNull(appointment.getDescription())
				);
	}
	@Test
	void testAppointmentDate() {
		Appointment appointment = new Appointment(appointmentID, appointmentDate);
		assertAll("Constructor  Date",
				()-> assertEquals(appointmentID, appointment.getAppointmentID()),
				()-> assertEquals(appointmentDate, appointment.getAppointmentDate()),
				()-> assertNotNull(appointment.getDescription())
				);
	}
	@Test
	void testAppointmentDescription() {
		Appointment appointment = new Appointment(appointmentID, appointmentDate, appointmentDescription);
		assertAll("Constructor  Description",
				()-> assertEquals(appointmentID, appointment.getAppointmentID()),
				()-> assertEquals(appointmentDate, appointment.getAppointmentDate()),
				()-> assertEquals(appointmentDescription,appointment.getDescription())
				);
		}
	@Test
	void testAppointmentUpdateAppointmentID() {
		Appointment appointment = new Appointment();
		appointment.updateAppointmentId(appointmentID);
		assertAll("Update appointment ID",
				() -> assertEquals(appointmentID, appointment.getAppointmentID()),
				() -> assertThrows(IllegalArgumentException.class, () -> appointment.updateAppointmentId(null)),
				() -> assertThrows(IllegalArgumentException.class, () -> appointment.updateAppointmentId(longAppointmentID))
				);
	}
	@Test
	void testAppointmentUpdateDate() {
		Appointment appointment = new Appointment();
		appointment.updateDate(appointmentDate);
		assertAll("Update appointment Date",
				()-> assertEquals(appointmentDate, appointment.getAppointmentDate()),
				()-> assertThrows(IllegalArgumentException.class, () -> appointment.updateDate(null))
				);
	}
	@Test
	void testAppointmentUpdateDescription() {
		Appointment appointment = new Appointment();
		appointment.updateDescription(appointmentDescription);
		assertAll("Update appointment Description",
				()-> assertEquals(appointmentDescription, appointment.getDescription()),
				()-> assertThrows(IllegalArgumentException.class, ()-> appointment.updateDescription(null)),
				()-> assertThrows(IllegalArgumentException.class, ()-> appointment.updateDescription(longAppointmentDescription))
				);
	}
}


