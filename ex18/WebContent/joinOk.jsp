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
alert('아이디가 이미 존재합니다.');
history.back();
</script>	
<% 
	
	}else{
		int ri = dao.insert(dto);
		if(ri == MyDAO.MEMBER_LOGIN_SUCCESS){
			session.setAttribute("id", dto.getId());
		
%>
<script>
alert('회원가입을 축하합니다.');
document.location.href = 'login.jsp';
</script>
<%
		}else{
%>
		<script>
		alert('회원가입에 실패했습니다.');
		document.location.href='login.jsp';
		</script>
<%
		}
	}
%>

</body>
</html>