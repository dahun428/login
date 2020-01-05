<%@page import="java.util.Iterator"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.sun.jmx.snmp.Enumerated"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Session Get</title>
</head>
<body>
<%


Object obj1 = session.getAttribute("mysessionName");
//Object obj3 = session.getAttribute("mysessionData");
String mysessionName = (String) obj1;
//String mysessionData = (String) obj3;
out.println(mysessionName + "<br />");
//out.println(mysessionData + "<br />");

Object obj2 = session.getAttribute("myNum");
Integer myNum = (Integer)obj2;
out.println(myNum + "<br />");

out.println("***************** <br />");

String sName, sValue;

Enumeration<String> enumeration = session.getAttributeNames();
while(enumeration.hasMoreElements()){
	sName = enumeration.nextElement().toString();
	sValue = session.getAttribute(sName).toString();
	out.println("sName : " + sName + "<br />");
	out.println("sValue : " + sValue + "<br />");
}



out.println("******************<br />");


String sessionID = session.getId();
out.println("sessionID : " + sessionID + "<br />");
int sessionInter = session.getMaxInactiveInterval();
out.println("sessionInter : " + sessionInter + "<br />");


session.invalidate();
if(request.isRequestedSessionIdValid()){
	out.println("session valid");
}else{
	out.println("session invalid");
}


%>
</body>
</html>