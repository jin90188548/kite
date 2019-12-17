<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 폼에서 전송한 파라미터 출력</title>
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

	<h1>회원 가입폼에서 전송한 파라미터 값</h1>

	<%
	
		// 한글 인코딩
		request.setCharacterEncoding("utf-8");
	
		// 데이터 받아 출력하기
		// 데이터 받기 : request.getParameter("파라미터 이름");
		
		String uid = request.getParameter("uid");
		String pw = request.getParameter("pw");
		String uname = request.getParameter("uname");
		String gender = request.getParameter("gender");
		String byear = request.getParameter("byear");
		
	%>
	
	아이디 : <%= uid %> <br>
	비밀번호 : <%= pw %> <br>
	이름 : <%= uname %> <br>
	성별 : <%= gender.equals("m") ? "남자" : "여자" %> <br>
	태어난 년도 : <%= byear %>


















</body>
</html>