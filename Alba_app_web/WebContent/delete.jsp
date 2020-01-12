<%@page import="com.javalec.system.MyDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
int _id = Integer.parseInt(request.getParameter("_id"));
MyDAO manager = new MyDAO();
manager.delete(_id);

response.sendRedirect("list.jsp");

%>

</body>
</html>