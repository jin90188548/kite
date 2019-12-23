<%@page import="jdbc.ConnectionProvider"%>
<%@page import="java.sql.*"%>
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
<style>

	* {
		margin : 0;
		padding : 0;
	}

</style>
</head>
<body>


	<%
	
		String dno = request.getParameter("dno");
	
		String sql = "delete from dept where deptno=?";
		
		// 1. 드라이버 로드 : Servlet에서 초기화 처리
		// 2. Connection 객체 생성
		/* String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String pw = "tiger";
		
		Connection conn = DriverManager.getConnection(jdbcUrl, user, pw); */
		
		Connection conn = ConnectionProvider.getConnection();
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, Integer.parseInt(dno));
		
		int result = pstmt.executeUpdate();
		
		if(result>0){
			
	%>
	
	<h1><%= dno %>번 부서의 정보가 삭제 되었습니다.</h1>
	
	<%	} else {%>
	
	<h1>삭제하고하는 정보가 없습니다.</h1>
	
	<%	} %>

	<a href="dept_list.jsp"> 부서 리스트 보기 </a>
















</body>
</html>