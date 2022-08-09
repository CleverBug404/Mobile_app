import java.util.Date;

public class Appointment {
	//default values
	final private byte Appointment_ID_l;
	final private byte Appointment_Desc_l;
	final private String DEFAULT;
	private String appointmentId;
	private Date appointmentDate;
	private String description;
	
	{
		Appointment_ID_l = 10;
		Appointment_Desc_l = 50;
		DEFAULT = "DEFAULT";
	}
	
	Appointment(){
		Date today = new Date();
		appointmentId = DEFAULT;
		appointmentDate = today;
		description = DEFAULT;
	}
	
	public void updateAppointmentId(String id) {
		if (id == null) {
			throw new IllegalArgumentException("The Appointment ID cannot be null");
		} else if (id.length() > Appointment_ID_l) {
			throw  new IllegalArgumentException("Appoindment ID canot be longer than" + Appointment_ID_l + " characters");
		}else {
			this.appointmentId = id;
		}
	}
	public String getAppointment() {
		return appointmentId;
	}
	
	public void updateDate(Date date) {
		if (date == null) {
			throw new IllegalArgumentException("The appointment date cannot be empty");
		} else if (date.before(new Date())) {
			throw new IllegalArgumentException("This date is not avalible for an appointment");
		} else {
			this.appointmentDate = date;
		}
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	
	public void updateDescription(String description) {
		if (description == null) {
			throw new IllegalArgumentException("Appointment description required");
		} else if (description.length() > Appointment_Desc_l) {
			throw new IllegalArgumentException("The description for the appointment need to be " + Appointment_Desc_l + " characters maximum");
		} else {
			this.description = description;
		}
	}
	public String getDescription() {
		return description;
	}
	
	Appointment(String id){
		Date today = new Date();
		updateAppointmentId(id);
		appointmentDate = today;
		description = DEFAULT;
	}
	Appointment(String id, Date date){
		updateAppointmentId(id);
		updateDate(date);
		description = DEFAULT;
	}
	Appointment(String id, Date date, String description){
		updateAppointmentId(id);
		updateDate(date);
		updateDescription(description);
	}
}
