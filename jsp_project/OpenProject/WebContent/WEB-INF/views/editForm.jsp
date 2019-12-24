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

	${member}

	<h1>회원 정보 수정</h1>
	<hr>
	<form action="edit" method="post">
	
		<input type="hidden" name="idx" value="${member.idx}">
		
		<table class="inputBox">
			<tr>
				<td>아이디(이메일)</td>
				<td>
				
				<input type="text" name="uid" value="${member.uid}" readonly>
				
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="uname" value="${member.uname}" ></td>
			</tr>
			<tr>
				<td>성별</td>
				<td>남 <input type="radio" name="gender" value="m"
				 <c:if test="${member.gender=='m'}">
				 checked
				 </c:if>
				 > 여 <input type="radio" name="gender" value="w"
				 <c:if test="${member.gender=='w'}">
				 checked
				 </c:if>	
				 >
				</td>
			</tr>
			<tr>
				<td>태어난 년도</td>
				<td>
					<select id="byear" class="byear" name="byear">
					<c:forEach begin="1950" end="2019" step="1" var="i">
						<option value="${i}" 
						<c:if test="${i == member.byear}">
						selected
						</c:if>
						>${i}</option>
					</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>프로필 사진</td>
				<td><input type="file" name="pfile"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="정보수정"></td>
			</tr>
		</table>
	</form>

	<script>
		$(document).ready(function() {

/* 			var selectOptions = '';

			for (var i = 2019; i >= 1950; i--) {
				selectOptions += '<option value="'+i+'">' + i + '</option>\n';
			}

			$('#byear').html(selectOptions);  */

		});
	</script>
















</body>
</html>