package com.yeeun.web.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yeeun.web.util.Messenger;

@RestController 
@RequestMapping("/admin") 
public class AdminController {
	@Autowired AdminService adminService;

	@PostMapping("/join")
	public Messenger add(@RequestBody Admin admin) {
		int current = adminService.Count();
		String s = "";
		adminService.add(admin);
		return (adminService.Count()==(current+1))? Messenger.SUCCESS: Messenger.FAIL;

	}
	@PostMapping("/login")
	public Messenger login(@RequestBody Admin admin) {
		return (adminService.login(admin))?Messenger.SUCCESS : Messenger.FAIL;
	}
	@GetMapping("/detail")
	public Admin detail(@RequestBody String userid) {
		Admin returnDetail = new Admin();
		adminService = new AdminSerivceImpl();
		adminService.detail(userid);
	return returnDetail;	
	}
	@GetMapping("/list")
	public Admin[] list(@RequestBody Admin admin) {
		Admin [] returnadmin = new Admin[5];
		return returnadmin;
	}
	@PutMapping("/count")
	public int Count (@RequestBody Admin admin) {
		int returnCount = 0;
		return returnCount;
	}
	@PutMapping("/update")
	public Admin update(@RequestBody Admin admin) {
		Admin returnadmin = new Admin();
		return returnadmin;
	}
	@DeleteMapping("/delete")
	public Admin delete(@RequestBody Admin admin) {
		Admin returnadmin = new Admin();
		return returnadmin;
	
}
	
}
