package com.kite.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexComtroller {
	
	// 사용자 요청 경로 지정  : @RequestMapping
	//@RequestMapping(value = "/index")
	@RequestMapping("/index")
	public ModelAndView index() {
		
		// ModelAndView
		// view의 정보, 결과 데이터 
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/index"); // /WEB-INF/views/member/index.jsp
		mav.addObject("msg", "Hello Spring MVC !!");
		
		return mav;
		
	}

	
	
	
	
	
	
	
	
}
