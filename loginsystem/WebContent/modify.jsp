<%@page import="com.javalec.loginsystem.memberDTO"%>
<%@page import="com.javalec.loginsystem.memberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%request.setCharacterEncoding("EUC-KR"); %>    
<%
String id = (String) session.getAttribute("id");
memberDAO  dao = memberDAO.getInstance();
memberDTO dto = dao.getMember(id);

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="members.js"></script>
</head>
<body>



<form action="modifyOk.jsp" method="post" name="reg_frm">
<div>���̵� : <%=dto.getId() %></div>
<div>��й�ȣ : <input type="password" name="pw" size="20" /></div>
<div>��й�ȣ Ȯ�� : <input type="password" name="pw_check" size="20" /></div>
<div>�̸� : <%=dto.getName() %></div>
<div>���� : <input type="text" name="eMail" size= "20" value="<%=dto.geteMail()%>"/></div>
<div>�ּ� : <input type="text" name="address" size="50" value="<%=dto.getAddress()%>"/></div>
<input type="button" value="����" onclick="updateInfoConfirm()"/>
<input type="reset" value="���" onclick="javascript:window.location='login.jsp'" />
</form>


</body>
</html>