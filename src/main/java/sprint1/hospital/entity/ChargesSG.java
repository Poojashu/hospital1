package sprint1.hospital.entity;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "surgerycharges")
public class ChargesSG {

	@Id
	private String sname;
	private int amount;
	
	@OneToMany(targetEntity = PatientSG.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "psurgery", referencedColumnName = "sname")
	private List<PatientSG> patient;

	public List<PatientSG> getPatient() {
		return patient;
	}

	public void setPatient(List<PatientSG> patient) {
		this.patient = patient;
	}

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
}