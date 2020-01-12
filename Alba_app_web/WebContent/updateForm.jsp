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
<div>알바 이름 : <input type="text" name="name" value="<%=data.getName()%>"/></div>
<div>알바 일자 : 
<select name="dateY">
<option value="2019">2019</option>
<option value="2020">2020</option>
</select>년
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
</select>월
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
</select>일
</div>
<div>알바 시급 : <input type="text" name="pay" value="<%=data.getPay()%>"/></div>
<div>근무 시간 :
<span>
<select name="time">
	<option value="noon">오전</option>
	<option value="night">야간</option>
</select>
</span>
<select name="hour">
	<option value="1" >1시간</option>
	<option value="2">2시간</option>
	<option value="3">3시간</option>
	<option value="4">4시간</option>
	<option value="5">5시간</option>
	<option value="6">6시간</option>
	<option value="7">7시간</option>
	<option value="8">8시간</option>
	<option value="9">9시간</option>
	<option value="10">10시간</option>
	<option value="11">11시간</option>
	<option value="12">12시간</option>
</select>
<span>
<select name="min">
	<option value="0">--</option>
	<option value="0.25">15분</option>
	<option value="0.5">30분</option>
	<option value="0.75">45분</option>
</select>

</span>
</div>
<div>알바 장소 : <input type="text" name="place" value="<%=data.getPlace()%>"/></div>
<div>메모 : </div>
<div> <textarea name="memo" cols="30" rows="10"><%=data.getMemo()%></textarea></div>
<input type="submit" value="확인" /><input type="reset" value="취소" />
</form>
</body>
</html>