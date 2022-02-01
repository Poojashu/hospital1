package sprint1.hospital.dto;

public class StaffPatient {

	private int sid;
	private String sname;
	private int pid;
	private String pname;
	private int proom;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getProom() {
		return proom;
	}

	public void setProom(int proom) {
		this.proom = proom;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public StaffPatient() {
		super();
	}

	public StaffPatient(int sid, String sname, int pid, String pname, int proom) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.pid = pid;
		this.pname = pname;
		this.proom = proom;
	}
}