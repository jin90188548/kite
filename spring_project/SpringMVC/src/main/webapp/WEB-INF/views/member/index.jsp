<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC</title>
<style>
	li {
		font-size: 1.5em;
		list-style: none;
	}
</style>
</head>
<body>

	<h1>Spring MVC</h1>
	<h3>${msg}</h3>
	
	<hr>
	
	<ul> 
		<li><a href="<c:url value="/index" />">/index</a></li>
		<li><a href="<c:url value="/login/login" />">/login/login</a></li>
		<li><a href="<c:url value="/order/order" />">/order/order</a></li>
		<li><a href="<c:url value="/cookie/make" />">/cookie/make</a></li>
		<li><a href="<c:url value="/cookie/view" />">/cookie/view</a></li>
		<li><a href="<c:url value="/member/list" />">/member/list</a></li>
		<li><a href="<c:url value="/member/search" />">/member/search</a></li>
		<li><a href="<c:url value="/member/view/cool" />">/member/view/cool</a></li>
		<li><a href="<c:url value="/member/view/hot" />">/member/view/hot</a></li>
	</ul>
	
	
	
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>