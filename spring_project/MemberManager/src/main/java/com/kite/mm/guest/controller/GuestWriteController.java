package com.kite.mm.guest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kite.mm.guest.domain.WriteRequest;

@Controller
@RequestMapping("/guest/write")
public class GuestWriteController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String writeForm() {
		return "guest/writeForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String write(WriteRequest request) {
		System.out.println(request);
		return "guest/write";
	}
	
	
	
	
	
}
