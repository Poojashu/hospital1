package sprint1.hospital.dto;

public class RoomPatient {

	private int roomno;
	private String location;
	private int pid;
	private String pname;

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

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public RoomPatient(int roomno, String location, int pid, String pname) {
		super();
		this.roomno = roomno;
		this.location = location;
		this.pid = pid;
		this.pname = pname;
	}

	public RoomPatient() {
		super();
	}
}