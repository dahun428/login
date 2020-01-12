<%@page import="com.javalec.system.MyDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.javalec.system.MyDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%!
String name, time, place, memo;
int _id;
int dateY, dateM, dateD, pay, hour;
double min, wage, night_wage;

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<table border="1">
<tr>
	<td>id</td>
	<td>알바이름</td>
	<td>일자</td>
	<td>시급</td>
	<td>오전/오후</td>
	<td>근무시간</td>
	<td>알바 장소</td>
	<td>메모</td>
	<td>오전 급여</td>
	<td>오후 급여</td>
</tr>
<%
MyDAO manager = new MyDAO();
ArrayList<MyDTO> list = manager.select();

for(int i = 0; i < list.size(); i++){
	
	MyDTO data = list.get(i);
	
	_id = data.get_id();
	name = data.getName();
	dateY = data.getDateY();
	dateM = data.getDateM();
	dateD = data.getDateD();
	pay = data.getPay();
	time = data.getTime();
	hour = data.getHour();
	min = data.getMin();
	place = data.getPlace();
	memo = data.getMemo();
	wage = data.getWage();
	night_wage = data.getNight_wage();
	
	String date = dateY+"년"+dateM+"월"+dateD+"일";
	double workTime = hour + (min*60);

%>
<tr>
<td><%=_id %></td>
<td><%=name %></td>
<td><%=date %></td>
<td><%=pay %>원</td>
<td><%=time %></td>
<td><%=workTime %>시간</td>
<td><%=place %></td>
<td><%=memo %></td>
<td><%=wage %>원</td>
<td><%=night_wage %>원</td>
<td><a href="updateForm.jsp?_id=<%=data.get_id()%>">수정</a></td>
<td><a href="delete.jsp?_id=<%=data.get_id()%>">삭제</a></td>
</tr>
<%
}
%>
<tr><td><input type="button" value="추가"
onclick="location.href='Main.html'"/></td></tr>



</table>




<%
request.setCharacterEncoding("EUC-KR");





%>

</body>
</html>