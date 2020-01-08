package com.kite.op.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kite.op.domain.OpMember;
import com.kite.op.service.ListMemberServiceImpl;

@Controller
public class MemberListController {
	
	@Autowired
	ListMemberServiceImpl service;
	
	@RequestMapping("/member/list")
	public String getMemberList(Model model) {
		
		List<OpMember> members = service.getMemberList();
		
		model.addAttribute("memberList", members);
		
		return "member/list";
	}

}






