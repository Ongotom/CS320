// It was not my original idea to use booleans for this class, but as I researched around for ways to get a unique ID
// I did like the idea of it being true or false to add. Boolean also makes it easy to match on ID's for updating and deleting
// Other examples of unique ID's utilized methods for altering an ID to make it unique if it was already in a list
// I did not see that as a requirement for this assignment. The user will have to try again

import java.util.ArrayList;

public class ContactService {	
		// store list of Contact objects
	private ArrayList<Contact> contactList = new ArrayList<Contact>();
		
		// if the ID is unique then the method will pass and the contact will be added
		// otherwise it stays at false and nothing is added
	public boolean addContact(Contact newContact) {
		boolean match = false;			
		for(Contact contact : contactList) {
			if(contact.equals(newContact)) {
				match = true;
			}
		}			
		// If newContact not in list, add contact and return true, 
		// This may be added because it's not already in the list and is therefore unique
		if(!match) {
			contactList.add(newContact);
			return true;
		} else {
			return false;
		}
	}

		// if it works, set it to true and delete, otherwise set it to false and stay at false
	public boolean deleteContact(String id) {
		boolean match = false;
		for(Contact contact : contactList) {
			if (contact.getContactId().equals(id)) {
				match = contactList.remove(contact);
				if(match) {
					return match;
				}
			}
		}
		return false;
	}
		
		// if the ID matches then the update will go through, assuming it passes the parameters	for each string 
		// in the Contact class. If any of these fail then the update does not go through
	public boolean updateContact(String id, String firstName, String lastName, String phone, String address) {
		for(Contact contact : contactList) {
			if(contact.getContactId().equals(id)) {
				contact.setFirstName(firstName);
				contact.setLastName(lastName);
				contact.setPhone(phone);
				contact.setAddress(address);
				return true;
			}
		}
		return false;
	}
	
}