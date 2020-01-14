package com.kite.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.jdbc.service.MemberDeleteService;

@Controller
public class MemberDelController {
	
	@Autowired
	MemberDeleteService delService;

	@RequestMapping("/member/delete")
	public String deleteMember(
			@RequestParam(value = "id", defaultValue = "-1") int id,
			Model model
			) {
		
		model.addAttribute("result", delService.deleteMember(id) );
		
		return "member/delete";
	}

}











