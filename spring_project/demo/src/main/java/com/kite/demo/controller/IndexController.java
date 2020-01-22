package com.kite.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kite.demo.domain.OpMember;
import com.kite.demo.mapper.MemberMapper;

@Controller
public class IndexController {
	
	@Autowired
	private MemberMapper mapper;

	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("msg", "Spring Boot!!");
		return "index";
	}
	
	@GetMapping("/members/list.json")
	@ResponseBody
	public List<OpMember> getMembers(){		
		return mapper.getMemberList();
	}
	
	
	
	
	
	
	
	
	
	
	
}
