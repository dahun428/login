<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%! int age;

%>
<%
String str = request.getParameter("age");
int age = Integer.parseInt(str);

%>

<p>성인입니다. 주류 구매 가능합니다.</p>

<a href="request.html">처음으로 이동</a>
</body>
</html>