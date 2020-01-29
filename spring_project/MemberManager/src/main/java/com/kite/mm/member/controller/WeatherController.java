package com.kite.mm.member.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class WeatherController {

	@CrossOrigin
	@RequestMapping("/weather")
	public String getInfo(Model model) throws UnsupportedEncodingException {
		
		RestTemplate restTemplate = new RestTemplate();
		String serviceKey = "ZQr9%2FQSrAgf5QXr69EKYDIgkLNdrAn0ci8EGTJFgK%2FeX5VGQZM7IsIdhTiDk%2B7PPwPgoIG1ALpjxXw41PmCtyg%3D%3D";
		String dcodeKey = URLDecoder.decode(serviceKey, "utf-8");
		
		String url = "http://apis.data.go.kr/1360000/VilageFcstInfoService/getVilageFcst"
				+ "?serviceKey="+dcodeKey
				+ "&numOfRows=10"
				+ "&pageNo=1"
				+ "&base_date=20200129"
				+ "&base_time=0200"
				+ "&nx=61"
				+ "&ny=125";
		
		String result = restTemplate.getForObject(url, String.class);
		
		model.addAttribute("result", result);
		
		
		
		return "weather";		
	}
	
}
