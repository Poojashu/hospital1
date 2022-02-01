package sprint1.hospital.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sprint1.hospital.entity.StaffsSG;
import sprint1.hospital.repo.StaffsRepo;

@Controller
@RequestMapping("/staffs")
public class StaffsController {

	@Autowired
	StaffsRepo staffsrepo;

	@GetMapping("/add")
	public String Staffsadd() {
		return "staffsadd";
	}

	@GetMapping("/delete")
	public String Staffsdelete() {
		return "staffsdelete";
	}

	@GetMapping("/home")
	public String Staffshome() {
		return "staffshome";
	}

	@PostMapping("/add")
	public String addStaffs(@RequestParam int id, String name, @RequestParam int room, String mobile) {
		StaffsSG userobj = new StaffsSG();
		userobj.setSid(id);
		userobj.setSname(name);
		userobj.setSroom(room);
		userobj.setSmobile(mobile);
		staffsrepo.save(userobj);
		return "added";
	}

	@PostMapping("/delete")
	public String deleteStaffs(@RequestParam int id) {
		staffsrepo.deleteById(id);
		return "deleted";
	}

	@GetMapping("/all")
	public String selectStaffs() {
		return "staffsresult";
	}

	@GetMapping("/all2")
	public String selectStaffs2() {
		return "staffsresult2";
	}
	
	@GetMapping("/userhome")
	public String uStaffshome() {
		return "ustaffshome";
	}

	@GetMapping("/userfindbyid")
	public String uStaffsfindid() {
		return "ustaffsfindbyid";
	}

	@GetMapping("/userfindbyname")
	public String uStaffsfindname() {
		return "ustaffsfindbyname";
	}

	@PostMapping("/userfindbyid")
	public @ResponseBody Optional<StaffsSG> findiduStaffs(@RequestParam int sid) {
		return staffsrepo.findById(sid);
	}

	@PostMapping("/userfindbyname")
	public @ResponseBody Iterable<StaffsSG> findnameuStaffs(String sname) {
		return staffsrepo.findBySname(sname);
	}
}