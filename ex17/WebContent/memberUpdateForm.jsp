<%@page import="com.javalec.ex17.myDTO"%>
<%@page import="com.javalec.ex17.myDAO"%>
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
String id = request.getParameter("id");

myDAO manager = new myDAO();
myDTO member = manager.getMember(id);
session.setAttribute("id", id);

%>



<form action="memberUpdate.jsp" method="post">

<div>�̸� : <input type="text" name = "name" value=<%=member.getName()%> size="10"/></div>
<div>���̵� : <%=id%></div>
<div>��й�ȣ : <input type="password" name = "pw" size="10" value="<%=member.getPw() %>"/></div>
<div>��ȭ��ȣ : <select name="phone1" >
	<option value="010">010</option>
	<option value="016">016</option>
	<option value="017">017</option>
	<option value="018">018</option>
	<option value="019">019</option>
	<option value="011">011</option>
</select> - <input type="text" name = "phone2" size="5" value="<%=member.getPhone2() %>"/> - <input type="text" name = "phone3" size="5" value="<%=member.getPhone3() %>"/>
</div>

<% 
if(member.getGender().equals("man")){

%>

<div>���� ���� : <input type="radio" name="gender" checked ="checked" value="man"/>��
<input type="radio" name="gender" value="woman"/>��</div>
<%}else{ %>

<div>���� ���� : <input type="radio" name="gender"  value="man"/>��
<input type="radio" name="gender" value="woman" checked ="checked"/>��</div>

<%} %>
<input type="submit" value="����"/><input type="reset" value="���"/>
</form>

</body>
</html>