package tw.com.yichih.controller;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tw.com.yichih.pojo.SysUser;
import tw.com.yichih.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private Sid sid;
	

	@RequestMapping("/saveuser")
	@ResponseBody
	public String saveuser() {
		String id = sid.nextShort();
		SysUser sysuser = new SysUser();
		
		sysuser.setId(id);
		sysuser.setEmail("email3");
		sysuser.setPasswordHash("password3");
		try {
			userService.saveUser(sysuser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Save Successfully";
	}
	@RequestMapping("/updateuser")
	@ResponseBody
	public String updateuser() {
		SysUser user = new SysUser();
		user.setId("2");
		user.setEmail("email32323");
		user.setPasswordHash("password_hash2");
		user.setUsername("username2");
		
		try {
			userService.updateUser(user);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fail update user" + e.getMessage());
		}
		
		return "update successfully";
	}
}
