package first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

	// 서블릿 클래스의 작성 규칙
	// 반드시 HttpServlet 상속해야한다. -> Tomcat 에서 실행 가능하다.	
	// 사용 형식 
	// 1. 사용자의 요청에 따라 웹문서(일반 텍스트) 형식으로 응답
	// 2. 초기화 처리
	// 3. Front Controller -> MVC 팬턴
	
	protected void doGet(
			HttpServletRequest request, // 사용자의 요청 정보를 담은 객체
			HttpServletResponse response // 사용자에게 응답할 데이터를 담은 객체
			) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8"); 
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Servlet Page</title></head>");
		out.println("<body>");
		out.println("현재 날짜와 시간은 : " + new Date());
		out.println("</body></html>");
		
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
