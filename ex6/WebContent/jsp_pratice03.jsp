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
int i = 10;
String str = "abc";

private int sum( int a , int b ){
	return a+ b;
}


%>

<%=i %><br />
<%=str %><br />
<%=sum(1,5) + "<br />"%>


<%

out.println("i : " + i + "<br />");
out.println("str : " + str +  "<br />");
out.println("sum (1,5): " + sum(1,5) + "<br />");

%>

i = <%=i %> <br />
str = <%=str %> <br />
</body>
</html>

