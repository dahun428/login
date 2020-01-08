<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="com.javalec.ex.LOGINOK" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%!
String id, pw, sName, sValue;

%>
<%

id = (String) session.getAttribute("loginid");

Enumeration<String> enumeration = session.getAttributeNames();
while(enumeration.hasMoreElements()){
	sName = enumeration.nextElement().toString();
	sValue = session.getAttribute(sName).toString();
	if(sValue.equals(id)){

		out.println(sValue + "님 안녕하세요"+"<br />");
	}
}
%>
로그인완료<br />
<a href="MODIFY.jsp">회원정보 수정하기</a>
<a href="LOGOUT.jsp">로그아웃하기</a>
<a href="JOINOUT.jsp">회원탈퇴하기</a>
</body>
</html>