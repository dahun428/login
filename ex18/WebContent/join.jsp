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
<div>���̵� : <input type="text" name = "id" size ="10"/></div>
<div>��й�ȣ : <input type="password" name="pw" size="10"/></div>
<div>��й�ȣ Ȯ�� : <input type="password" name="pw_check" /></div>
<div>�̸� : <input type="text" name="name" size="10" /></div>
<div>�̸��� : <input type="text" name="eMail" size="15"/></div>
<div>�ּ� : <input type="text" name="address" size="20" /></div>
<input type="button" value="ȸ������" onclick="infoConfirm()"/>
<input type="reset" value="���" onclick ="javascript:window.location = 'login.jsp'"/>
</form>
</body>
</html>