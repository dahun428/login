<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="com.javalec.ex.LOGINOK" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%!
String id, pw, sName, sValue;

%>
<%

id = (String) session.getAttribute("userid");
Enumeration<String> enumeration = session.getAttributeNames();
while(enumeration.hasMoreElements()){
	sName = enumeration.nextElement().toString();
	sValue = session.getAttribute(sName).toString();
	if(sValue.equals(id)){
		out.println(sValue + "�� �ȳ��ϼ���"+"<br />");
	}
}

//id = (String) request.getAttributeNames() request.getAttribute("userid");
//Enumeration<String> enumeration = session.getAttributeNames();
//while(enumeration.hasMoreElements()){
	//sName = enumeration.nextElement().toString();
	//sValue = session.getAttribute(sName).toString();
	
	//if(sValue.equals(id)){
	//	out.println(sValue + "�� �ȳ��ϼ���"+"<br />");
//	}
//}

System.out.println(id);
System.out.println(sName);
System.out.println(sValue);
%>
�α��οϷ�<br />

</body>
</html>