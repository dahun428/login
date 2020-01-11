package com.javalec.ex16;

public class MemberInfoDAO {
	//해당 DAO를 강의에서 배운 DAO와 비교한다.
	private static MemberInfoDAO instance = new MemberInfoDAO();
	//try catch문을 언제 쓸꺼냐에 대한 차이!!
	private MemberInfoDAO() {}
	
	//Main.jsp 에서 memberDAO 를 생성자(인스턴스)로 나중에 선언하냐, 지금 선언하냐의 차이!! 
	public static MemberInfoDAO getInstance() {
		return instance;
	}

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/basepratice?serverTimezone=UTC";
	private String uid = "root";
	private String upw = "d1860429";
	
	//리턴 값을 받냐, 안받냐의 차이!!!!!!!
	public void insert(MemberInfoDTO data) {
		
	}
	
}
