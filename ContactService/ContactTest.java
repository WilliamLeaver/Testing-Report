package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Main.Contact;

class ContactTest {

	@Test
	void testContactName() {
		Contact contact = new Contact("12345", "John", "Doe", "0000000000", "1234 Test Lane");
		assertTrue(contact.getID().equals("12345"));
		assertTrue(contact.getFirst().equals("John"));
		assertTrue(contact.getLast().equals("Doe"));
		assertTrue(contact.getPhone().equals("0000000000"));
		assertTrue(contact.getAddress().equals("1234 Test Lane"));
	}
	
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "John", "Doe", "0000000000", "1234 Test Lane");
		}); 
	}
	
	@Test
	void testContactFirstLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "JohnBillyBoJR", "Doe", "0000000000", "1234 Test Lane");
		}); 
	}
	
	@Test
	void testContactLastLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "John", "DoeFeeFiFoFum", "0000000000", "1234 Test Lane");
		}); 
	}
	
	@Test
	void testContactPhoneLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234", "John", "Doe", "00000000001", "1234 Test Lane");
		}); 
	}
	
	@Test
	void testContactAddressLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "John", "Doe", "0000000000", "1234 Test Lane Space 400 San Diego California 92028");
		}); 
	}
	
	
}
