<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>


	<%
	
		String type=request.getParameter("type");
	
		String fpage = "";
	
		if(type.equals("A")){
			// 핵심처리
			String str = "A 페이지 입니다.";
			request.setAttribute("result", str);
			fpage = "a.jsp";
		} else if( type.equals("B")){			
			// 핵심처리.....
			String result = "B페이지가 정답입니다.";
			request.setAttribute("result", result);
			fpage = "b.jsp";
		} else if (type.equals("C")){
			String s = "Page C";
			request.setAttribute("result", s);
			fpage = "c.jsp";
		}
	
	%>
	
	<jsp:forward page="<%=fpage %>"/>
	
	
	