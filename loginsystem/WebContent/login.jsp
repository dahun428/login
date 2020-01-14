<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<% if(session.getAttribute("ValidMem")!=null){ %>
<jsp:forward page = "main.jsp"></jsp:forward>
<%} %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action="loginOk.jsp" method="post">
<div>아이디 : <input type="text" name="id" value="
<%if(session.getAttribute("id")!=null) out.println(session.getAttribute("id"));%>"/></div>
<div>비밀번호 : <input type="password" name="pw" /></div>
<input type="submit" value="로그인" /> <input type="button" value="회원가입"
 onclick="javascript:window.location = 'join.jsp'" />
</form>

</body>
</html>