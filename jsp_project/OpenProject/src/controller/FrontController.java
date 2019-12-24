package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {

	// 1. 초기화 : Service 객체들을 관리 -> init() 오버라이딩
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	
	// 2. 모든 요청 처리
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) {
		
		// 요청 분석
		String uri = request.getRequestURI();   //    /op/member/list
		String conPath = request.getContextPath();//  /op
		
		if(uri.indexOf(conPath)==0) {
			uri = uri.substring(conPath.length());
		}
		System.out.println("사용자 요청 URI : " + uri);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
