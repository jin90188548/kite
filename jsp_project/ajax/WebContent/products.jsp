<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
String name = request.getParameter("name");
String region = request.getParameter("region");

String str = "<h1>" + name + ":" + region + "</h1>";

out.print(str);


%>