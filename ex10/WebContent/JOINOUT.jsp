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
ȸ��Ż���� ���̵� : <%=id %><br />
ȸ��Ż���� ��й�ȣ : <input type="password" name = "joinoutpw" /><br />
<input type="submit" value="Ȯ��"/><input type="reset" value="�ٽ��Է�" />

</form>



</body>
</html>