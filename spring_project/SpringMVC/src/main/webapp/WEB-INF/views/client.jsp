<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
</head>
<body>

	<input type="button" value="저장" id="btn">

	<script>
	
		$(document).ready(function(){
			
			var obj = {
				id:1,
				name:'cool',
				email:'cool@hot.com',
				photo: 'cool.png'
			};
			
			$('#btn').click(function(){
			
				$.ajax({
					url: 'api/members',
					type: 'POST',
					data: JSON.stringify(obj),
					contentType: 'application/json; charset=utf-8',
					/* dataType: 'json', */
					sucess: function(res){
						alert(res);
					}
				});
			});
			
			
			
			
			
		});
	
	
	
	
	
	</script>









</body>
</html>