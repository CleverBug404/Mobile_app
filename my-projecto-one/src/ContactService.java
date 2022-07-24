import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ContactService {
	private String uniqueID;
	private List<Contact> contactList = new ArrayList<>();
	
	//Generate a UniqueID
	private String newUniqueID() {
		return uniqueID = UUID.randomUUID().toString().substring(0,10);
	}
	//add new contact
	public void newContact() {
		Contact contact = new Contact(newUniqueID());
		contactList.add(contact);
	}
}
