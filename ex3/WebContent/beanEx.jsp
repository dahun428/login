<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="student" class ="com.javale.ex3.Student" scope="page"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>bean</title>
</head>
<body>

	<jsp:setProperty name = "student" property="name" value="ȫ�浿"/>
	<jsp:setProperty name = "student" property="age" value="13"/>
	<jsp:setProperty name = "student" property="grade" value="6"/>
	<jsp:setProperty name = "student" property="studentNum" value = "7"/>
	
	
	�̸� : <jsp:getProperty name = "student" property="name"/><br />
	���� : <jsp:getProperty name = "student" property="age"/><br />
	�г� : <jsp:getProperty name = "student" property="grade"/><br />
	��ȣ : <jsp:getProperty name = "student" property="studentNum"/><br />

</body>
</html>