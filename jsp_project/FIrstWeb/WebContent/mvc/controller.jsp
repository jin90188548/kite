<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page trimDirectiveWhitespaces="true" %>


	
	
	<c:choose>
		<c:when test="${param.type=='A'}">
			<c:set var="result" value="A 페이지 입니다." scope="request"/>
			<c:set var="fpage" value="a.jsp"/>
		</c:when>
		<c:when test="${param.type=='B'}">
			<c:set var="result" value="B페이지가 정답입니다." scope="request"/>
			<c:set var="fpage" value="b.jsp"/>
		</c:when>
		<c:when test="${param.type=='C'}">
			<c:set var="result" value="Page C" scope="request"/>
			<c:set var="fpage" value="c.jsp"/>
		</c:when>
	</c:choose>
	
		
	<jsp:forward page="${fpage}"/>
	
	
	<%-- 

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
	
	%> --%>
	
	
	