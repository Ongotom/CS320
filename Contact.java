	// setting this Contact class to public so ContactService can utilize it
public class Contact {
	// declaration of required variables
	// conactId set to final so it cannot be altered, will also not provide any means to update it
	private final String contactId;
	private String firstName;
	private String lastName;
	// even though phone variable could be an int, set it to string to keep everything consistent
	private String phone;
	private String address;
	
	// structure and requirements for each piece of Contact object
	public Contact(String contactId, String firstName,String lastName,String phone, String address) {
	// contactId variable may not be null or greater than 10 characters, the Contact Service will ensure it is unique
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
	// first name variable may not be null or greater than 10 characters
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
	// last name variable may not be null or greater than 10 characters
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
	// phone variable may not be null or greater than 10 characters
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
	// address variable may not be null or greater than 30 characters
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;		
	}
	
	//Getter methods to access all 5 private variables publicly
	public String getContactId() {
		return contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
	//Setter methods to update 4 of private variables publicly. Do not want to allow to update contactId. 
	//If the update is null or too long it will throw an exception and a potentially helpful error message
	public void setFirstName(String updateFirstName) {
		if (updateFirstName == null || updateFirstName.length() > 10) {
			throw new IllegalArgumentException("First Name may not be null or longer than 10 characters");
		}
		this.firstName = updateFirstName;
	}
	public void setLastName(String updateLastName) {
		if (updateLastName == null || updateLastName.length() > 10) {
			throw new IllegalArgumentException("Last Name may not be null or longer than 10 characters");
		}
		this.lastName = updateLastName;
	}
	public void setPhone(String updatePhone) {
		if (updatePhone == null || updatePhone.length() != 10) {
			throw new IllegalArgumentException("Phone Number may not be null or longer than 10 characters");
		}
		this.phone = updatePhone;
	}
	public void setAddress(String updateAddress) {
		if (updateAddress == null || updateAddress.length() > 30) {
			throw new IllegalArgumentException("Address may not be null or longer than 30 characters");
		}
		this.address = updateAddress;
	}
}
