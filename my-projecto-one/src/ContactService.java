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
	//Search for contact by ID
	private Contact searchForContact(String id) throws Exception {
		int index = 0;
		while (index < contactList.size()) {
			if(id.equals(contactList.get(index).getContactID())) {
				return contactList.get(index);
			}
			index ++;
		}
		throw new Exception ("The contact does not exists");
	}
	//Add new contact
	public void newContact() {
		Contact contact = new Contact(newUniqueID());
		contactList.add(contact);
	}
	//Delete a contact by ID
	public void deleteContact(String id) throws Exception{
		contactList.remove(searchForContact(id));
	}
	//Update first Name by ID and Fname
	public void updateFirstName(String id, String firstName) throws Exception {
		searchForContact(id).updateFirstName(firstName);
	}
	//UpdateLastName by ID and Lname
	public void updateLastName(String id, String lastName) throws Exception {
		searchForContact(id).updateLastName(lastName);
	}
	//Update phone numner by ID and phone#
	public void updatePhoneNumber(String id, String phoneNumber) throws Exception {
		searchForContact(id).updatePhoneNumber(phoneNumber);
	}
}
