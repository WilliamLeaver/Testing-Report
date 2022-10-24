package Main;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
	private List<Contact> contactBook = new ArrayList<Contact> ();
	
	public void addContact(String ID, String firstName, String lastName, String phone, String address) {
		Contact contact = new Contact(ID, firstName, lastName, phone, address);
		contactBook.add(contact);
	}
	
	public void deleteContact(String ID) {
		for (int i = 1; i < contactBook.size(); i++) {
			if (contactBook.get(i).getID() == ID) {
				contactBook.remove(i);
			}
		}
	}
	public void updateContact(String ID, String firstName, String lastName, String phone, String address) {
		for (int i = 1; i < contactBook.size(); i++) {
			if (contactBook.get(i).getID() == ID) {
				Contact contact = new Contact(ID, firstName, lastName, phone, address);
				contactBook.remove(i);
				contactBook.add(contact);
			}
		}
	}
	
	public List<Contact> getContactBook() {
		return contactBook;
	}
}
