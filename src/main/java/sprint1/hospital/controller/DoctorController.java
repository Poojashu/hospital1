package sprint1.hospital.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sprint1.hospital.entity.DoctorSG;
import sprint1.hospital.repo.DoctorRepo;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	DoctorRepo doctorrepo;

	@GetMapping("/home")
	public String Doctorhome() {
		return "doctorhome";
	}

	@GetMapping("/add")
	public String Doctoradd() {
		return "doctoradd";
	}

	@GetMapping("/delete")
	public String Doctordelete() {
		return "doctordelete";
	}

	@GetMapping("/all")
	public String selectDoctor() {
		return "doctorresult";
	}

	@GetMapping("/all2")
	public String selectDoctor2() {
		return "doctorresult2";
	}

	@PostMapping("/add")
	public String addDoctor(@RequestParam int did, String dname, String daddress, String dmobile,
			String dspecialization) {
		DoctorSG userobj = new DoctorSG();
		userobj.setDid(did);
		userobj.setDname(dname);
		userobj.setDaddress(daddress);
		userobj.setDmobile(dmobile);
		userobj.setDspecialization(dspecialization);
		doctorrepo.save(userobj);
		return "added";
	}

	@PostMapping("/delete")
	public String deleteDoctor(@RequestParam int did) {
		doctorrepo.deleteById(did);
		return "deleted";
	}
	
	@GetMapping("/userhome")
	public String uDoctorhome() {
		return "udoctorhome";
	}

	@GetMapping("/userfindbyid")
	public String uDoctorfindid() {
		return "udoctorfindbyid";
	}

	@GetMapping("/userfindbyname")
	public String uDoctorfindname() {
		return "udoctorfindbyname";
	}

	@PostMapping("/userfindbyid")
	public @ResponseBody Optional<DoctorSG> findiduDoctor(@RequestParam Integer did) {
		return doctorrepo.findById(did);
	}

	@PostMapping("/userfindbyname")
	public @ResponseBody Iterable<DoctorSG> findnameuDoctor(String dname) {
		return doctorrepo.findByDname(dname);
	}
}