package Main;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
	private List<Task> TaskList = new ArrayList<Task> ();
	
	public void addTask(String ID, String name, String desc) {
		Task task = new Task(ID, name, desc);
		TaskList.add(task);
	}
	
	public void deleteTask(String ID) {
		for (int i = 1; i < TaskList.size(); i++) {
			if (TaskList.get(i).getID() == ID) {
				TaskList.remove(i);
			}
		}
	}
	public void updateTask(String ID, String name, String desc) {
		for (int i = 1; i < TaskList.size(); i++) {
			if (TaskList.get(i).getID() == ID) {
				Task task = new Task(ID, name, desc);
				TaskList.remove(i);
				TaskList.add(task);
			}
		}
	}
	
	public List<Task> getTaskList() {
		return TaskList;
	}
}
