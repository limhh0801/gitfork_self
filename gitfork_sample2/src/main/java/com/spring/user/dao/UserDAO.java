package com.spring.user.dao;

import org.springframework.beans.factory.annotation.Autowired;

public interface UserDAO {
	//공통 : 시작 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	//공통 : 시작 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	//연수 : 시작 ==============================================
	public void service_yeonsoo();
	//연수 : 끝 ==============================================

	//유진 : 시작 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public void service_yoojin();
	//유진 : 끝 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	
	//기진 : 시작 ########################################
	public void getKijin();
	public void getKijin2();
	public void getKijin3();
	
	//기진 : 끝 ########################################

}
