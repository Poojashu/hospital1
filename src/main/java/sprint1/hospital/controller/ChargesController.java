package sprint1.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sprint1.hospital.entity.ChargesSG;
import sprint1.hospital.repo.ChargesRepo;

@Controller
@RequestMapping("/charges")
public class ChargesController {

	@Autowired
	ChargesRepo chargesrepo;

	@GetMapping("/add")
	public String Chargesadd() {
		return "chargesadd";
	}

	@GetMapping("/delete")
	public String Chargesdelete() {
		return "chargesdelete";
	}

	@GetMapping("/home")
	public String Chargeshome() {
		return "chargeshome";
	}

	@PostMapping("/add")
	public String addCharges(@RequestParam int amount, String sname) {
		ChargesSG userobj = new ChargesSG();
		userobj.setAmount(amount);
		userobj.setSname(sname);
		chargesrepo.save(userobj);
		return "added";
	}

	@PostMapping("/delete")
	public String deleteCharges(String sname) {
		chargesrepo.deleteBySname(sname);
		return "deleted";
	}

	@GetMapping("/all")
	public String selectCharges() {
		return "chargesresult";
	}

	@GetMapping("/all2")
	public String selectCharges2() {
		return "chargesresult2";
	}
	
	@GetMapping("/userhome")
	public String uChargeshome() {
		return "uchargeshome";
	}

	@GetMapping("/userfindbyname")
	public String uChargesfindname() {
		return "uchargesfindbyname";
	}

	@PostMapping("/userfindbyname")
	public @ResponseBody Iterable<ChargesSG> findnameuCharges(String sname) {
		return chargesrepo.findBySname(sname);
	}
}