package com.kite.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.jdbc.domain.Member;
import com.kite.jdbc.service.MemberViewService;

@Controller
public class MemberView2Controller {
	
	@Autowired
	MemberViewService service;
	
	@RequestMapping("/member/views/{id}")
	public String getMemberInfoById(
			@PathVariable(value = "id") int id,
			Model model
			) {
		
		Object result = "회원정보 없음";
		
		Member member = service.getMembers(id);
		
		if(member != null) {
			result = member;
		}
		

		model.addAttribute("result", result);
		
		return "member/view"; 
	}
	

	@RequestMapping("/member/views")
	public String getMemberInfo(
			@RequestParam(value = "email", required = false) String email,
			Model model
			) {
		
		System.out.println(email);
		
		Object result = "회원정보 없음";
		
		if(email != null) {
			Member member = service.getMembers(email);
			
			System.out.println(member);
			
			if(member != null) {
				result = member;
			}
		}
		
		model.addAttribute("result", result);
		
		
		
		return "member/view";
	}
	
	
	
	
	
	
	
	
}
