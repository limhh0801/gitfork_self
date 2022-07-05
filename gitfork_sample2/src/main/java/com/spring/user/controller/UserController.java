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
	
	@GetMapping(value = "yoojin1")
	public String yoojin() {
		return "/user/yoojin";
	}
	@GetMapping(value = "yoojin2")
	public String yoojin2() {
		return "/user/yoojin";
	}
	@GetMapping(value = "yoojin3")
	public String yoojin3() {
		return "/user/yoojin";
	}
	@GetMapping(value = "yoojin44")
	public String yoojin4() {
		
		System.out.println("youjing");
		System.out.println("youjing1");
		System.out.println("youjing2");
		System.out.println("youjing3");
		System.out.println("youjing4");
		System.out.println("youjing1");
		System.out.println("youjing2");
		System.out.println("youjing3");
		System.out.println("youjing4");
		System.out.println("youjing1");
		System.out.println("youjing2");
		System.out.println("youjing3");
		System.out.println("youjing4");
		
		return "/user/yoojin";
	}
	
	//�쑀吏� : �걹 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	
	//湲곗쭊 : �떆�옉 ########################################
	@GetMapping(value = "/kijin")
	public String kijin() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("abc");
		System.out.println("def");
		System.out.println("abc1");
		System.out.println("def2");
		
		System.out.println("2");
		System.out.println("3");
		
		System.out.println("2");
		System.out.println("3");
		
		return "/user/kijin";
	}

	@GetMapping(value = "/kijin2")
	public String kijin2() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("abc");
		System.out.println("def");
		System.out.println("abc1");
		System.out.println("def2");
		
		System.out.println("2");
		System.out.println("3");
		
		System.out.println("2");
		System.out.println("3");
		for(int i = 0; i < 10; i ++) {
			System.out.println("abc");
			System.out.println("abc");
			System.out.println("abc");
			System.out.println("abc");
		}
		return "/user/kijin";
	}
	
	//湲곗쭊 : �걹 ########################################
}
