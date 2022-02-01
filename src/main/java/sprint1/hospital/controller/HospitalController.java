package sprint1.hospital.controller;

import java.util.regex.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class HospitalController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "loginpage";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String adminPage(ModelMap model, @RequestParam String userid, @RequestParam String password) {
		Pattern P = Pattern.compile("[A-Za-z]{4}[0-9]{2}");
		Matcher M = P.matcher(userid);
		if (userid.equalsIgnoreCase("admin") && password.equals("root")) {
			return "adminhome";
		} else if (M.matches() && password.equals("user")) {
			return "userhome";
		}
		model.put("errormsg", "Wrong Credentials!!");
		return "loginpage";
	}

	@GetMapping("/useridp")
	public String UserIDP() {
		return "useridp";
	}

	@GetMapping("/userhome")
	public String UserHome() {
		return "userhome";
	}

	@GetMapping("/home")
	public String Home() {
		return "adminhome";
	}
}