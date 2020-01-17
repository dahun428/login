<%@page import="java.io.PrintWriter"%>
<%@page import="com.javalec.dto.userDTO"%>
<%@page import="com.javalec.dao.userDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>

<%request.setCharacterEncoding("UTF-8");

userDAO dao = new userDAO();
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
	<c:when test="${userCheck == userDAO.MEMBER_LOGIN_IS_NOT }">
		<script>
			alert('���̵� �������� �ʽ��ϴ�.');
			history.go(-1);
		</script>
	</c:when>
	<c:when test="${userCheck == userDAO.MEMBER_LOGIN_PW_NO_GOOD }">
		<script>
			alert('��й�ȣ�� Ʋ���ϴ�.');
			history.go(-1);
		</script>
	</c:when>
	<c:when test="${userCheck== userDAO.MEMBER_LOGIN_SUCCESS }">
				<%
				String ID = (String) request.getAttribute("userID"); 
				session.setAttribute("userID", ID);	
				%>
				 
				<script>
					location.href="main.jsp";
				</script>
	</c:when>
	<c:otherwise>
		<script>
			alert('�������� �ʴ� ȸ���Դϴ�.');
			history.go(-1);
		</script>
	</c:otherwise>

</c:choose>
</body>
</html>