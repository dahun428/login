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
<h2><%=name %>�� �ȳ��ϼ���.</h2>
<form action="logout.jsp" method="post">
<input type="submit" value="�α׾ƿ�"/> <input type="button" value="��������"
onclick="javascript:window.location = 'modify.jsp'"/>
</form>


</body>
</html>