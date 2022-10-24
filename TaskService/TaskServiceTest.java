package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.TaskService;

class TaskServiceTest {

	@Test
	void testAdd() {
		TaskService taskService = new TaskService();
		taskService.addTask("12345", "The Best Task Ever", "This really is a great Task");
		for (int i = 1; i < taskService.getTaskList().size(); i++) {
			assertTrue(taskService.getTaskList().get(i).getID().equals("12345"));
			assertTrue(taskService.getTaskList().get(i).getName().equals("The Best Task Ever"));
			assertTrue(taskService.getTaskList().get(i).getDesc().equals("This really is a great Task"));
		
		}
	}
	
	@Test
	void testRemove() {
		TaskService taskService = new TaskService();
		taskService.addTask("12345", "The Best Task Ever", "This really is a great Task");
		taskService.deleteTask("12345");
		for (int i = 1; i < taskService.getTaskList().size(); i++) {
			assertTrue(taskService.getTaskList().get(i).getID().equals(null));
			assertTrue(taskService.getTaskList().get(i).getName().equals(null));
			assertTrue(taskService.getTaskList().get(i).getDesc().equals(null));
	
		}
	}
	
	@Test
	void testUpdate() {
		TaskService taskService = new TaskService();
		taskService.addTask("12345", "The Best Task Ever", "This really is a great Task");
		taskService.updateTask("12345", "The Worst Task Ever", "This really is a bad Task");
		for (int i = 1; i < taskService.getTaskList().size(); i++) {
			assertTrue(taskService.getTaskList().get(i).getID().equals("12345"));
			assertTrue(taskService.getTaskList().get(i).getName().equals("The Worst Task Ever"));
			assertTrue(taskService.getTaskList().get(i).getDesc().equals("This really is a bad Task"));
		}
	}
}
