package com.spring.board.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class BoardDAOImpl implements BoardDAO {
	//공통 영역 : 시작 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	@Autowired
	private SqlSession sqlSession;
	//공통 영역 : 끝 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	//풍혁 : 시작 =======================================
	@Override
	public void service_poong() {
		
		return ;
	}	
	//풍혁 : 끝 ========================================
	
	//은혜 : 시작 ==================================

	//은혜 : 끝 ==================================
		
	//정수 : 시작 ==================================
	
	//정수 : 끝 ==================================


}
