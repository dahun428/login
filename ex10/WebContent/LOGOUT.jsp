<%@page import="java.util.Enumeration"%>
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
String id;
%>
<%
id = (String) session.getAttribute("loginid");

Enumeration<String> enumeration = session.getAttributeNames();
while(enumeration.hasMoreElements()){
	String sName = enumeration.nextElement().toString();
	String sValue = (String)session.getAttribute(sName);
	if(sValue.equals(id)){
		session.removeAttribute(sName);
		out.println(id +"님 로그아웃 정상적으로 완료되었습니다.");
	}else{
		out.println("로그아웃실패");
	}
}

%>
<a href="LOGIN.html">로그인페이지로</a>
<a href="JOIN.html">회원가입페이지로</a>
</body>
</html>