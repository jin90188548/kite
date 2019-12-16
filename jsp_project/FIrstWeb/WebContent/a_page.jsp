<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
</style>
</head>
<body>
	<h1> a_page 입니다.</h1>
	
	<%-- <jsp:forward page="b_page.jsp"></jsp:forward> --%>
	
	<% response.sendRedirect("b_page.jsp"); %>
	
	
	
	
	
	
	
	
	
</body>
</html>