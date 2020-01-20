<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
	<nav class="navbar navbar-expand-lg fixed-top navbar-dark bg-dark">
	
		<a class="navbar-brand mr-auto mr-lg-0" href="<c:url value="/"/>">MemberManager</a>
		
		
		<button class="navbar-toggler p-0 border-0" type="button"
			data-toggle="offcanvas">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="navbar-collapse offcanvas-collapse"
			id="navbarsExampleDefault">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item "><a class="nav-link" href="#">HOME
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="<c:url value="/member/regist"/>">회원가입</a>	</li>
				<c:if test="${loginInfo eq null}">
				<li class="nav-item"><a class="nav-link" href="<c:url value="/member/login"/>">회원로그인</a></li>
				</c:if>
				<c:if test="${loginInfo ne null}">
				<li class="nav-item"><a class="nav-link" href="<c:url value="/member/logout"/>">회원로그아웃</a></li>
				</c:if>
				<li class="nav-item"><a class="nav-link" href="<c:url value="/member/list"/>">회원리스트</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="https://example.com"
					id="dropdown01" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">방명록</a>
					<div class="dropdown-menu" aria-labelledby="dropdown01">
						<a class="dropdown-item" href="<c:url value="/guest/write"/>">방명록 작성</a> 
						<a class="dropdown-item" href="<c:url value="/guest/list"/>">벙명록 리스트 보기</a>
					</div>
				</li>
			</ul>
			
			<div class="form-inline my-2 my-lg-0">
			<c:if test="${loginInfo ne null}">
				<img src="<c:url value='/uploadfile/userphoto/${loginInfo.uphoto}'/>" style="width:40px;border-radius: 50%;margin-right:5px;" /> ${loginInfo.uname} 님
			</c:if>
			</div>
			<!-- <form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="text" placeholder="Search"
					aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form> -->
		</div>
	</nav>
	
	
	