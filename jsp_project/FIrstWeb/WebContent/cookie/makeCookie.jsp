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


	<%
		// 1. Cookie 객체 생성
		Cookie c = new Cookie("uname", "son");
		
		// 2. response 에 포함
		response.addCookie(c);
	
	%>

	<h1> 쿠키가 정상적으로 생성되었습니다. <br>
	
		<%= c.getName() %> = <%= c.getValue() %>
	
	</h1>
	
	<a href="view_cookie.jsp">쿠키 정보 보기</a>














</body>
</html>