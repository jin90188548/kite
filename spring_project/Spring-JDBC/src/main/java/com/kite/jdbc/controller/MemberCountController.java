package com.kite.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kite.jdbc.service.MemberCountService;

@Controller
public class MemberCountController {
	
	@Autowired
	MemberCountService service;

	@RequestMapping("/member/count")
	public String getMemberCount(Model model) {
		
		model.addAttribute("cnt", service.getMemberCount());
		
		return "member/cnt";
	}
	
}






