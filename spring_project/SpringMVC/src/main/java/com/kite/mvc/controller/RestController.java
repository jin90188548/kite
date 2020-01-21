package com.kite.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kite.mvc.domain.MemberVo;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/sample")
public class RestController {

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello() {
		return "hello~!!";
	}
	
	@RequestMapping("/hello")  // /sample/hello
	public MemberVo getMember() {
		MemberVo member = new MemberVo(0, "hot", "hot@hot.com", "hot.jpg");
		return member;
	}

	@RequestMapping("/hello2")  // /sample/hello
	public List<MemberVo> getMember2() {
		List<MemberVo> members = new ArrayList<MemberVo>();
		members.add(new MemberVo(0, "hot", "hot@hot.com", "hot.jpg"));
		members.add(new MemberVo(1, "cool", "cool@cool.com", "cool.jpg"));
		
		return members;
	}


	@RequestMapping("/hello3")  // /sample/hello
	public Map<Integer,MemberVo> getMember3() {
		
		Map<Integer, MemberVo> memberMap = new HashMap<Integer, MemberVo>();
		memberMap.put(0, new MemberVo(0, "hot", "hot@hot.com", "hot.jpg"));
		memberMap.put(1, new MemberVo(1, "cool", "cool@cool.com", "cool.jpg"));
		
		
		return memberMap;
	}
	
	
	
	
	
	
}
