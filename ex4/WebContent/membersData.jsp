<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
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
	String query = "SELECT * FROM loginsystem";

%>

<%

try{
	Class.forName(driver);
	//DriverManger.getConnection(url, uid, upw).createStatement().statement.executeQuery
	conn = DriverManager.getConnection(url, uid , upw);
	statement = conn.createStatement();
	resultSet = statement.executeQuery(query);

	while(resultSet.next()){
		String id = resultSet.getString("_id");
		String username = resultSet.getString("username");
		String userid = resultSet.getString("userid");
		String userpw = resultSet.getString("userpw");
		String phone = resultSet.getString("userphone");
		String gender = resultSet.getString("usergender");
		
		out.println("인덱스 : "+ id + "<br />");
		out.println("아이디 : "+ username + "<br />");
		out.println("비밀번호 : "+ userid + "<br />");
		out.println("이름 : "+ userpw + "<br />");
		out.println("전화번호" + phone + "<br />");
	}

}catch(Exception e){
	e.printStackTrace();
}finally{
	try{
		if(resultSet != null) resultSet.close();
		if(statement != null) statement.close();
		if(conn != null) conn.close();
	} catch (Exception e){}
}

%>



</body>
</html>