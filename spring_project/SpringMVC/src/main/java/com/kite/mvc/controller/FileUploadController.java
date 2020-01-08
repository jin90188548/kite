package com.kite.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.kite.mvc.domain.Report;

@Controller
public class FileUploadController {
	
	@RequestMapping("/fileupload/form")
	public String form() {
		return "fileupload/form";
	}
	
	@RequestMapping(value="/fileupload/submit1", method = RequestMethod.POST)
	public String submit1(
			@RequestParam("sno") String sno,
			@RequestParam("report") MultipartFile reportFile,
			Model model
			) {
		
		System.out.println("학번 : " + sno);
		System.out.println("리포트 : " + reportFile.getOriginalFilename() + "("+
					reportFile.getSize()+")");
		
		model.addAttribute("report", "리포트 : " + reportFile.getOriginalFilename() + "("+
					reportFile.getSize()+")");
		
		return "fileupload/upload";
	}

	
	@RequestMapping(value="/fileupload/submit2", method = RequestMethod.POST)
	public String submit2(
			MultipartHttpServletRequest request,
			Model model
			) {
				
		String sno = request.getParameter("sno");
		MultipartFile reportFile = request.getFile("report");
		
		System.out.println("학번 : " + sno);
		System.out.println("리포트 : " + reportFile.getOriginalFilename() + "("+
					reportFile.getSize()+")");
		
		model.addAttribute("report", "리포트 : " + reportFile.getOriginalFilename() + "("+
					reportFile.getSize()+")");
		
		return "fileupload/upload";
	}
	


	
	@RequestMapping(value="/fileupload/submit3", method = RequestMethod.POST)
	public String submit3(
			Report report,
			Model model
			) {
		
		String sno = report.getSno();
		MultipartFile reportFile = report.getReport();
		
		System.out.println("학번 : " + sno);
		System.out.println("리포트 : " + reportFile.getOriginalFilename() + "("+
					reportFile.getSize()+")");
		
		model.addAttribute("report", "리포트 : " + reportFile.getOriginalFilename() + "("+
					reportFile.getSize()+")");
		
		return "fileupload/upload";
	}
	
	
	
	
	
	
	
	
	
	
	

}
