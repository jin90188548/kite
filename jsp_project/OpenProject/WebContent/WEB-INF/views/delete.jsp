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

	
	
	<c:if test="${resultCnt==1}">
		<h1>회원 정보가 삭제되었습니다.</h1>
	</c:if>

	<c:if test="${resultCnt==0 or resultCnt == -1}">
		<h1>회원 정보 삭제중에 오류가 발생했습니다. 다시 시도해주세요.</h1>

	</c:if>

	<a href="list">회원 리스트 보기</a>






</body>
</html>