<%@page import="java.util.Enumeration"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
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

	String id,username,userpw,userphone,usergender;

	Connection conn;
	PreparedStatement ptmt, ptmt2, ptmt3;
	ResultSet rs;
	
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/basepratice?serverTimezone=UTC";
	String uid = "root";
	String upw = "d1860429";
	String query = "SELECT * FROM loginsystem WHERE userid = ?";

%>
<%
	request.setCharacterEncoding("EUC-KR");
	id = (String) session.getAttribute("loginid");	
// 	System.out.println(id);

	try{
		
		Class.forName(driver);
		conn = DriverManager.getConnection(url, uid , upw);
		ptmt = conn.prepareStatement(query);
		//ptmt�� ���� �ҷ����� ������  rs �� ���õǸ鼭 ����
		ptmt.setString(1, id);
		rs = ptmt.executeQuery();
		
		
		System.out.println(id);
		
		while(rs.next()){
			username = rs.getString(2);
			userpw = rs.getString(3);
			userphone = rs.getString(4);
			usergender = rs.getString(5);			
		}
		
	}catch(Exception e){
		e.printStackTrace();
		
	}finally{
		try{
			if(rs != null) rs.close();
			if(ptmt != null) ptmt.close();
			if(conn != null) conn.close();
		}catch(Exception e){}
	}

%>

<form action="MODIFYOK" method="post">

<div>�̸� : <input type="text" name="username" value="<%=username %>" /></div>
<div>���̵� : <%=id %></div>
<div>��й�ȣ : <input type="password" name="userpw" value="<%=userpw %>"/></div>
<div>��ȭ��ȣ : 
	<select name="phone1" id="">
		<option value="010">010</option>
		<option value="016">016</option>
		<option value="017">017</option>
		<option value="018">018</option>
		<option value="019">019</option>
		<option value="011">011</option>
	</select>- <input type="text" name="phone2" /> - <input type="text" name="phone3" />

</div>
<div>���� :
	<input type="radio" name="gender" value="man"/>��
	<input type="radio" name="gender"  value="woman"/>��
</div>
<input type="submit" value="����"/><input type="reset" value="���"/>
</form>

</html>