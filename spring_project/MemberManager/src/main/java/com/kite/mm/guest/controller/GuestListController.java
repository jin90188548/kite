package com.kite.mm.guest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuestListController {
	
	@RequestMapping("/guest/list")
	public String list(
			@RequestParam(value="page", defaultValue = "1") int page
			) {
		
		return "guest/list";
	}

}
