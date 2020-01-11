package com.javalec.ex16;

public class MemberInfoDAO {
	//�ش� DAO�� ���ǿ��� ��� DAO�� ���Ѵ�.
	private static MemberInfoDAO instance = new MemberInfoDAO();
	//try catch���� ���� �����Ŀ� ���� ����!!
	private MemberInfoDAO() {}
	
	//Main.jsp ���� memberDAO �� ������(�ν��Ͻ�)�� ���߿� �����ϳ�, ���� �����ϳ��� ����!! 
	public static MemberInfoDAO getInstance() {
		return instance;
	}

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/basepratice?serverTimezone=UTC";
	private String uid = "root";
	private String upw = "d1860429";
	
	//���� ���� �޳�, �ȹ޳��� ����!!!!!!!
	public void insert(MemberInfoDTO data) {
		
	}
	
}
