<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<div class="footer">
	email : <%= request.getParameter("email") %>
	<% 
		String code = request.getParameter("menu_code");
		int code_num = Integer.parseInt(code);
		
		if(code_num > 1) {
	%>
	, 
	tel : <%= request.getParameter("tel") %>
	
	<% } %>
</div>