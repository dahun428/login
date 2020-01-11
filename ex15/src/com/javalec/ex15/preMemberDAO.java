package com.javalec.ex15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class preMemberDAO {


	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/basepratice?serverTimezone=UTC";
	private String uid = "root";
	private String upw = "d1860429";
	
	
	public preMemberDAO(){
		try {
			Class.forName(driver);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<preMemberDTO> memberSelect(){

		ArrayList<preMemberDTO> dtos = new ArrayList<>();
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "SELECT * FROM memebers ";
		
				
		try {
			con = DriverManager.getConnection(url, uid, upw);
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery(query);		
			
			while(rs.next()) {
				String name = rs.getString("name");
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String phone1 = rs.getString("phone1");
				String phone2 = rs.getString("phone2");
				String phone3 = rs.getString("phone3");
				String gender = rs.getString("gender");
				preMemberDTO dto = new preMemberDTO(name, id, pw, phone1, phone2, phone3, gender);
			
				dtos.add(dto);
			
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		return dtos;
	}
	public ArrayList<MemberDTO> memberInsert(){
		
		ArrayList<MemberDTO> insertDtos = new ArrayList<>();
		
		
		
		return insertDtos;
	}
	
	
	
}
