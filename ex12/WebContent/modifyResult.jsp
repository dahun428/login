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
�̸� : <%=name %> <br />
���̵� : <%=id %> <br />
��й�ȣ : <%=pw %> <br />
��ȭ��ȣ: <%=phone1%>-<%=phone2 %>-<%=phone3 %> <br />
����  : <%=gender %> <br />


</body>
</html>