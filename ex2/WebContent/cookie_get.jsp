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
	Cookie[] cookies = request.getCookies();
	
for(int i = 0; i < cookies.length; i++){
	String str = cookies[i].getName();
	if(str.equals("cookieN")){
		out.println("cookie["+i+"] name : " + cookies[i].getName() + "<br />");
		out.println("cookie["+i+"] name : " + cookies[i].getValue() + "<br />");
		out.println("=============<br />");
	}
}




%>

<a href="cookie_del.jsp">cookie del</a>
</body>
</html>