<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="com.javalec.ex.MODIFYOK" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%!
String id, pw, sName ,sValue;


%>


수정완료<br />
<h3>수정된 목록</h3>
<%
id = (String) session.getAttribute("loginid");
Enumeration<String> enumeration = session.getAttributeNames();
while(enumeration.hasMoreElements()){
	sName = enumeration.nextElement().toString();
	sValue = session.getAttribute(sName).toString();
	out.println(sName+ ":" +sValue + "<br />");

}


%>
<a href="JOIN.html">회원가입페이지로</a>
<a href="LOGIN.html">로그인페이지로</a>

</body>
</html>