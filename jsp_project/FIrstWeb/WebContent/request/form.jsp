<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
</style>
</head>
<body>

	<form action="view_data.jsp" method="post">
	
		이름 : <input type="text" name="uname"> <br>
		주소 : <input type="text" name="address"> <br>
		
		좋아하는 동물 : 
		<input type="checkbox" name="pet" value="dog"> 강아지, 
		<input type="checkbox" name="pet" value="cat"> 고양이,
		<input type="checkbox" name="pet" value="pig"> 돼지
		
		<br>
		
		<input type="submit" value="전송">
		
	</form>















</body>
</html>