package sprint1.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sprint1.hospital.dto.*;
import sprint1.hospital.repo.*;

@Controller
@RequestMapping("/join")
public class JoinController {
	
	@GetMapping("/userhome")
	public String joinUHome() {
		return "joinhome";
	}

	@Autowired
	DoctorRepo joinDP;
	
	@GetMapping("/joindp")
	public String joinDPhome() {
		return "joindp";
	}

	@PostMapping("/joindp")
	public @ResponseBody Iterable<DoctorPatient> joinDP(@RequestParam int dp) {
		return joinDP.getJoinDP(dp);
	}

	@Autowired
	RoomRepo joinRP;
	
	@GetMapping("/joinrp")
	public String joinRPhome() {
		return "joinrp";
	}

	@PostMapping("/joinrp")
	public @ResponseBody Iterable<RoomPatient> joinRP(@RequestParam int rp) {
		return joinRP.getJoinRP(rp);
	}

	@Autowired
	ChargesRepo joinCP;
	
	@GetMapping("/joincp")
	public String joinCPhome() {
		return "joincp";
	}

	@PostMapping("/joincp")
	public @ResponseBody Iterable<ChargesPatient> joinCP(String cp) {
		return joinCP.getJoinCP(cp);
	}
	
	@Autowired
	StaffsRepo joinSP;
	
	@GetMapping("/joinsp")
	public String joinSPhome() {
		return "joinsp";
	}

	@PostMapping("/joinsp")
	public @ResponseBody Iterable<StaffPatient> joinSP(@RequestParam int sp) {
		return joinSP.getJoinSP(sp);
	}
}