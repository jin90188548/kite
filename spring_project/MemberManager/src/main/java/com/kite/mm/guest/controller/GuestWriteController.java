package com.kite.mm.guest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kite.mm.guest.domain.WriteRequest;
import com.kite.mm.guest.service.GuestWriteService;

@Controller
@RequestMapping("/guest/write")
public class GuestWriteController {
	
	@Autowired
	GuestWriteService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public String writeForm() {
		return "guest/writeForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String write(WriteRequest request) {
		
		System.out.println(request);
		
		System.out.println("요청 idx : " + request.getIdx()  );
		
		int result = service.write(request);
		
		System.out.println("결과 : " + result  );
		
		System.out.println("결과 idx : " + request.getIdx()  );
		
		return "guest/write";
	}
	
	
	
	
	
}
