<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

	<h1>회원정보수정</h1>
	<form method="post">
		<input type="hidden" name="id" value="${memberInfo.id}">
		email <input type="email" name="email" value="${memberInfo.email}" readonly> <br> 
		이름 <input type="text" name="name" value="${memberInfo.name}" required>		<br> 
		비밀번호 <input type="password" name="password" required> <br> 
		<input type="submit">
	</form>
</body>
</html>






