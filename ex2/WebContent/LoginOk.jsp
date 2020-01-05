<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Login Ok</title>
</head>
<body>

<%!
String id,pw;

%>
<%

request.setCharacterEncoding("EUC-KR");

id = request.getParameter("id");
pw = request.getParameter("pw");

if(id.equals("dahun429") && pw.equals("1234")){
	Cookie cookie = new Cookie("id", id);
	cookie.setMaxAge(60*60);
	response.addCookie(cookie);
	response.sendRedirect("welcome.jsp");
} else{
	response.sendRedirect("Login.html");	
	
}

%>

</body>
</html>