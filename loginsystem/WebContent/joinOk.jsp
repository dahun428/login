<%@page import="com.javalec.loginsystem.memberDAO"%>
<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%request.setCharacterEncoding("EUC-KR"); %>
<jsp:useBean id="dto" class = "com.javalec.loginsystem.memberDTO"/>
<jsp:setProperty property="*" name="dto"/>
<%
	dto.setrDate(new Timestamp(System.currentTimeMillis()));
	memberDAO dao = memberDAO.getInstance();
	if(dao.confirmId(dto.getId()) == memberDAO.MEMBER_EXISTENT){
		
	
%>
<script laugauge="javascript">
	alert('���̵� �̹� �����մϴ�.');
	history.back();
</script>
<%
} else{
	int ri = dao.insert(dto);
	if(ri == memberDAO.MEMBER_JOIN_SUCCESS){
	session.setAttribute("id", dto.getId());	
%>
	<script laugauge="javascript">
	alert('ȸ�������� �����մϴ�.');
	document.location.href = "login.jsp";
	</script>

<%
	}else{
%>
	<script laugauge="javascript">
	alert('ȸ�����Կ� �����Ͽ����ϴ�.');
	document.location.href="login.jsp";
	</script>
<%
	}
}

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