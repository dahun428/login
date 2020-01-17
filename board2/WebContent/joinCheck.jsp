<%@page import="java.io.PrintWriter"%>
<%@page import="com.javalec.dto.userDTO"%>
<%@page import="com.javalec.dao.userDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>    
    
<%request.setCharacterEncoding("UTF-8");%>    
<% userDAO dao = userDAO.getInstance();
userDTO dto = new userDTO();

String userID = null;

if(session.getAttribute("userID") != null){
	userID = (String) session.getAttribute("userID");
}
if(userID != null){
	PrintWriter writer = response.getWriter();
	writer.println("<script>");
	writer.println("alert('�̹� �α��� �Ǿ��ֽ��ϴ�.');");
	writer.println("location.href = 'main.jsp';");
	writer.println("</script>");
	
}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:choose>
	<c:when test="${joinCheck == userDAO.MEMBER_EXISTENT }">
	<%System.out.println("����"); %>
		<script>
			alert('���̵� �̹� �����մϴ�.');
			history.back();
		</script>
	</c:when>
	<c:when test="${joinCheck == userDAO.MEMBER_NONEXISTENT }">
	
	<%System.out.println("����x"); 
	session.setAttribute("userID", dto.getUserID());
	%>
		<script>
			alert('ȸ�������� �����մϴ�.');
			document.location.href = "login.jsp";
		</script>
	</c:when>
</c:choose>
</body>
</html>