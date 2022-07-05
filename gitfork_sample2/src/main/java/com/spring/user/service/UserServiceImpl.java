package com.spring.user.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.user.dao.UserDAO;

public class UserServiceImpl implements UserService {

		
	//공통 : 시작 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		@Override
		public void getUser() {
		
			return;
		}
	//공통 : 시작 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


	//연수 : 시작 ==============================================
		@Override
		public void service_yeonsoo() {
			
			System.out.println("나도 아무 의미 없이 그냥 merge 하려고 만들었다.");
			return ;
		}
	//연수 : 끝 ==============================================

	//유진 : 시작 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		@Override
		public void service_yoojin() {
			
			System.out.println("난유진이다.");
			return ;
		}
	
	//유진 : 끝 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	
	//기진 : 시작 ########################################
		@Override
		public void kijinUser() {
			return ;
		}
	
	
	//기진 : 끝 ########################################

}
