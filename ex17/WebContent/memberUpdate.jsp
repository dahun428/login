<%@page import="com.javalec.ex17.myDAO"%>
<%@page import="com.javalec.ex17.myDTO"%>
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
String name, id, pw, phone1, phone2, phone3, gender;

%>
<%
request.setCharacterEncoding("EUC-KR");

name = request.getParameter("name");
id = (String)session.getAttribute("id");
pw = request.getParameter("pw");
phone1 = request.getParameter("phone1");
phone2 = request.getParameter("phone2");
phone3 = request.getParameter("phone3");
gender = request.getParameter("gender");

myDTO data = new myDTO(name, id, pw, phone1, phone2, phone3, gender);
data.setName(name);
data.setPw(pw);
data.setPhone1(phone1);
data.setPhone2(phone2);
data.setPhone3(phone3);
data.setGender(gender);

myDAO manager = new myDAO();
manager.update(data);

response.sendRedirect("memberList.jsp");


%>

</body>
</html>