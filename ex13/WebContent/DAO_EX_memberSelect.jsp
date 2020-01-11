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
//memberDAO를 호출하고 , memberDAO를 사용 시작
MemberDAO memberDAO = new MemberDAO();
//ArrayList dtos는  이미 생성되어있음 (ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();)
//만들어진 ArrayList 에 memberDAO.memberSelect(); 값을 넣음.
//memberDAO.memberSelect는 dtos를 리턴 받은 메소드.
//dtos에는 add(dto)로 넣어진 값이 있음.

//ArrayList<MemberDTO> 는 데이터 타입. dtos 는 그 데이터 타입의 변수값
//memberDAO는 위에서 MemberDAO 객체의 변수
//객체의 변수 안에 있는 메소드 memberSelect()를 호출
// 그것은 dtos에 담음

ArrayList<MemberDTO> dtos = memberDAO.memberSelect();

//dtos의 size()값은 ArrayList의 메소드
//dtos에는 memberSelect() 메소드의 값을 가지고 있는데, 이것은 try 구문으로 담은
//dtos.add(dto)값을 담고 있다.
//즉, MemberDTO객체의 변수인 dto 내부 인자로 받은 값들(데이터베이스의 모든 name,id ... 값들을 담고 있다.)
//그 size는 rs.next()메소드를 통해 불러온 갯수만큼 있을 것이다.



for(int i = 0; i < dtos.size(); i++){

	
//MemeberDTO dto 는  dto를 선언하여, MemberDTO 객체를 불러오고 dto 로 선언한다.
//dto 에는 = dtos.get(i)가 오게 되는데, i는 size 값만큼 들어있고,
//dtos는 get 함수를 통해 불러온 모든 값들을 지칭하게되는데, 그것이
//dto 에 담기게 된다.
//get(i)가 i=1 일경우
//dtos.get(1) 은 memberSelect()메소드를 통해 담긴, 
//name,id,pw,phone1,phone2,phone3,gender 값 (데이터첫번째 값)이 단기게 되고
// 이것은dto 변수에 담는다.
	MemberDTO dto = dtos.get(i);
//name 변수에는 dto.getName()이 담기게 되는데 이것은 name을 리턴해준다.
//즉 MemeberDAO의 값을 MemberDTO에 옮기고, 이것을 반복문으로 실행해준뒤, MemberDTO 메소드 값으로 name값을 리턴해주는 것이다.
	String name = dto.getName();
	String id = dto.getId();
	String pw = dto.getPw();
	String phone = dto.getPhone1() + "-" + dto.getPhone2() + "-" + dto.getPhone3();
	String gender = dto.getGender();
	
	out.println("이름  : " + name + ",아이디 : " + id + ",비밀번호 : "+ pw + ", 연락처 : " + phone + ", 성별 : " + gender + "<br />");
}







%>

</body>
</html>