package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.EditFormMemberService;
import service.EditMemberServiceImpl;
import service.IndexMemberServiceImpl;
import service.LIstMemberServiceImpl;
import service.MemberService;
import service.RegFormMemberServiceImpl;
import service.RegMemberServiceImpl;

public class FrontController extends HttpServlet {
	
	private Map<String, MemberService> uriMap = 
			
			new HashMap<String, MemberService>();

	// 1. 초기화 : Service 객체들을 관리 -> init() 오버라이딩
	@Override
	public void init() throws ServletException {
		
		// / 요청
		uriMap.put("/", new IndexMemberServiceImpl());
		// /index
		uriMap.put("/index", new IndexMemberServiceImpl());
		// /member/regForm
		uriMap.put("/member/regForm", new RegFormMemberServiceImpl());
		uriMap.put("/member/reg", new RegMemberServiceImpl());
		
		// 회원 리스트
		uriMap.put("/member/list", new LIstMemberServiceImpl());
				
		// 회원 정보 수정
		uriMap.put("/member/editForm", new EditFormMemberService());
		uriMap.put("/member/edit", new EditMemberServiceImpl());
		
		
		// 기능 확장 : Service 구현 클래스 생성 , view(JSP) 생성
		
		
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
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		// 요청 분석
		String uri = request.getRequestURI();   //    /op/member/list
		String conPath = request.getContextPath();//  /op
		
		if(uri.indexOf(conPath)==0) {
			uri = uri.substring(conPath.length());
		}
		System.out.println("사용자 요청 URI : " + uri);
		
		
		// 요구사항에 대한 처리
		// 핵심처리, 결과 데이터를 request 속성에 저장
		// view 페이지 지정
		
		MemberService ms = null;
		
		ms = uriMap.get(uri);
		
		/*
		 * if(uri.equals("/index") || uri.equals("/")) { ms = new
		 * IndexMemberServiceImpl(); } else if(uri.equals("/member/regForm")) { ms = new
		 * RegFormMemberServiceImpl(); }
		 */
		
		String viewPage = "/WEB-INF/views/invalid.jsp"; 
				
		if(ms!=null) {
			viewPage = ms.process(request);
		}
				
				 
		
		
		// 포워딩
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
