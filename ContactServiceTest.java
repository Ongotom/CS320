import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	//test adding and making sure it's a unique ID
	@Test
	void testAddContact() {
		Contact contact = new Contact("1234567890","Michael","Abell","7023365555","1234 SNHU Way");
		//creating a new instance of a contact service
 		ContactService service = new ContactService();
		//set to true on the assert because this should succeed
		assertEquals(true, service.addContact(contact));
		// set this to false now because the contact is already in the array
		assertEquals(false, service.addContact(contact));
	}
	// test deleting an existing contact by matching on ID
	@Test
	void testDeleteContact() {
		Contact contact = new Contact("1234567890","Michael","Abell","7023365555","1234 SNHU Way");
		//creating a new instance of a contact service
 		ContactService service = new ContactService();
		//set to true on the assert because this should succeed
		assertEquals(true, service.addContact(contact));
		// set this to false now because the contact is already in the array
		assertEquals(true, service.deleteContact("1234567890"));
	}
	// match on ID to update one of the other four values
	@Test
	void testUpdateContactFirstName() {
		Contact contact = new Contact("1234567890","Michael","Abell","7023365555","1234 SNHU Way");
		//creating a new instance of a contact service
		ContactService service = new ContactService();
		//assert the contact before updating it
		assertEquals(true, service.addContact(contact));
		// update the first name
		assertEquals(true, service.updateContact("1234567890","Nicholas","Abell","7023365555","1234 SNHU Way"));
		//make sure it really updated
		assertEquals(contact.getFirstName(), "Nicholas");
	}
	@Test
	void testUpdateContactLastName() {
		Contact contact = new Contact("1234567890","Michael","Abell","7023365555","1234 SNHU Way");
		//creating a new instance of a contact service
		ContactService service = new ContactService();
		//assert the contact before updating it
		assertEquals(true, service.addContact(contact));
		// update the last name
		assertEquals(true, service.updateContact("1234567890","Michael","Derrick","7023365555","1234 SNHU Way"));
		//make sure it really updated
		assertEquals(contact.getLastName(), "Derrick");
	}
	@Test
	void testUpdateContactPhone() {
		Contact contact = new Contact("1234567890","Michael","Abell","7023365555","1234 SNHU Way");
		//creating a new instance of a contact service
		ContactService service = new ContactService();
		//assert the contact before updating it
		assertEquals(true, service.addContact(contact));
		// update the phone number
		assertEquals(true, service.updateContact("1234567890","Michael","Abell","2823365555","1234 SNHU Way"));
		//make sure it really updated
		assertEquals(contact.getPhone(), "2823365555");
	}
	@Test
	void testUpdateContactAddress() {
		Contact contact = new Contact("1234567890","Michael","Abell","7023365555","1234 SNHU Way");
		//creating a new instance of a contact service
		ContactService service = new ContactService();
		//assert the contact before updating it
		assertEquals(true, service.addContact(contact));
		// update the address
		assertEquals(true, service.updateContact("1234567890","Michael","Abell","2823365555","5678 SNHU Way"));
		//make sure it really updated
		assertEquals(contact.getAddress(), "5678 SNHU Way");
	}	
}
