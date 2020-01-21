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
		<li><a href="<c:url value="/client" />">/client</a></li>
		<li><a href="<c:url value="/sample" />">/sample</a></li>
		<li><a href="<c:url value="/sample/hello" />">/sample/hello</a></li>
		<li><a href="<c:url value="/sample/hello2" />">/sample/hello2</a></li>
		<li><a href="<c:url value="/sample/hello3" />">/sample/hello3</a></li>
		<li><a href="<c:url value="/index" />">/index</a></li>
		<li><a href="<c:url value="/login/login" />">/login/login</a></li>
		<li><a href="<c:url value="/order/order" />">/order/order</a></li>
		<li><a href="<c:url value="/cookie/make" />">/cookie/make</a></li>
		<li><a href="<c:url value="/cookie/view" />">/cookie/view</a></li>
		<li><a href="<c:url value="/member/list" />">/member/list</a></li>
		<li><a href="<c:url value="/member/search" />">/member/search</a></li>
		<li><a href="<c:url value="/member/view/cool" />">/member/view/cool</a></li>
		<li><a href="<c:url value="/member/view/hot" />">/member/view/hot</a></li>
		<li><a href="<c:url value="/fileupload/form" />">/fileupload/form</a></li>
		<li><a href="<c:url value="/uploadfile/test_droid.jpg" />">/uploadfile/test_droid.jpg</a></li>
		<li><a href="<c:url value="/simple" />">/simple</a></li>
		<li><a href="<c:url value="/guestmessage/list.xml" />">/guestmessage/list.xml</a></li>
		<li><a href="<c:url value="/guestmessage/list.json" />">/guestmessage/list.json</a></li>
	</ul>
	
	
	
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>