
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Date now =  new Date();
	out.print(now);
%>
<h2>현재 날짜 시간은 : </h2>

<h3><%= now %></h3>

</body>
</html>