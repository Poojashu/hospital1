package sprint1.hospital.dto;

public class DoctorPatient {

	private int did;
	private String dname;
	private int pid;
	private String pname;
	private String psurgery;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
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

	public String getPsurgery() {
		return psurgery;
	}

	public void setPsurgery(String psurgery) {
		this.psurgery = psurgery;
	}

	public DoctorPatient() {
		super();
	}

	public DoctorPatient(int did, String dname, int pid, String pname, String psurgery) {
		super();
		this.did = did;
		this.dname = dname;
		this.pid = pid;
		this.pname = pname;
		this.psurgery = psurgery;
	}
}