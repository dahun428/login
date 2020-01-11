<%@page import="com.javalec.ex17.myDTO"%>
<%@page import="java.util.ArrayList"%>
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

<table border="1">	
<tr>
	<td>이름</td>
	<td>아이디</td>
	<td>비밀번호</td>
	<td>전화번호</td>
	<td>성별</td>
</tr>
<%
myDAO manager = new myDAO();
ArrayList<myDTO> list = manager.select();

for(int i = 0; i <list.size(); i++){
	myDTO data = list.get(i);
	String name = data.getName();
	String id = data.getId();
	String pw = data.getPw();
	String phone = data.getPhone1() +"-"+data.getPhone2()+"-"+data.getPhone3();
	String gender = data.getGender();
%>
<tr>
	<td><%=name%></td>
	<td><%=id%></td>
	<td><%=pw%></td>
	<td><%=phone%></td>
	<td><%=gender%></td>
	<td><a href="memberUpdateForm.jsp?id=<%=data.getId()%>">수정</a></td>
	<td><a href="memberDelete.jsp?id=<%=data.getId()%>">삭제</a></td>
</tr>
<%} 
%>
<tr>
<td><input type="button" value="회원추가" onclick="location.href='join.html'" /></td></tr>
</table>



</body>
</html>