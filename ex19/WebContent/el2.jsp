<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="member" class="com.javalec.ex.MemberInfo" scope="page"/>
<jsp:setProperty property="name" name="member" value="ȫ�浿"/>
<jsp:setProperty property="id" name="member" value="dahun429"/>
<jsp:setProperty property="pw" name="member" value="d1860429"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
�̸� : <jsp:getProperty property="name" name="member"/>
���̵� : <jsp:getProperty property="id" name="member"/>
��й�ȣ : <jsp:getProperty property="pw" name="member"/>

<hr />

�̸� : ${member.name } <br />
���̵�  : ${member.id } <br />
��й�ȣ  : ${member.pw } <br />
</body>
</html>