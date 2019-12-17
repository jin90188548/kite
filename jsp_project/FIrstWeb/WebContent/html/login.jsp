<%@page import="member.LoginInfo"%>
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
		String uid = request.getParameter("uid");
		String pw = request.getParameter("pw");
		
		// JDBC -> uid 로 select  -> 결과가 존재하면 pw 비교		
		String mid = "ryuyj76@naver.com";
		String mpw = "1111";
		
		if(uid!=null && pw!=null && uid.equals(mid) && pw.equals(mpw)){
			// 아이디 와 비밀번호 모두 일치 -> 로그인 처리
			// 로그인 처리 : 회원의 정보를 객체로 만들고, 세션에 속성으로 저장
			
			LoginInfo info = new LoginInfo("유영진", "ryuyj76@naver.com", "남자", 2000);
			session.setAttribute("loginInfo", info);
			
			response.sendRedirect("myPage.jsp");
		} else {
		
		
	%>
		<script>
			
			alert('아이디 또는 비밀번호가 틀립니다.');
			location.href='login.html';
		
		</script>
	
	<% 	}	 %>
	
	

















</body>
</html>