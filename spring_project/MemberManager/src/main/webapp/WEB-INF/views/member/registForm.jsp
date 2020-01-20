<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">
	
	<title>회원가입</title>
	
	
	<!-- 기본 CSS 처리 시작 -->
	<%@ include file="/WEB-INF/views/include/basic.jsp" %>	
	<!-- 기본 CSS 처리 끝 -->
	
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
          <h6 class="mb-0 text-white lh-100">회원가입</h6>
          <small>member manager</small>
        </div>
      </div>

      <div class="my-3 p-3 bg-white rounded box-shadow">
        <h6 class="border-bottom border-gray pb-2 mb-0">회원 가입</h6>
        <div class=" text-muted pt-3">
        
          <form method="post" enctype="multipart/form-data">
          
          <div class="form-group">
          	<label for="writer">ID(email)</label>
          	<input type="text"  class="form-control" id="uid" name="uid" required>
          </div>
          
          <div class="form-group">
          	<label for="title">비밀번호</label>
          	<input type="text" class="form-control" id="pw" name="pw" required>          	
          </div>
          
          <div class="form-group">
          	<label for="title">이름</label>
          	<input type="text" class="form-control" id="uname" name="uname" required>          	
          </div>
          
          <div class="form-group">
          	<label for="title">생일</label>
          	<select class="form-control" id="byear" name="byear" required>
          		<option value="2020">2020</option>
          		<option value="2020">2019</option>
          		<option value="2020">2018</option>
          		<option value="2020">2017</option>
          	</select>         	
          </div>
          
          <div class="form-group">	         
          	<label>성별</label> 	
          	<div class="form-group">
          	
	          <div  class="form-check form-check-inline">
	          	<label for="title" class="form-check-label">남자</label>
	          	<input type="radio" class="form-check-input" id="gender" name="gender" value="M" required checked>
	          	<label for="title" class="form-check-label">여자</label>
	          	<input type="radio" class="form-check-input" id="gender" name="gender" value="F" required>          	
	          </div>
          	</div>          	          	
          </div>
          
          <div class="form-group">
          	<label for="title">사진</label>
          	<input type="file" class="form-control" id="photo" name="photo" required>          	
          </div>
          
          <input type="submit" value="회원가입" class="btn btn-primary">
          </form>
          
        </div>
        
      </div>

      
    </main>




	<!-- 메인 컨텐트 끝 -->





	<!-- 푸터 시작 -->
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
	<!-- 푸터 끝 -->
	
	
	
	
	
	
	
	
	
</body>
</html>