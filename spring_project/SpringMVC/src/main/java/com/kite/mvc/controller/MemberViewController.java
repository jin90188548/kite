package com.kite.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberViewController {
	
	// view/cool  : cool 변수로 사용
	@RequestMapping("/member/view/{uid}")
	public String memberInfo(
			
			@PathVariable("uid") String uid,
			
			Model model
			) {
		
		System.out.println(uid);
		
		model.addAttribute("userInfo", uid+"님 안녕하세요.");
		
		return "member/view";
	}

}
