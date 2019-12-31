<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page trimDirectiveWhitespaces="true" %>
	<div id="header">
		
		<h1>Member Manager : MVC 패턴 이용</h1>

		<ul id="nav">
			<li><a href="<c:url value="/"/>">홈</a></li>
			<li><a href="<c:url value="/member/list"/>">회원 리스트</a></li>
			<li><a href="<c:url value="/member/regForm"/>">회원 가입</a></li>			
			<c:if test="${loginInfo eq null}">
			<li><a href="<c:url value="/login/loginForm"/>">로그인</a></li>
			</c:if>
			<li><a href="<c:url value="/users/mypage"/>">마이페이지</a></li>
			<c:if test="${loginInfo ne null}">
			<li><a href="<c:url value="/login/logout"/>">로그아웃</a></li>
			</c:if>
			
		</ul>
	</div>	
	
	
	
	
	
	
	