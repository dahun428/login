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
String name, id, pw, phone1, phone2, phone3, gender ;
String getId, getPw;
%>

<%
name = (String)session.getAttribute("name");
id = (String)session.getAttribute("id");
pw = (String)session.getAttribute("pw");
phone1 = (String)session.getAttribute("phone1");
phone2 = (String)session.getAttribute("phone2");
phone3 = (String)session.getAttribute("phone3");
gender = (String)session.getAttribute("gender");

getId = (String)session.getAttribute("getId");
getPw = (String)session.getAttribute("getPw");

System.out.println(id);
System.out.println(pw);

System.out.println(getId);
System.out.println(getPw);
System.out.println(name);
System.out.println(phone1);
System.out.println(phone2);
System.out.println(phone3);
System.out.println(gender);


if(getId.equals(id)){
	out.println(name + "�� �ȳ��ϼ���."+"<br />");
	out.println("<a href='modify.jsp'>ȸ����������</a>" + "<br />");

}else{
	out.println("�α��ο� �����Ͽ����ϴ�." + "<br />");
	out.println("<a href='login.html'>�α���������</a>" + "<br />");
}
%>

</body>
</html>