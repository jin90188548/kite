package com.kite.mvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kite.mvc.domain.GuestMessage;
import com.kite.mvc.domain.GuestMessage2;
import com.kite.mvc.domain.GuestMessagelist;
import com.kite.mvc.domain.GuestMessagelist2;

@Controller
public class GuestMessageController {

	@RequestMapping("/guestmessage/list.xml")
	@ResponseBody
	public GuestMessagelist listXml() {
		return getMessageList();
	}
	
	@RequestMapping("/guestmessage/list.json")
	@ResponseBody
	public GuestMessagelist2 listJson() {
		return getMessageList2();
	}
	
	
	
	

	private GuestMessagelist getMessageList() {
		
		List<GuestMessage> message = new ArrayList<GuestMessage>();
		message.add(new GuestMessage(1, "메시지1", new Date()));
		message.add(new GuestMessage(2, "메시지2", new Date()));
		message.add(new GuestMessage(3, "메시지3", new Date()));
		
		return new GuestMessagelist(message);
	}
	
	private GuestMessagelist2 getMessageList2() {
		
		List<GuestMessage2> message = new ArrayList<GuestMessage2>();
		message.add(new GuestMessage2(1, "메시지1", new Date()));
		message.add(new GuestMessage2(2, "메시지2", new Date()));
		message.add(new GuestMessage2(3, "메시지3", new Date()));
		
		return new GuestMessagelist2(message);
	}
	
}
