package com.kite.mvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {

	// 쿠키 생성
	@RequestMapping("/cookie/make")
	public String makeCookie(
			HttpServletResponse response,
			Model model
			) {
		
		Cookie c = new Cookie("uid", "cool");
		response.addCookie(c);
		
		model.addAttribute("cookieInfo", c);
			
		return "cookie/make";
		
	}
	
	// 쿠키 확인
	@RequestMapping("/cookie/view")
	public String viewCookie(
			
			@CookieValue(value = "uid", required = false, defaultValue = "N") String uid,
			
			Model model
			
			) {
		
		System.out.println("cookie(uid) : " + uid);
		
		model.addAttribute("cUid", "cookie(uid) : " + uid);
		
		
		
		return "cookie/view";
	}
	
	
	
	
	
	
	
	
	
}
