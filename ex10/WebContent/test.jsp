<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
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
Connection conn = null;
PreparedStatement pstmt = null;


String driver = "com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/basepratice?serverTimezone=UTC";
String uid = "root";
String upw = "d1860429";
String query = "INSERT INTO loginsystem (username, userid, userpw, userphone, usergender)VALUES(?,?,?,?,?)";


%>
<%
try {
	
	Class.forName(driver);
	conn = DriverManager.getConnection(url,uid,upw);
	pstmt = conn.prepareStatement(query);
	
	pstmt.setString(1, "정다정");
	pstmt.setString(2, "dajung");
	pstmt.setString(3, "1234");
	pstmt.setString(4, "010-4115-5551");
	pstmt.setString(5, "woman");
	pstmt.executeUpdate();
	
	
}catch(SQLException e) {
	e.printStackTrace();
}catch(ClassNotFoundException e) {
	e.printStackTrace();
}catch(Exception e) {
	e.printStackTrace();
}finally {
	if(pstmt !=null) {
		try {
			pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}if(conn != null) {
		try {
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}


%>
</body>
</html>