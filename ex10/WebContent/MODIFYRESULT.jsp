<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="com.javalec.ex.MODIFYOK" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%!
String id, pw, sName ,sValue;


%>


�����Ϸ�<br />
<h3>������ ���</h3>
<%
id = (String) session.getAttribute("loginid");
Enumeration<String> enumeration = session.getAttributeNames();
while(enumeration.hasMoreElements()){
	sName = enumeration.nextElement().toString();
	sValue = session.getAttribute(sName).toString();
	out.println(sName+ ":" +sValue + "<br />");

}


%>
<a href="JOIN.html">ȸ��������������</a>
<a href="LOGIN.html">�α�����������</a>

</body>
</html>