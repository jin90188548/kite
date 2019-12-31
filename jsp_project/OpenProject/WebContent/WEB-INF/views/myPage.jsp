<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	
	#nav {
		overflow: hidden;
		list-style: none;
		margin : 10px 0;
		border-top : 1px solid #999;
		border-bottom : 1px solid #999;
	}
	#nav>li {
		float : left;
		padding : 3px 30px;
	}
	
	

</style>
</head>
<body>

<%@ include file="/WEB-INF/views/frame/header.jsp" %>
	
	
	<c:if test="${loginInfo ne null}">
		<h1>회원 정보 </h1>
		<ul>
			<li>이름 : ${loginInfo.uname}</li>
			<li>아이디 : ${loginInfo.uid}</li>
			<li>성별 : ${loginInfo.gender}</li>
			<li>태어난 해 : ${loginInfo.byear}</li>
			<li> 
			<c:if test="${loginInfo.uphoto ne null}">
				<img src="${loginInfo.uphoto}">
			</c:if>			
			</li>
		</ul>
	</c:if>

	<c:if test="${loginInfo eq null}">
		<script>
			alert('로그인이 필요한 서비스 입니다. 확인해주세요.');
			location.href= '../login/loginForm';
		</script>

	</c:if>







</body>
</html>