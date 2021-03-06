package tw.com.yichih.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tw.com.yichih.Resource;
import tw.com.yichih.pojo.SysUser;
import tw.com.yichih.service.UserService;

@RestController
public class HelloController {
	
	@Autowired
	private Resource resource;
	
	@RequestMapping("/getResource")
	@ResponseBody
	public String getResource() {
		
		System.out.println("Name: " + resource.getName());
		return "resource";
	}
	
	
	
}
