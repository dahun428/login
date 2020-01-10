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
String name, id, pw, phone1, phone2, phone3, gender;

%>
<%
name = (String) session.getAttribute("name");
id = (String)session.getAttribute("id");
pw = (String)session.getAttribute("pw");
phone1 = (String)session.getAttribute("phone1");
phone2 = (String)session.getAttribute("phone2");
phone3 = (String)session.getAttribute("phone3");
gender = (String)session.getAttribute("gender");

%>
이름 : <%=name %> <br />
아이디 : <%=id %> <br />
비밀번호 : <%=pw %> <br />
전화번호: <%=phone1%>-<%=phone2 %>-<%=phone3 %> <br />
성별  : <%=gender %> <br />


</body>
</html>