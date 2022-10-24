package Main;

import java.util.Date;

public class Appointment {
	private String ID;
	private Date date;
	private String desc;
	
	
	
	public Appointment(String ID, Date date, String desc) {
		if (ID == null || ID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if (date == null || date.before(new Date())) {
			throw new IllegalArgumentException("Invalid Date");
		}
		if (desc == null || desc.length()>50) {
			throw new IllegalArgumentException("Invalid Appointment Description");
		}
		
		this.ID = ID;
		this.date = date;
		this.desc = desc;
		
	}
	
	public String getID() {
		return ID;
	}
	public Date getDate() {
		return date;
	}

	public String getDesc() {
		return desc;
	}
}
