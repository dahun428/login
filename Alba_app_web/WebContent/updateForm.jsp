<%@page import="com.javalec.system.MyDTO"%>
<%@page import="com.javalec.system.MyDAO"%>
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
String name, time, place, memo;
int dateY, dateM, dateD, pay, hour;
double min, wage, night_wage;



%>
<%
int _id = Integer.parseInt(request.getParameter("_id"));
MyDAO manager = new MyDAO();
MyDTO data = manager.getData(_id);
session.setAttribute("_id", _id);

%>


<form action="update.jsp" method="post">
<div>�˹� �̸� : <input type="text" name="name" value="<%=data.getName()%>"/></div>
<div>�˹� ���� : 
<select name="dateY">
<option value="2019">2019</option>
<option value="2020">2020</option>
</select>��
<select name="dateM" >
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
</select>��
<select name="dateD" >
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="13">13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16</option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21">21</option>
<option value="22">22</option>
<option value="23">23</option>
<option value="24">24</option>
<option value="25">25</option>
<option value="26">26</option>
<option value="27">27</option>
<option value="28">28</option>
<option value="26">29</option>
<option value="27">30</option>
<option value="28">31</option>
</select>��
</div>
<div>�˹� �ñ� : <input type="text" name="pay" value="<%=data.getPay()%>"/></div>
<div>�ٹ� �ð� :
<span>
<select name="time">
	<option value="noon">����</option>
	<option value="night">�߰�</option>
</select>
</span>
<select name="hour">
	<option value="1" >1�ð�</option>
	<option value="2">2�ð�</option>
	<option value="3">3�ð�</option>
	<option value="4">4�ð�</option>
	<option value="5">5�ð�</option>
	<option value="6">6�ð�</option>
	<option value="7">7�ð�</option>
	<option value="8">8�ð�</option>
	<option value="9">9�ð�</option>
	<option value="10">10�ð�</option>
	<option value="11">11�ð�</option>
	<option value="12">12�ð�</option>
</select>
<span>
<select name="min">
	<option value="0">--</option>
	<option value="0.25">15��</option>
	<option value="0.5">30��</option>
	<option value="0.75">45��</option>
</select>

</span>
</div>
<div>�˹� ��� : <input type="text" name="place" value="<%=data.getPlace()%>"/></div>
<div>�޸� : </div>
<div> <textarea name="memo" cols="30" rows="10"><%=data.getMemo()%></textarea></div>
<input type="submit" value="Ȯ��" /><input type="reset" value="���" />
</form>
</body>
</html>