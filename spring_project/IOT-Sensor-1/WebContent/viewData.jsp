<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String data = (String)application.getAttribute("sdata");
	%>
	<h1>
		<%= data %>
	</h1>
</body>
</html>