package com.kite.mm.guest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.mm.guest.domain.GuestListView;
import com.kite.mm.guest.service.GuestListService;

@Controller
public class GuestListController {
	
	@Autowired
	GuestListService service;
	
	@RequestMapping("/guest/list")
	public String list(
			@RequestParam(value="page", defaultValue = "1") int page,
			Model model
			) {
		
		GuestListView view = service.getListView(page);
		
		System.out.println(view);
				
		model.addAttribute("listView", view); 
		
		return "guest/list";
	}

}
