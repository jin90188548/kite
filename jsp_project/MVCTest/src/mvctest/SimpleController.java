package mvctest;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException   {
		
		
		// 1. 사용자의 요청 분석 : 파라미터의 데이터로 구분
		String type= request.getParameter("type");
		
		// 2. 요청을 처리하는 핵심 기능 처리 -> 결과 데이터 반환
		//    핵심처리하는 Service 클래스의 메서드를 호출 : 결과 데이터 반환
		Object objResult = null;
		
		String viewPage = "";
		
		
		if(type == null || type.equals("greeting")) {
			objResult = "안녕하세요~!!";
			viewPage = "hello.jsp";
		} else if(type.equals("date")) {
			objResult = new Date();
			viewPage = "hello.jsp" ;
		} else {
			objResult = "Invalid Type";
			viewPage = "invalid.jsp";
		}
		
		// 3. request 속성에 결과 데이터를 저장 : 포워딩 되는 뷰 펭이지에 데이터를 전달
		request.setAttribute("result", objResult);
		
		
		// 4. 뷰 지정, 포워딩
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
