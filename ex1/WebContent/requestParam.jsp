<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%!
	String name, id, pw, major, protocol;
	String[] hobbys;
%>
<%
	request.setCharacterEncoding("EUC-KR");
	
	name = request.getParameter("name");
	id = request.getParameter("id");
	pw = request.getParameter("pw");
	major = request.getParameter("major");
	protocol = request.getParameter("protocol");
	
	hobbys = request.getParameterValues("hobby");

%>
	<div>이름 : <%=name %></div>
	<div>아이디 : <%=id %></div>
	<div>비밀번호 : <%=pw %></div>
	<div>취미 : <%=Arrays.toString(hobbys) %></div>
	<div>전공 : <%=major %></div>
	<div>프로토콜 : <%=protocol %></div>
</body>
</html>