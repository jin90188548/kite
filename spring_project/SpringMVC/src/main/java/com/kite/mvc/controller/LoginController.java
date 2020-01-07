package com.kite.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/login/login")
public class LoginController {

	@RequestMapping(value="/login/login", method = RequestMethod.GET)
	public String loginForm() {
		return "login/loginForm";
	}
	
	
	// login(request, request.getParameter("uid"))
	@RequestMapping(value="/login/login", method = RequestMethod.POST)
	public String login(
			HttpServletRequest request,
			@RequestParam(value="uid", defaultValue = "scott") String id,
			@RequestParam(value="pw", required = false) String pw
			) {
		
		System.out.println(request.getParameter("uid"));
		System.out.println(request.getParameter("pw"));
		System.out.println(id);
		System.out.println(pw);
		
		
		
		
		
		return "login/login";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
