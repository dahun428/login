<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%!
String id;
%>
<%
id = (String) session.getAttribute("loginid");

Enumeration<String> enumeration = session.getAttributeNames();
while(enumeration.hasMoreElements()){
	String sName = enumeration.nextElement().toString();
	String sValue = (String)session.getAttribute(sName);
	if(sValue.equals(id)){
		session.removeAttribute(sName);
		out.println(id +"�� �α׾ƿ� ���������� �Ϸ�Ǿ����ϴ�.");
	}else{
		out.println("�α׾ƿ�����");
	}
}

%>
<a href="LOGIN.html">�α�����������</a>
<a href="JOIN.html">ȸ��������������</a>
</body>
</html>