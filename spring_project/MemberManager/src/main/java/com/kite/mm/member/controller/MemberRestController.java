package com.kite.mm.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kite.mm.member.domain.OpMember;
import com.kite.mm.member.domain.RequestMemberRegist;
import com.kite.mm.member.service.MemberListService;
import com.kite.mm.member.service.MemberRegService;
import com.kite.mm.member.service.MemberViewService;

@RestController
@RequestMapping("/restapi/v1/members")
public class MemberRestController {

	@Autowired
	MemberViewService viewService;
	
	@Autowired
	MemberListService listService;
	
	@Autowired
	MemberRegService regService;

	@GetMapping
	public List<OpMember> getMembers() {
		return 	listService.getAllList();
	}

	@GetMapping("/{id}")
	public OpMember getMember(@PathVariable("id") int idx) {
		return viewService.getMember(idx);
	}
	
	@PostMapping
	public String regMember(RequestMemberRegist regist, HttpServletRequest request) {
		String result = "fail"; 
		
		if(regService.memberInsert(request, regist) > 0) {
			result = "success";
		}
		
		return result;
	}

	
	
	
	
	
	
	
}
