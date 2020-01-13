package com.kite.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kite.jdbc.domain.Member;
import com.kite.jdbc.service.MemberListService;

@Controller
public class MemberListController {

	@Autowired
	MemberListService service;
	
	@RequestMapping("/member/list")
	public String getMemberList(Model model) {
		
		List<Member> members = service.getMemberList();
		
		for (Member member : members) {
			System.out.println(member);
		}
		
		model.addAttribute("members", members);
		
		return "member/list"; 
		//     /WEB-INF/views/member/list.jsp
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
