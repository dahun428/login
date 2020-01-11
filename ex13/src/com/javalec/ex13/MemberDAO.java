package com.javalec.ex13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/basepratice?serverTimezone=UTC";
	private String uid = "root";
	private String upw = "d1860429";

	
	public MemberDAO() {
		try {
			
			Class.forName(driver);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// memberSelect라는 메소드를 만들었다. MemberDAO 클래스의 메소드
	// 근데  ArrayList는 왜 앞에 있어?
	public ArrayList<MemberDTO> memberSelect(){
	// ArrayList dtos를 선언하고 만듦.	
		ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			con = DriverManager.getConnection(url, uid, upw);
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM members");
			
			while(rs.next()) {
				String name = rs.getString("name");
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String phone1 = rs.getString("phone1");
				String phone2 = rs.getString("phone2");
				String phone3 = rs.getString("phone3");
				String gender = rs.getString("gender");
		// MemberDTO 객체를 선언하고 dto 라는 이름 으로 만듬, 이때 메소드의 요소 값으로 rs.next로 검색한 값을 넣고,
		// 해당 값을 dtos ArrayList에 넣음
				MemberDTO dto = new MemberDTO(name, id, pw, phone1, phone2, phone3, gender);
				dtos.add(dto);
			}
			
		
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(rs != null)rs.close();
				if(stmt != null)stmt.close();
				if(con != null)con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		return dtos;
		
		
		
	}
}
