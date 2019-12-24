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

</style>
</head>
<body>

	<h1>회원 리스트</h1>
	
	
	
	<table border="1">
		<tr>
			<td>no(idx)</td>
			<td>ID(email)</td>
			<td>이름</td>
			<td>비밀번호</td>
			<td>성별</td>
			<td>생년</td>
			<td>사진</td>	
			<td>관리</td>		
		</tr>
		
		<c:forEach items="${memberList}" var="member">
		<tr>
			<td>${member.idx}</td>
			<td>${member.uid}</td>
			<td>${member.uname}</td>
			<td>${member.pw}</td>
			<td>${member.gender}</td>
			<td>${member.byear}</td>
			<td>${member.uphoto}</td>	
			<td>
				<a href="editForm?midx=${member.idx}">수정</a> 
				| 
				<a href="delete">삭제</a>
			</td>		
		</tr>
		</c:forEach>
	</table>















</body>
</html>