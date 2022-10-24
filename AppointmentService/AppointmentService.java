package Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentService {
	private List<Appointment> AppointmentList = new ArrayList<Appointment> ();
	
	public void addAppointment(String ID, Date date, String desc) {
		Appointment appointment = new Appointment(ID, date, desc);
		for (int i = 1; i < AppointmentList.size(); i++) {
			if (AppointmentList.get(i).getID() == ID) {
				throw new IllegalArgumentException("Invalid ID: ID already in use");
			}
		}
		AppointmentList.add(appointment);
	}
	
	public void deleteAppointment(String ID) {
		for (int i = 1; i < AppointmentList.size(); i++) {
			if (AppointmentList.get(i).getID() == ID) {
				AppointmentList.remove(i);
				break;
			}
		}
	}
	
	public List<Appointment> getAppointmentList() {
		return AppointmentList;
	}
}
