package com.kite.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.jdbc.domain.Member;
import com.kite.jdbc.service.MemberListService;

@Controller
public class SearchListController {
	
	@Autowired
	MemberListService listService;
	
	@RequestMapping("/member/searchList")
	public String searchList(
			@RequestParam(value = "stype", required = false) String stype,
			@RequestParam(value = "keyword", required = false ) String keyword,
			Model model
			) {
		
		if(stype!=null 
			&& keyword!=null 
			&& stype.trim().length()>0 
			&& keyword.trim().length()>0 ) {
			
			List<Member> list =  listService.serchList(stype, keyword);	 
			model.addAttribute("list", list);
		}
		
		
		
		return "member/searchList";
	}
	

}
