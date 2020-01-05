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

session.setAttribute("mysessionName","mysessionData");
session.setAttribute("myNum", 12345);


%>

<a href="session_get.jsp">Session Get</a>

</body>
</html>