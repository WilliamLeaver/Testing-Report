package Main;

public class Contact {
	private String ID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String ID, String firstName, String lastName, String phone, String address) {
		if (ID == null || ID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if (phone == null || phone.length()!=10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		if (address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	public String getID() {
		return ID;
	}
	public String getFirst() {
		return firstName;
	}
	public String getLast() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
}
