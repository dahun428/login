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

<%

Enumeration<String> enumeration = session.getAttributeNames();
while(enumeration.hasMoreElements()){
	String sName = enumeration.nextElement().toString();
	String sValue = (String)session.getAttribute(sName);
	
	if(sValue.equals("dahun429")){
		out.println(sValue +"�� �ȳ��ϼ���" + "<br />");
	}
}

//Object id = session.getAttribute("loginName");
//String loginName = (String) id;

//if(loginName.equals("dahun429")){
//	out.println(id + "�� �ȳ��ϼ���" + "<br />");
//}else{
//	out.println("����");
//}

%>
<a href="session_Logout.jsp">�α׾ƿ��ϱ�</a>

</body>
</html>