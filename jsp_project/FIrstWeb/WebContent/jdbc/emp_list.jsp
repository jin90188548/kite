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
	
	table {		
		width : 60%;		
	}
	
	

</style>
</head>
<body>

	<%
		//1. 드라이버 로딩 : 한번만 실행해도 됨.
		//Class.forName("oracle.jdbc.driver.OracleDriver");
	
		//2. 컨넥션
		
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String pw = "tiger";
		
		Connection conn = DriverManager.getConnection(jdbcUrl, user, pw);
	
		
		// 3. Statement 객체 생성
		
		Statement stmt = conn.createStatement();
		
		String sql = "select * from emp order by empno";
	
		ResultSet rs = stmt.executeQuery(sql);
		
	%>
	<h1>사원 리스트</h1>
	<hr>
	<table border="1">
		<tr>
			<td>사원번호</td>
			<td>사원이름</td>
			<td>직급</td>
		<tr>
	<%
		while(rs.next()){
	%>
		<tr>
			<td><%= rs.getInt("empno") %></td>
			<td><%= rs.getString("ename") %></td>
			<td><%= rs.getString("job") %></td>
		<tr>		
	<%
		}
	
		rs.close();
		stmt.close();
		conn.close();
	
	%>
	</table>


















</body>
</html>