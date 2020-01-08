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
String id;

%>

<%
id = (String) session.getAttribute("loginid");

%>
<form action="JOINOUT" method="post">
회원탈퇴할 아이디 : <%=id %><br />
회원탈퇴할 비밀번호 : <input type="password" name = "joinoutpw" /><br />
<input type="submit" value="확인"/><input type="reset" value="다시입력" />

</form>



</body>
</html>