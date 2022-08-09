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
}
