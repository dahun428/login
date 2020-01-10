<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%!
Connection con = null;
Statement stmt = null;
ResultSet rs = null;
String driver = "com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/basepratice?serverTimezone=UTC";
String uid = "root";
String upw = "d1860429";
String id, name, pw, phone1, phone2, phone3, gender;

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
id = (String) session.getAttribute("id");

String query = "SELECT * FROM members WHERE id = '" + id +"'";

Class.forName(driver);
con = DriverManager.getConnection(url, uid ,upw);
stmt = con.createStatement();
rs = stmt.executeQuery(query);

while(rs.next()){
	name = rs.getString("name");
	pw = rs.getString("pw");
	phone1 = rs.getString("phone1");
	phone2 = rs.getString("phone2");
	phone3 = rs.getString("phone3");
	gender = rs.getString("gender");
}
%>

<form action="modifyOk" method="post">
<div>이름 : <input type="text" name = "name" value=<%=name %>></div>
<div>아이디: <%=id %></div>
<div>비밀번호 : <input type="text" name ="pw" ></div>
<div>전화번호 : <select name="phone1">
	<option value="010">010</option>
	<option value="016">016</option>
	<option value="017">017</option>
	<option value="018">018</option>
	<option value="019">019</option>
	<option value="011">011</option>
</select> - <input type="text" name="phone2" value=<%=phone2 %>>
<input type="text" name="phone3" value=<%=phone3 %>></div>
<%if(gender.equals("man")){ %>
성별 : <input type="radio" name ="gender" value="man" checked="checked"/>남
<input type="radio" name="gender" value="woman"  />여
<%} else { %>
성별 : <input type="radio" name ="gender" value="man"/>남
<input type="radio" name="gender" value="woman"  checked="checked" />여

<%} %>
<input type="submit" value="수정" /><input type="reset" value="취소"/>
</form>

</body>
</html>