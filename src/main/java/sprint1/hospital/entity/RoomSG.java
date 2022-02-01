package sprint1.hospital.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="room")
public class RoomSG {

	@Id
	private int roomno;
	private String location;
	
	@OneToMany(targetEntity = PatientSG.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "proom", referencedColumnName = "roomno")
	private List<PatientSG> patient;

	public List<PatientSG> getPatient() {
		return patient;
	}

	public void setPatient(List<PatientSG> patient) {
		this.patient = patient;
	}

	public int getRoomno() {
		return roomno;
	}

	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}