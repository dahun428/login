<%@page import="java.sql.Timestamp"%>
<%@page import="com.javalec.ex18.MyDAO"%>
<%@page import="com.javalec.ex18.MyDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("EUC-KR"); %>
<jsp:useBean id ="dto" class="com.javalec.ex18.MyDTO"/>
<jsp:setProperty property="*" name="dto"/>

<%
	dto.setrDate(new Timestamp(System.currentTimeMillis()));
	MyDAO dao = new MyDAO();
	if(dao.confirm(dto.getId()) == MyDAO.MEMBER_EXISTENT){
		
		
		
%>	

<script>
alert('���̵� �̹� �����մϴ�.');
history.back();
</script>	
<% 
	
	}else{
		int ri = dao.insert(dto);
		if(ri == MyDAO.MEMBER_LOGIN_SUCCESS){
			session.setAttribute("id", dto.getId());
		
%>
<script>
alert('ȸ�������� �����մϴ�.');
document.location.href = 'login.jsp';
</script>
<%
		}else{
%>
		<script>
		alert('ȸ�����Կ� �����߽��ϴ�.');
		document.location.href='login.jsp';
		</script>
<%
		}
	}
%>

</body>
</html>