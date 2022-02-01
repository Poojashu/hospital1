package sprint1.hospital.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sprint1.hospital.entity.PatientSG;
import sprint1.hospital.repo.PatientRepo;

@Controller
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PatientRepo patientrepo;

	@GetMapping("/home")
	public String Patienthome() {
		return "patienthome";
	}

	@GetMapping("/add")
	public String Patientadd() {
		return "patientadd";
	}

	@GetMapping("/delete")
	public String Patientdelete() {
		return "patientdelete";
	}

	@GetMapping("/all")
	public String selectPatient() {
		return "patientresult";
	}

	@GetMapping("/all2")
	public String selectPatient2() {
		return "patientresult2";
	}

	@PostMapping("/add")
	public String addPatient(@RequestParam int pid, String pname, @RequestParam int proom, @RequestParam int page,
			String pgender, String psurgery, String paddress, @RequestParam int did, @RequestParam int sid) {
		PatientSG obj = new PatientSG();
		obj.setPid(pid);
		obj.setPname(pname);
		obj.setProom(proom);
		obj.setPage(page);
		obj.setPgender(pgender);
		obj.setPsurgery(psurgery);
		obj.setPaddress(paddress);
		obj.setDid(did);
		obj.setSid(sid);
		patientrepo.save(obj);
		return "added";
	}

	@PostMapping("/delete")
	public String deletePatient(@RequestParam int pid) {
		patientrepo.deleteById(pid);
		return "deleted";
	}
	
	@GetMapping("/userhome")
	public String uPatienthome() {
		return "upatienthome";
	}

	@GetMapping("/userfindbyid")
	public String uPatientfindid() {
		return "upatientfindbyid";
	}

	@GetMapping("/userfindbyname")
	public String uPatientfindname() {
		return "upatientfindbyname";
	}

	@PostMapping("/userfindbyid")
	public @ResponseBody Optional<PatientSG> findiduPatient(@RequestParam int pid) {
		return patientrepo.findById(pid);
	}

	@PostMapping("/userfindbyname")
	public @ResponseBody Iterable<PatientSG> findnameuPatient(String pname) {
		return patientrepo.findByPname(pname);
	}
}