<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.xdevapi.Result"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
Connection conn;
Statement statement;
ResultSet resultSet;

String driver = "com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/basepratice?serverTimezone=UTC";
String uid = "root";
String upw = "d1860429";
String query = "SELECT * FROM student";

%>

<%

try{
	Class.forName(driver);
	conn = DriverManager.getConnection(url, uid, upw);
	statement = conn.createStatement();
	resultSet = statement.executeQuery(query);
	
	while(resultSet.next()){
		String student_id = resultSet.getString("_id");
		String student_name = resultSet.getString("name");
		String student_major = resultSet.getString("belong");
		String student_phone = resultSet.getString("phone");
		String status = resultSet.getString("status");
		
		out.println("학번 :" + student_id +"<br />");
		out.println("이름 :" + student_name +"<br />");
		out.println("학과 :" + student_major +"<br />");
		out.println("전화번호 :" + student_phone+"<br />");
		out.println("status :" + status+"<br />");
		
		
		
	}
	
	
}catch(Exception e){
	e.printStackTrace();
	
}finally{
	try{
		if (resultSet != null) resultSet.close();
		if (statement != null) statement.close();
		if (conn != null) conn.close();
			
	}catch(Exception e){e.printStackTrace();}finally{out.println("서버접속 해제 완료");	}
		
}





%>


</body>
</html>