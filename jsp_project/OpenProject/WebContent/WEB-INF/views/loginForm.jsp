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

	<h1>회원 로그</h1>
	<hr>
	<form action="login" method="post">
	
		<input type="hidden" name="refferPage" value="${referer}">
		
		<table class="inputBox">
			<tr>
				<td>아이디(이메일)</td>
				<td>
				
				<input type="text" name="uid" >
				
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="로그인"></td>
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