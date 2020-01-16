<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="member" class="com.javalec.ex.MemberInfo" scope="page"/>
<jsp:setProperty property="name" name="member" value="홍길동"/>
<jsp:setProperty property="id" name="member" value="dahun429"/>
<jsp:setProperty property="pw" name="member" value="d1860429"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
이름 : <jsp:getProperty property="name" name="member"/>
아이디 : <jsp:getProperty property="id" name="member"/>
비밀번호 : <jsp:getProperty property="pw" name="member"/>

<hr />

이름 : ${member.name } <br />
아이디  : ${member.id } <br />
비밀번호  : ${member.pw } <br />
</body>
</html>