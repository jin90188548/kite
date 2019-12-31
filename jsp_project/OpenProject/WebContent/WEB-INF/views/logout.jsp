<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page trimDirectiveWhitespaces="true" %>
<c:url value="/"  var="url" />
<script>
	
	alert('로그아웃 되었습니다.');
	location.href = '${url}';
	

</script>
