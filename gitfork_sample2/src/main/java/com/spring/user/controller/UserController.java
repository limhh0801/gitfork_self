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

	//怨듯넻 : �떆�옉 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	@GetMapping(value = "/userList")
	public String userList() {
		return "/user/userList";
	}
	//怨듯넻 : �떆�옉 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	//�뿰�닔 : �떆�옉 ==============================================
	@GetMapping(value="/yeonsoo")
	public String yeonsoo() {
		return "/user/yeonsoo";
	}
	//�뿰�닔 : �걹 ==============================================

	//�쑀吏� : �떆�옉 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	@GetMapping(value = "yoojin")
	public String yoojin() {
		return "/user/yoojin";
	}
	
	//�쑀吏� : �걹 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	
	//湲곗쭊 : �떆�옉 ########################################
	@GetMapping(value = "/kijin")
	public String kijin() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		
		return "/user/kijin";
	}
	
	//湲곗쭊 : �걹 ########################################
}
