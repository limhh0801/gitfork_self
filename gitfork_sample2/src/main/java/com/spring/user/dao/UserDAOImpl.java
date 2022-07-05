package com.spring.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDAOImpl implements UserDAO {

	
	//공통 : 시작 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	@Autowired
	private SqlSession yoojinSession;
	
	//공통 : 시작 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	//연수 : 시작 ==============================================
	@Override
	public void service_yeonsoo() {
		
		return ;
	}	
	//연수 : 끝 ==============================================

	//유진 : 시작 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	@Override
	public void service_yoojin() {
	
		return ;
	}
	
	//유진 : 끝 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	
	//기진 : 시작 ########################################
	
	@Override
	public void getKijin() {
		// TODO Auto-generated method stub
		
	}
	
	//기진 : 끝 ########################################

}
