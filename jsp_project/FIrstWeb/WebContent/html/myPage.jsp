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
		// 로그인 유무 확인 -> session 속성에 loginInfo 확인
	
		LoginInfo info = (LoginInfo) session.getAttribute("loginInfo");
	
		if(info==null){
	%>
		<script>
			alert('로그인이 필요한 서비스 입니다.');
			location.href = 'login.html';
		
		</script>
	
	<%	} else {%>
	
		<h1> 회원 정보</h1>
		<h3>
			이름 : <%= info.getName()%> <br>
			아이디 : <%= info.getId()%> <br>
			성별 :  <%= info.getGender()%> <br>
			태어난 년도 :  <%= info.getByear()%> <br>
		</h3>
		<a href="logout.jsp">로그아웃</a>
	
	<%	} %>


















</body>
</html>