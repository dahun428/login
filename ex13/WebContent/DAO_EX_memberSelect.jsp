<%@page import="com.javalec.ex13.MemberDTO"%>
<%@page import="com.javalec.ex13.MemberDAO"%>
<%@page import="java.util.ArrayList"%>
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
//memberDAO�� ȣ���ϰ� , memberDAO�� ��� ����
MemberDAO memberDAO = new MemberDAO();
//ArrayList dtos��  �̹� �����Ǿ����� (ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();)
//������� ArrayList �� memberDAO.memberSelect(); ���� ����.
//memberDAO.memberSelect�� dtos�� ���� ���� �޼ҵ�.
//dtos���� add(dto)�� �־��� ���� ����.

//ArrayList<MemberDTO> �� ������ Ÿ��. dtos �� �� ������ Ÿ���� ������
//memberDAO�� ������ MemberDAO ��ü�� ����
//��ü�� ���� �ȿ� �ִ� �޼ҵ� memberSelect()�� ȣ��
// �װ��� dtos�� ����

ArrayList<MemberDTO> dtos = memberDAO.memberSelect();

//dtos�� size()���� ArrayList�� �޼ҵ�
//dtos���� memberSelect() �޼ҵ��� ���� ������ �ִµ�, �̰��� try �������� ����
//dtos.add(dto)���� ��� �ִ�.
//��, MemberDTO��ü�� ������ dto ���� ���ڷ� ���� ����(�����ͺ��̽��� ��� name,id ... ������ ��� �ִ�.)
//�� size�� rs.next()�޼ҵ带 ���� �ҷ��� ������ŭ ���� ���̴�.



for(int i = 0; i < dtos.size(); i++){

	
//MemeberDTO dto ��  dto�� �����Ͽ�, MemberDTO ��ü�� �ҷ����� dto �� �����Ѵ�.
//dto ���� = dtos.get(i)�� ���� �Ǵµ�, i�� size ����ŭ ����ְ�,
//dtos�� get �Լ��� ���� �ҷ��� ��� ������ ��Ī�ϰԵǴµ�, �װ���
//dto �� ���� �ȴ�.
//get(i)�� i=1 �ϰ��
//dtos.get(1) �� memberSelect()�޼ҵ带 ���� ���, 
//name,id,pw,phone1,phone2,phone3,gender �� (������ù��° ��)�� �ܱ�� �ǰ�
// �̰���dto ������ ��´�.
	MemberDTO dto = dtos.get(i);
//name �������� dto.getName()�� ���� �Ǵµ� �̰��� name�� �������ش�.
//�� MemeberDAO�� ���� MemberDTO�� �ű��, �̰��� �ݺ������� �������ص�, MemberDTO �޼ҵ� ������ name���� �������ִ� ���̴�.
	String name = dto.getName();
	String id = dto.getId();
	String pw = dto.getPw();
	String phone = dto.getPhone1() + "-" + dto.getPhone2() + "-" + dto.getPhone3();
	String gender = dto.getGender();
	
	out.println("�̸�  : " + name + ",���̵� : " + id + ",��й�ȣ : "+ pw + ", ����ó : " + phone + ", ���� : " + gender + "<br />");
}







%>

</body>
</html>