package com.kite.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kite.mvc.domain.MemberVo;

@RestController
public class RestApiController {

	@PostMapping("/api/members")
	public String insertMember(@RequestBody MemberVo member) {		
		return member.toString(); 
	}

}








