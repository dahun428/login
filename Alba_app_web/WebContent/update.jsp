<%@page import="com.javalec.system.MyDAO"%>
<%@page import="com.javalec.system.MyDTO"%>
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
request.setCharacterEncoding("EUC-KR");
int _id = (int)session.getAttribute("_id");


name = request.getParameter("name");
dateY = Integer.parseInt(request.getParameter("dateY"));
dateM = Integer.parseInt(request.getParameter("dateM"));
dateD = Integer.parseInt(request.getParameter("dateD"));
pay = Integer.parseInt(request.getParameter("pay"));
time = request.getParameter("time");
hour = Integer.parseInt(request.getParameter("hour"));
min = Double.parseDouble(request.getParameter("min"));
place = request.getParameter("place");
memo = request.getParameter("memo");
wage = (pay * hour) + (pay * min);
night_wage = 1.5 * (pay * hour) + (pay * min);

MyDTO data = new MyDTO();
data.setName(name);
data.setDateY(dateY);
data.setDateM(dateM);
data.setDateD(dateD);
data.setPay(pay);
data.setTime(time);
data.setHour(hour);
data.setMin(min);
data.setPlace(place);
data.setMemo(memo);
data.setWage(wage);
data.setNight_wage(night_wage);
data.set_id(_id);

MyDAO manager = new MyDAO();
manager.update(data);

response.sendRedirect("list.jsp");

%>

</body>
</html>