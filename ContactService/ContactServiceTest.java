package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.ContactService;

class ContactServiceTest {

	@Test
	void testAdd() {
		ContactService contactService = new ContactService();
		contactService.addContact("12345", "John", "Doe", "0000000000", "1234 Test Lane");
		for (int i = 1; i < contactService.getContactBook().size(); i++) {
			assertTrue(contactService.getContactBook().get(i).getID().equals("12345"));
			assertTrue(contactService.getContactBook().get(i).getFirst().equals("John"));
			assertTrue(contactService.getContactBook().get(i).getLast().equals("Doe"));
			assertTrue(contactService.getContactBook().get(i).getPhone().equals("0000000000"));
			assertTrue(contactService.getContactBook().get(i).getAddress().equals("1234 Test Lane"));
		}
	}
	
	@Test
	void testRemove() {
		ContactService contactService = new ContactService();
		contactService.addContact("12345", "John", "Doe", "0000000000", "1234 Test Lane");
		contactService.deleteContact("12345");
		for (int i = 1; i < contactService.getContactBook().size(); i++) {
			assertTrue(contactService.getContactBook().get(i).getID().equals(null));
			assertTrue(contactService.getContactBook().get(i).getFirst().equals(null));
			assertTrue(contactService.getContactBook().get(i).getLast().equals(null));
			assertTrue(contactService.getContactBook().get(i).getPhone().equals(null));
			assertTrue(contactService.getContactBook().get(i).getAddress().equals(null));
		}
	}
	
	@Test
	void testUpdate() {
		ContactService contactService = new ContactService();
		contactService.addContact("12345", "John", "Doe", "0000000000", "1234 Test Lane");
		contactService.updateContact("12345", "Jane", "Danger", "0000000000", "1234 Test Lane");
		for (int i = 1; i < contactService.getContactBook().size(); i++) {
			assertTrue(contactService.getContactBook().get(i).getID().equals("12345"));
			assertTrue(contactService.getContactBook().get(i).getFirst().equals("Jane"));
			assertTrue(contactService.getContactBook().get(i).getLast().equals("Danger"));
			assertTrue(contactService.getContactBook().get(i).getPhone().equals("0000000000"));
			assertTrue(contactService.getContactBook().get(i).getAddress().equals("1234 Test Lane"));
		}
	}
}
