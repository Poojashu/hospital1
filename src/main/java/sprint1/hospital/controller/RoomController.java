package sprint1.hospital.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sprint1.hospital.entity.RoomSG;
import sprint1.hospital.repo.RoomRepo;

@Controller
@RequestMapping("/room")
public class RoomController {

	@Autowired
	RoomRepo roomrepo;

	@GetMapping("/add")
	public String Roomadd() {
		return "roomadd";
	}

	@GetMapping("/delete")
	public String Roomdelete() {
		return "roomdelete";
	}

	@GetMapping("/home")
	public String Roomhome() {
		return "roomhome";
	}

	@PostMapping("/add")
	public String addRoom(@RequestParam int roomno, String location) {
		RoomSG userobj = new RoomSG();
		userobj.setRoomno(roomno);
		userobj.setLocation(location);
		roomrepo.save(userobj);
		return "added";
	}

	@PostMapping("/delete")
	public String deleteRoom(@RequestParam int roomno) {
		roomrepo.deleteById(roomno);
		return "deleted";
	}

	@GetMapping("/all")
	public String selectRoom() {
		return "roomresult";
	}

	@GetMapping("/all2")
	public String selectRoom2() {
		return "roomresult2";
	}
	
	@GetMapping("/userhome")
	public String uRoomhome() {
		return "uroomhome";
	}

	@GetMapping("/userfindbyid")
	public String uRoomfindid() {
		return "uroomfindbyid";
	}

	@PostMapping("/userfindbyid")
	public @ResponseBody Optional<RoomSG> findiduRoom(@RequestParam int roomno) {
		return roomrepo.findById(roomno);
	}
}