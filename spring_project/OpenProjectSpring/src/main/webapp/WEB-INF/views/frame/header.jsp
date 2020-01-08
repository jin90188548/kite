<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page trimDirectiveWhitespaces="true"%>

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
			<li><a href="javascript:logout();">로그아웃</a></li>
		</c:if>

	</ul>
</div>

<!-- Insert these scripts at the bottom of the HTML, but before you use any Firebase services -->

<!-- Firebase App (the core Firebase SDK) is always required and must be listed first -->
<script src="https://www.gstatic.com/firebasejs/6.2.0/firebase-app.js"></script>

<!-- Add Firebase products that you want to use -->
<script src="https://www.gstatic.com/firebasejs/6.2.0/firebase-auth.js"></script>
<!-- <script src="https://www.gstatic.com/firebasejs/6.2.0/firebase-firestore.js"></script> -->

<script>
		// Your web app's Firebase configuration
		var firebaseConfig = {
			apiKey : "AIzaSyDT1GQ_Jvmgkr-vNI8Y-D5b1il7tR96ADs",
			authDomain : "kite-iot.firebaseapp.com",
			databaseURL : "https://kite-iot.firebaseio.com",
			projectId : "kite-iot",
			storageBucket : "kite-iot.appspot.com",
			messagingSenderId : "147325261234",
			appId : "1:147325261234:web:edb8b17b8683e3390bc0ab",
			measurementId : "G-CQ38V0G3Z0"
		};
		// Initialize Firebase
		firebase.initializeApp(firebaseConfig);

		// google
		var provider = new firebase.auth.GoogleAuthProvider();

		provider.setCustomParameters({
			'login_hint' : 'user@example.com'
		});
		
		
		// 사용자의 로그인 여부 확인 : 사용자 정보를 출력
		function userInfoGoogle(){
			
			firebase.auth().onAuthStateChanged(function(user) {
				  if (user) {
				    // User is signed in.
				    var displayName = user.displayName;
				    var email = user.email;
				    var emailVerified = user.emailVerified;
				    var photoURL = user.photoURL;
				    var isAnonymous = user.isAnonymous;
				    var uid = user.uid;
				    var providerData = user.providerData;
				    
				    alert(displayName + ' : ' + email);
				    
				    
					  $('#login').css('display', 'none');
					  $('#logout').css('display', 'block');
					  $('#info').css('display', 'block');
				    
				    // ...
				  } else {
				    //alert('로그인이 필요합니다.');
				    //location.href='google_1.html';
				  }
				});
			
		}
		
		
		// 로그아웃
		function signOutGoogle() {
			firebase.auth().signOut().then(function() {
				

				  $('#login').css('display', 'block');
				  $('#logout').css('display', 'none');
				  $('#info').css('display', 'none');
				
				  alert('정상적으로 로그아웃 되었습니다.');
				}).catch(function(error) {
				  // An error happened.
				});
		}
		
		// 로그인 popup
		function signInGoogle() {
			
			firebase.auth().signInWithPopup(provider).then(function(result) {
				  // This gives you a Google Access Token. 
				  // You can use it to access the Google API.
				  var token = result.credential.accessToken;
				  // The signed-in user info.
				  var user = result.user;
				  
				  //alert(JSON.stringify(user));
				  
				  // 비동기 통신
				  // 서비스의 서버쪽으로 사용자의 데이터를 전송
							$.ajax({
								url : 'kakaoLogin', // /op/login/kakaoLogin
								data : {
									email : user.email,
									nicname : user.displayName,
									gender : null,
									bday : 0,
									photo : user.photoURL
								},
								success : function(data) {
									if (data == 'login') {
										location.href = '../users/mypage';
									}
								}
							});
				 
				  
				  // ...
				}).catch(function(error) {
				  // Handle Errors here.
				  var errorCode = error.code;
				  var errorMessage = error.message;
				  // The email of the user's account used.
				  var email = error.email;
				  // The firebase.auth.AuthCredential type that was used.
				  var credential = error.credential;
				  // ...
				});
			
		}
		
		
		
		
	</script>



<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>
<script type='text/javascript'>
		//<![CDATA[
		// 사용할 앱의 JavaScript 키를 설정해 주세요.
		Kakao.init('a2db6668ca4369582bb65eff2ecc65f1');

		function logoutWithKakao() {

			Kakao.Auth.logout(function() {

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
				success : function(user) {
					alert(user.kakao_account.profile.nickname);
					alert(user.kakao_account.profile.thumbnail_image_url);
					alert(user.kakao_account.profile.profile_image_url);
					alert(user.kakao_account.birthday);
					alert(user.kakao_account.gender);
					alert(user.kakao_account.age_range);
				},
				fail : function(error) {
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
					
					Kakao.API.request({

						url : '/v2/user/me',
						success : function(user) {
							// 서비스의 서버쪽으로 사용자의 데이터를 전송
							$.ajax({
								url : 'kakaoLogin', // /op/login/kakaoLogin
								data : {
									email : user.kakao_account.email,
									nicname : user.kakao_account.profile.nickname,
									gender : user.kakao_account.gender,
									bday : user.kakao_account.birthday,
									photo : user.kakao_account.profile.profile_image_url
								},
								success : function(data) {
									if (data == 'login') {
										location.href = '../users/mypage';
									}
								}
							});
						},
						fail : function(error) {
							alert(JSON.stringify(error));
						}

					});

					

				},
				fail : function() {
					alert('error')
				}
			});

		}
		
		function logout(){
			logoutWithKakao();
			location.href='<c:url value="/login/logout"/>';
		}

		//]]>
	</script>









