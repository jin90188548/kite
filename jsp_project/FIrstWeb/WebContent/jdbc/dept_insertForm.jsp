<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 정보 입력</title>
<!--CDN 방식으로 jQuery 라이브러리를 로드-->
<script src="https://code.jquery.com/jquery-1.12.4.js"
	integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
	crossorigin="anonymous"></script>
<style>
* {
	margin: 0;
	padding: 0;
}
</style>
</head>
<body>

	<h1>부서 정보 입력</h1>

	<form action="dept_insert.jsp" method="post">
		<table>
			<tr>
				<td>부서번호</td>
				<td><input type="text" name="deptno"></td>
			</tr>
			<tr>
				<td>부서이름</td>
				<td><input type="text" name="dname"></td>
			</tr>
			<tr>
				<td>부서위치</td>
				<td><input type="text" name="loc"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="등록"></td>
			</tr>
		</table>
	</form>
















</body>
</html>