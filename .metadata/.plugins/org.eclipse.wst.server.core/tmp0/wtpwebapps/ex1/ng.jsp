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
int age;
%>
<%
String str = request.getParameter("age");
age = Integer.parseInt(str);

%>

<p>�̼����� �Դϴ�. �ַ� ���Ű� �Ұ��� �մϴ�.</p>

<a href="request.html">ó������ �̵� </a>
</body>
</html>