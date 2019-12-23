package mvctest;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. 사용자의 요청 분석 : URI 를 통한 요청 분석

		String command = request.getRequestURI();
		System.out.println(command);
		if (command.indexOf(request.getContextPath()) == 0) {
			command = command.substring(request.getContextPath().length());
		}
		System.out.println("요청 : " + command);

		// 2. 요청을 처리하는 핵심 기능 처리 -> 결과 데이터 반환
		// 핵심처리하는 Service 클래스의 메서드를 호출 : 결과 데이터 반환
		Object objResult = null;

		String viewPage = "";

		switch (command) {
		case "/members":
			objResult = "회원 리스트 페이지";
			viewPage = "member_list.jsp";
			break;
		case "/insertForm":
			objResult = "회원 가입 페이지";
			viewPage = "member_insertForm.jsp";
			break;
		case "/editForm":
			objResult = "회원 수정 페이지";
			viewPage = "member_editForm.jsp";

			break;
		case "/delete":
			objResult = "회원 리스트 페이지";
			viewPage = "member_delete.jsp";

			break;

		default:
			objResult = "지원하지않는 요청입니다.";
			viewPage = "invalid.jsp";
			break;
		}

		// 3. request 속성에 결과 데이터를 저장 : 포워딩 되는 뷰 펭이지에 데이터를 전달
		request.setAttribute("result", objResult);

		// 4. 뷰 지정, 포워딩
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);

	}

}
