<%@page import="com.javalec.ex15.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.javalec.ex15.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%

MemberDAO memberDAO = new MemberDAO();
ArrayList<MemberDTO> dtos = memberDAO.memberSelect();

for(int i = 0; i < dtos.size(); i ++ ){
	
	MemberDTO dto = dtos.get(i);
	String name = dto.getName();
	String id = dto.getId();
	String pw = dto.getPw();
	String phone = dto.getPhone1() + " - " + dto.getPhone2() + " - " + dto.getPhone3();
	String gender = dto.getGender();
	
	out.println("�̸� : " + name + "<br />");
	out.println("���̵� : " + id + "<br />");
	out.println("��й�ȣ : " + pw + "<br />");
	out.println("��ȭ��ȣ : " + phone + "<br />");
	out.println("���� : " + gender + "<br />");
}


%>

</body>
</html>