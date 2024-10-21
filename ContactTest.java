import static org.junit.jupiter.api.Assertions.*;
	// the following were imported after typing the code and it suggesting these API's be called.
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

	// ContactTest class to run the Junit testing
class ContactTest {
	// testing the initialization of a class object
	@Test
	void testContact() {
		Contact contact = new Contact("1234567890","Michael","Abell","7023365555","1234 SNHU Way");
		assertTrue(contact.getContactId().equals("1234567890"));
		assertTrue(contact.getFirstName().equals("Michael"));		
		assertTrue(contact.getLastName().equals("Abell"));
		assertTrue(contact.getPhone().equals("7023365555"));
		assertTrue(contact.getAddress().equals("1234 SNHU Way"));
	}
	
	// testing > 10 characters for contact ID, if it passes that means the error was correctly thrown
		@Test
		void testContactContactIdTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("12345678901234","Michael","Abell","7023365555","1234 SNHU Way");
			});		}
	// testing null value for contact ID, if it passes that means the error was correctly thrown
	@Test
	void testContactContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null,"Michael","Abell","7023365555","1234 SNHU Way");
		});		}
	
	// testing > 10 characters for first name, if it passes that means the error was correctly thrown
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890","MichaelMichael","Abell","7023365555","1234 SNHU Way");
		});		}
	// testing null value for first name, if it passes that means the error was correctly thrown
	@Test
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890",null,"Abell","7023365555","1234 SNHU Way");
		});		}
	
	// testing > 10 characters for last name, if it passes that means the error was correctly thrown
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890","Michael","AbellAbellAbell","7023365555","1234 SNHU Way");
		});		}	
	// testing null value for last name, if it passes that means the error was correctly thrown
	@Test
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890","Michael",null,"7023365555","1234 SNHU Way");
		});		}
	
	// testing > 10 characters for phone number, if it passes that means the error was correctly thrown
	@Test
	void testContactPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890","Michael","Abell","7023365555702","1234 SNHU Way");
		});		}
	// testing null value for phone number, if it passes that means the error was correctly thrown
	@Test
	void testContactPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890","Michael","Abell",null,"1234 SNHU Way");
		});		}
	
	// testing > 10 characters for address, if it passes that means the error was correctly thrown
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890","Michael","Abell","7023365555","1234 SNHU Way 1234 SNHU Way 1234 SNHU Way");
		});		}
	// testing null value for address, if it passes that means the error was correctly thrown
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890","Michael","Abell","7023365555",null);
		});		}

}
