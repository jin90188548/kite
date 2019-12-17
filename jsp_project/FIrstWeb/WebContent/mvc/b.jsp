<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--CDN 방식으로 jQuery 라이브러리를 로드-->
        <script
  src="https://code.jquery.com/jquery-1.12.4.js"
  integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
  crossorigin="anonymous"></script>
<style>

	* {
		margin : 0;
		padding : 0;
	}

</style>
</head>
<body>

	<h1>view b </h1>
	<% 
		String resultData = (String)request.getAttribute("result");
	%>
	<h1> 결과 : <%= resultData %></h1>
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>