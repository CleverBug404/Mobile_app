import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppointmentTest {
	
	protected String appointmentID, appointmentDescription;
	protected Date appointmentDate;
	@BeforeEach
	void setUp() {				
		appointmentID = "DkZ31p";
		appointmentDescription = "Go to the dentist";
		appointmentDate = new Date();
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
				()-> assertEquals(appointmentID, appointment.getAppointmentID()),
				() -> assertThrows(IllegalArgumentException.class, () -> appointment.updateAppointmentId(null)).
				);
	}
}

