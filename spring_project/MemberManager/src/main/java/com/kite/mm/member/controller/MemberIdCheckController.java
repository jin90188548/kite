package com.kite.mm.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kite.mm.member.service.MemberRegService;

@Controller
public class MemberIdCheckController {

	@Autowired
	private MemberRegService regService;
	
	@RequestMapping("/member/idCheck1")
	public String idCheck1(
			@RequestParam("id") String id,
			Model model
			) {
		
		model.addAttribute("result", regService.idCheck1(id));
		
		return "member/idCheck";
	}
	
	@RequestMapping("/member/idCheck2")
	@ResponseBody
	public String idCheck2(
			@RequestParam("id") String id
			) {
		
		return regService.idCheck1(id) ;
	}
	
	
	
	
	
	
	
}
