package com.spring.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.user.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	//공통 : 시작 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	@GetMapping(value = "/userList")
	public String userList() {
		return "/user/userList";
	}
	//공통 : 시작 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	//연수 : 시작 ==============================================
	@GetMapping(value="/yeonsoo")
	public String yeonsoo() {
		return "/user/yeonsoo";
	}
	//연수 : 끝 ==============================================

	//유진 : 시작 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	@GetMapping(value = "yoojin")
	public String yoojin() {
		return "/user/yoojin";
	}
	
	//유진 : 끝 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	
	//기진 : 시작 ########################################
	@GetMapping(value = "/kijin")
	public String kijin() {
		
		return "/user/kijin";
	}
	
	//기진 : 끝 ########################################
}
