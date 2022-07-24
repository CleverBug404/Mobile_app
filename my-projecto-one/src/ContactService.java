import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ContactService {
	private String uniqueID;
	private List<Contact> contactList = new ArrayList<>();
	
	{
		// assigns a unique ID of exactly 10 char
		uniqueID = UUID.randomUUID().toString().substring(0,10);
	}
}
