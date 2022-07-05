package com.spring.user.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.user.dao.UserDAO;

public interface UserService {
	
	//공통 : 시작 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void getUser();
	//공통 : 시작 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	//연수 : 시작 ==============================================
	public void service_yeonsoo();
	//연수 : 끝 ==============================================

	//유진 : 시작 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public void service_yoojin();
	//유진 : 끝 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	
	//기진 : 시작 ########################################
	public void kijinUser();
	
	//기진 : 끝 ########################################

}
