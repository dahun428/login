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
<script src="members.js"></script>
</head>
<body>


<form action="joinOk.jsp" method="post" name="reg_frm">
<div>아이디 : <input type="text" name = "id" size ="10"/></div>
<div>비밀번호 : <input type="password" name="pw" size="10"/></div>
<div>비밀번호 확인 : <input type="password" name="pw_check" /></div>
<div>이름 : <input type="text" name="name" size="10" /></div>
<div>이메일 : <input type="text" name="eMail" size="15"/></div>
<div>주소 : <input type="text" name="address" size="20" /></div>
<input type="button" value="회원가입" onclick="infoConfirm()"/>
<input type="reset" value="취소" onclick ="javascript:window.location = 'login.jsp'"/>
</form>
</body>
</html>