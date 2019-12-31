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
  <script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>
<style>


	* {
		margin : 0;
		padding : 0;
	}
	
	#nav {
		overflow: hidden;
		list-style: none;
		margin : 10px 0;
		border-top : 1px solid #999;
		border-bottom : 1px solid #999;
	}
	#nav>li {
		float : left;
		padding : 3px 30px;
	}
	


</style>
</head>
<body>

<%@ include file="/WEB-INF/views/frame/header.jsp" %>

	<h1>회원 로그인</h1>
	<hr>
	<form action="login" method="post">
	
		<input type="hidden" name="refferPage" value="${referer}">
		
		<table class="inputBox">
			<tr>
				<td>아이디(이메일)</td>
				<td>
				
				<input type="text" name="uid" >
				
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="로그인"></td>
			</tr>
		</table>
	</form>
	
	<h1><a>카카오 로그인</a></h1>
	<h1><a>구글 로그인</a></h1>
	
	

	<script>
		$(document).ready(function() {

/* 			var selectOptions = '';

			for (var i = 2019; i >= 1950; i--) {
				selectOptions += '<option value="'+i+'">' + i + '</option>\n';
			}

			$('#byear').html(selectOptions);  */

		});
	</script>
	
		<script type='text/javascript'>
		//<![CDATA[
		// 사용할 앱의 JavaScript 키를 설정해 주세요.
		Kakao.init('a2db6668ca4369582bb65eff2ecc65f1');
		
		function logoutWithKakao() {
			
			Kakao.Auth.logout(function(){
				
				$('#btn_login').css('display', 'block');
				$('#btn_logout').css('display', 'none');
				//$('#status').css('display', 'none');
				$('#info').css('display', 'none');
				
				alert('로그아웃되었습니다.');
				
				
			});
			
		}
		
		function infofWithKakao() {
		
			Kakao.API.request({
				
				url : '/v2/user/me',
				success : function(user){
					alert(user.kakao_account.profile.nickname);
	        		alert(user.kakao_account.profile.thumbnail_image_url);
	        		alert(user.kakao_account.profile.profile_image_url);
	        		alert(user.kakao_account.birthday);
	        		alert(user.kakao_account.gender);
	        		alert(user.kakao_account.age_range);
				},
				fail : function(error){
					alert(JSON.stringify(error));
				}
				
				
			});
			
		}
		
		

		function statusWithKakao() {

			Kakao.Auth.getStatusInfo(function(statusObj) {
				alert(JSON.stringify(statusObj));

				if (statusObj.status == 'connected') {
					alert('로그인 상태입니다.');
				} else if (statusObj.status == 'not_connected') {
					alert('로그인이 필요합니다.');
					logInWithKakao();
				}

			});

		}

		function logInWithKakao() {

			Kakao.Auth.login({
				success : function(obj) {

					alert('로그인 되었습니다.');
				
					// 서비스의 서버쪽으로 사용자의 데이터를 전송
					$.ajax({
						url : 'kakaoLogin', // /op/login/kakaoLogin
						data : {
							email : obj.kakao_account.email,
							nicname : obj.kakao_account.profile.nickname,
							gender : obj.kakao_account.gender,
							bday : obj.kakao_account.birthday,
							photo : obj.kakao_account.profile.profile_image_url
						},
						success : function(data){
							if(data=='login') {
								location.href='../users/myPage';
							}
						}
					});
					
					
				},
				fail : function() {
					alert('error')
				}
			});

		}

		//]]>
	</script>
















</body>
</html>