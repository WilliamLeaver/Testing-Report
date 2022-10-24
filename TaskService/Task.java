package Main;

public class Task {
	private String ID;
	private String name;
	private String desc;
	
	
	public Task(String ID, String name, String desc) {
		if (ID == null || ID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if (name == null || name.length()>20) {
			throw new IllegalArgumentException("Invalid Task Name");
		}
		if (desc == null || desc.length()>50) {
			throw new IllegalArgumentException("Invalid Task Description");
		}
		
		this.ID = ID;
		this.name = name;
		this.desc = desc;
		
	}
	
	public String getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public String getDesc() {
		return desc;
	}

}
