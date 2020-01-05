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
String id, pw;

%>
<%

request.setCharacterEncoding("EUC-KR");

id = request.getParameter("id");
pw = request.getParameter("pw");

if(id.equals("dahun429") && pw.equals("1234")){
	session.setAttribute("loginName", id);
	response.sendRedirect("session_welcome.jsp");
}else{
	response.sendRedirect("sessionLogin.html");
}



%>
</body>
</html>