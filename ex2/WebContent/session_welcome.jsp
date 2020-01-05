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
		out.println(sValue +"님 안녕하세요" + "<br />");
	}
}

//Object id = session.getAttribute("loginName");
//String loginName = (String) id;

//if(loginName.equals("dahun429")){
//	out.println(id + "님 안녕하세요" + "<br />");
//}else{
//	out.println("실패");
//}

%>
<a href="session_Logout.jsp">로그아웃하기</a>

</body>
</html>