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
		
		String sql = "select * from dept where deptno="+dno; 
		
		// 1. 드라이버 로드
		// 2. Connection 객체생성
		
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String pw = "tiger";
		
		Connection conn = DriverManager.getConnection(jdbcUrl, user, pw);
		
		// 3. Statement
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
	
		if(rs.next()){
	%>
	<h1>부서 정보 수정</h1>

	<form action="dept_edit.jsp" method="post">
		<table>
			<tr>
				<td>부서번호</td>
				<td>
					<input type="text" name="deptno" 
						value="<%= rs.getInt("deptno")%>" readonly>
				</td>
			</tr>
			<tr>
				<td>부서이름</td>
				<td>
					<input type="text" name="dname" value="<%= rs.getString("dname")%>">
				</td>
			</tr>
			<tr>
				<td>부서위치</td>
				<td>
					<input type="text" name="loc" value="<%= rs.getString("loc")%>">
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="등록"></td>
			</tr>
		</table>
	</form>
	
	<%	} else { %>
	<h1> 정상적인 요청이 아닙니다.</h1>
	<%	} %>





</body>
</html>