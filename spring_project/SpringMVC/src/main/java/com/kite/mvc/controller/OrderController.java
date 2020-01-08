package com.kite.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kite.mvc.service.OrderCommand;

@Controller
@RequestMapping("/order/order")
public class OrderController {
	
	// get : 입력 폼
	@RequestMapping(method = RequestMethod.GET)
	public String orderForm(Model model) {
		
		model.addAttribute("title", "주문 폼");
		
		return "order/orderForm";
	}
	
	// post : 입력 데이터 표현
	@RequestMapping(method = RequestMethod.POST)
	public String order(@ModelAttribute("orderInfo") OrderCommand order) {
		
		System.out.println(order);
		
		return "order/order";
	}

	
	
	
	
	
	
	
	

}
