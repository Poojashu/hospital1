package sprint1.hospital.dto;

public class ChargesPatient {

	private String sname;
	private int amount;
	private int pid;
	private String pname;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
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

	public ChargesPatient(String sname, int amount, int pid, String pname) {
		super();
		this.sname = sname;
		this.amount = amount;
		this.pid = pid;
		this.pname = pname;
	}

	public ChargesPatient() {
		super();
	}
}