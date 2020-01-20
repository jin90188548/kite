<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page trimDirectiveWhitespaces="true"%>
<c:if test="${loginInfo eq null}">
<script>
	alert('로그인이 필요한 서비스입니다.');
	location.href='<c:url value="/member/login"/>';
</script>

</c:if>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">
	
	<title>회원리스트</title>
	
	
	<!-- 기본 CSS 처리 시작 -->
	<%@ include file="/WEB-INF/views/include/basic.jsp" %>	
	<!-- 기본 CSS 처리 끝 -->
	
	<style>
		
		img.photo {
			width: 60px;
		}
		
	</style>
	
	<script>
		
	</script>
</head>
<body>

	<!-- 해더 시작 -->
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	<!-- 해더 끝 -->


	<!-- 메인 컨텐트 시작 -->
	<main role="main" class="container">
      <div class="d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded box-shadow">
       <!--  <img class="mr-3" src="https://getbootstrap.com/assets/brand/bootstrap-outline.svg" alt="" width="48" height="48"> -->
        <div class="lh-100">
          <h6 class="mb-0 text-white lh-100">회원리스트</h6>
          <small>member manager</small>
        </div>
      </div>

      <div class="my-3 p-3 bg-white rounded box-shadow">
        <h6 class="border-bottom border-gray pb-2 mb-0">회원리스트</h6>
        <%-- ${listView} --%>
        <table class="table">
        	<tr>
        		<th>no</th>
        		<th>ID(Email)</th>
        		<th>이름</th>
        		<th>비밀번호</th>
        		<th>생일</th>
        		<th>성별</th>
        		<th>사진</th>
        		<th>가입일</th>
        		<th>관리</th>
        	</tr>
        	
        	<!-- 리스트 시작 -->
        	<c:forEach items="${listView.memberList}" var="member" >
        	<tr>
        		<td>${member.idx}</td>
        		<td>${member.uid}</td>
        		<td>${member.uname}</td>
        		<td>${member.pw}</td>
        		<td>${member.byear}</td>
        		<td>${member.gender}</td>
        		<td><img src="<c:url value="/uploadfile/userphoto/${member.uphoto}"/>" class="photo"></td>
        		<td><fmt:formatDate value="${member.regdate}" pattern="yyyy. MM. dd"/>
        		</td>
        		<td>
        			<a href="edit?idx=${member.idx}" class="btn btn-primary">수정</a>
        			<a href="javascript:del(${member.idx})" class="btn btn-danger">삭제</a>
        		</td>
        	</tr>
        	
        	</c:forEach>
        	<!-- 리스트 끝 -->
        	
        </table>
        
        <div>
        	<c:forEach begin="1" end="${listView.pageTotalCount}" var="i">
        	<a href="list?page=${i}">[${i}]</a> 
        	</c:forEach>
        </div>
      </div>

      

      
    </main>




	<!-- 메인 컨텐트 끝 -->





	<!-- 푸터 시작 -->
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
	<!-- 푸터 끝 -->
	
	
	
	<script>
	
		function del(idx){
			
			if(confirm('삭제하시겠습니까?')) {
				location.href='delete?idx='+idx;
			}
			
		}
	
	</script>
	
	
	
	
	
	
	
</body>
</html>