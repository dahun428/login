<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Logout</title>
</head>
<body>
<%

Enumeration<String> enumeration = session.getAttributeNames();

while(enumeration.hasMoreElements()){
	String sName = enumeration.nextElement().toString();
	String sValue = (String)session.getAttribute(sName);
	
	if(sValue.equals("dahun429")) session.removeAttribute(sName);
}


//session.getAttribute("loginName");
//session.invalidate();

//if(request.isRequestedSessionIdValid()){
//	out.println("session valid");
//}else{
//	out.println("session invalid");
//}

%>
로그아웃 되었습니다.
</body>
</html>