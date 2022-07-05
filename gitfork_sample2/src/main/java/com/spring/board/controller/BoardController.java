package com.spring.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.board.service.BoardService;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
	
	//공통 영역 : 시작 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//공통 영역 : 끝 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	//풍혁 : 시작 ==============================================
		@GetMapping(value = "/poonghyeok")
		public String poonghyeok() {
			
			return "/board/poonghyeok";
		}
		
	//풍혁 : 끝 ==============================================

	//정수 : 시작 ########################################
	
	
	//정수 : 끝 ##########	##############################
		
}
