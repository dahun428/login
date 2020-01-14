<%@page import="com.javalec.loginsystem.memberDAO"%>
<%@page import="com.javalec.loginsystem.memberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%request.setCharacterEncoding("EUC-KR"); %>
<%
	String pw = request.getParameter("pw");
	String eMail = request.getParameter("eMail");
	String address = request.getParameter("address");
	String id = (String) session.getAttribute("id");
	System.out.println(id);
	
	memberDTO dto = new memberDTO();
	dto.setPw(pw);
	dto.seteMail(eMail);
	dto.setAddress(address);
	
	memberDAO dao = memberDAO.getInstance();
	dao.update(dto, id);
	response.sendRedirect("login.jsp");

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>