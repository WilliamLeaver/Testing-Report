package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Main.Task;

class TaskTest {

	@Test
	void testTaskName() {
		Task task = new Task("12345", "The Best Task Ever", "This really is a great Task");
		assertTrue(task.getID().equals("12345"));
		assertTrue(task.getName().equals("The Best Task Ever"));
		assertTrue(task.getDesc().equals("This really is a great Task"));
	}
	
	@Test
	void testTaskIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "The Best Task Ever", "This really is a great Task");
		}); 
	}
	
	@Test
	void testTaskNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", "The Best Most Greatest Task Ever", "This really is a great Task");
		}); 
	}
	
	@Test
	void testTaskDescLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", "The Best Task Ever", "This really really really really really really really is a great Task");
		}); 
	}
	
}
