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
	<td>�˹��̸�</td>
	<td>����</td>
	<td>�ñ�</td>
	<td>����/����</td>
	<td>�ٹ��ð�</td>
	<td>�˹� ���</td>
	<td>�޸�</td>
	<td>���� �޿�</td>
	<td>���� �޿�</td>
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
	
	String date = dateY+"��"+dateM+"��"+dateD+"��";
	double workTime = hour + (min*60);

%>
<tr>
<td><%=_id %></td>
<td><%=name %></td>
<td><%=date %></td>
<td><%=pay %>��</td>
<td><%=time %></td>
<td><%=workTime %>�ð�</td>
<td><%=place %></td>
<td><%=memo %></td>
<td><%=wage %>��</td>
<td><%=night_wage %>��</td>
<td><a href="updateForm.jsp?_id=<%=data.get_id()%>">����</a></td>
<td><a href="delete.jsp?_id=<%=data.get_id()%>">����</a></td>
</tr>
<%
}
%>
<tr><td><input type="button" value="�߰�"
onclick="location.href='Main.html'"/></td></tr>



</table>




<%
request.setCharacterEncoding("EUC-KR");





%>

</body>
</html>