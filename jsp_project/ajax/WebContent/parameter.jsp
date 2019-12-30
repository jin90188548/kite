<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
	String name = request.getParameter("name");
	String price = request.getParameter("price");
 	
	System.out.println(name+":"+price);

	String str = "";

	if (name == null || price == null) {		
		str = "상품 이름 없음:가격 정보 없음";
	}else{
		str = name + ":" + price;		
	}

	out.print(str);
%>