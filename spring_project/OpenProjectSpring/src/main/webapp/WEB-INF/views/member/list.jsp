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
				<a href="javascript:delMem(${member.idx})">삭제</a>
			</td>		
		</tr>
		</c:forEach>
	</table>

	<script>
	
		function delMem(idx){
			
			var chk = confirm("삭제 하시겠습니까?");
			if(chk) {
				location.href = 'delete?midx='+idx;
				// /op/member/list  -> /op/member/delete
			}
		}
	
	</script>













</body>
</html>