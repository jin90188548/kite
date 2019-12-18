<%@page import="member.MemberInfo"%>
<%@page import="java.util.ArrayList"%>
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
		ArrayList<MemberInfo> list = new ArrayList<MemberInfo>();
		list.add(new MemberInfo("hong1", "홍길동1"));
		list.add(new MemberInfo("hong2", "홍길동2"));
		list.add(new MemberInfo("hong3", null));
		list.add(new MemberInfo("hong4", "홍길동4"));
		list.add(new MemberInfo("hong5", "홍길동5"));
		list.add(new MemberInfo("hong6", "홍길동6"));
		list.add(new MemberInfo("hong7", null));
		list.add(new MemberInfo("hong8", null));
		list.add(new MemberInfo("hong9", "홍길동9"));
		
		application.setAttribute("members", list);

	%>

	<table border="1" style="width:100%">
	
		<tr>
			<td>index</td>
			<td>count</td>
			<td>아이디</td>
			<td>이름</td>
		</tr>
		
		<c:forEach 
			items="${applicationScope.members}" 
			var="info" 
			varStatus="stat"	>		
		<tr>
			<td>${stat.index}</td>
			<td>${stat.count}</td>
			<td>${info.uid}</td>
			<td><%-- ${info.uname} /	 --%>	
				<c:out value="${info.uname}" escapeXml="false">
					<span style="color:red;">이름 없음</span>						
				</c:out>			
			</td>
		</tr>		
		</c:forEach>
		
		
	
	</table>














</body>
</html>