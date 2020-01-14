<%@page import="com.javalec.loginsystem.memberDTO"%>
<%@page import="com.javalec.loginsystem.memberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%request.setCharacterEncoding("EUC-KR"); %>    
<%
String id = (String) session.getAttribute("id");
memberDAO  dao = memberDAO.getInstance();
memberDTO dto = dao.getMember(id);

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="members.js"></script>
</head>
<body>



<form action="modifyOk.jsp" method="post" name="reg_frm">
<div>아이디 : <%=dto.getId() %></div>
<div>비밀번호 : <input type="password" name="pw" size="20" /></div>
<div>비밀번호 확인 : <input type="password" name="pw_check" size="20" /></div>
<div>이름 : <%=dto.getName() %></div>
<div>메일 : <input type="text" name="eMail" size= "20" value="<%=dto.geteMail()%>"/></div>
<div>주소 : <input type="text" name="address" size="50" value="<%=dto.getAddress()%>"/></div>
<input type="button" value="수정" onclick="updateInfoConfirm()"/>
<input type="reset" value="취소" onclick="javascript:window.location='login.jsp'" />
</form>


</body>
</html>