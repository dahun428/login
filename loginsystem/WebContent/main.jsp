<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%request.setCharacterEncoding("EUC-KR"); 

if(session.getAttribute("ValidMem")==null){
%>
<jsp:forward page="login.jsp"/>
<%
}

String id = (String) session.getAttribute("id");
String name = (String) session.getAttribute("name");

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2><%=name %>님 안녕하세요.</h2>
<form action="logout.jsp" method="post">
<input type="submit" value="로그아웃"/> <input type="button" value="정보수정"
onclick="javascript:window.location = 'modify.jsp'"/>
</form>


</body>
</html>