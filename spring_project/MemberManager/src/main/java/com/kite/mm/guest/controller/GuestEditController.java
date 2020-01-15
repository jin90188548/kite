package com.kite.mm.guest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.mm.guest.domain.WriteRequest;
import com.kite.mm.guest.service.GuestEditService;
import com.kite.mm.guest.service.GuestViewService;

@Controller
@RequestMapping("/guest/edit")
public class GuestEditController {
	
	@Autowired
	GuestViewService viewService;
	
	@Autowired
	GuestEditService editService;

	@RequestMapping(method = RequestMethod.GET)
	public String editForm(
			@RequestParam(value="idx", defaultValue = "-1") int idx,
			Model model
			) {
		
		model.addAttribute("article", viewService.getArticle(idx));
		
		return "guest/editForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String edit(WriteRequest request, Model model) {
		
		model.addAttribute("result", editService.editArticle(request));
				
		return "guest/edit";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
