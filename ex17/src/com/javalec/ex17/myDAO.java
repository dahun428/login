package com.javalec.ex17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class myDAO {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/basepratice?serverTimezone=UTC";
	private String uid = "root";
	private String upw = "d1860429";
	private Connection con = null;
	private PreparedStatement pstmt = null;
	public myDAO() {
		try {
			Class.forName(driver);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void insert(myDTO data) {
		
		
		String query = "INSERT INTO members VALUES (?,?,?,?,?,?,?)";
		
		try {
			
			con = DriverManager.getConnection(url, uid, upw);
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, data.getName());
			pstmt.setString(2, data.getId());
			pstmt.setString(3, data.getPw());
			pstmt.setString(4, data.getPhone1());
			pstmt.setString(5, data.getPhone2());
			pstmt.setString(6, data.getPhone3());
			pstmt.setString(7, data.getGender());
			pstmt.executeUpdate();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
		
	}
	public ArrayList<myDTO> select(){
		
		ArrayList<myDTO> list = new ArrayList<>();
		
		ResultSet rs = null;
		String query = "SELECT * FROM members"; 
		
		try {
			con = DriverManager.getConnection(url, uid, upw);
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				String name = rs.getString("name");
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String phone1 = rs.getString("phone1");
				String phone2 = rs.getString("phone2");
				String phone3 = rs.getString("phone3");
				String gender = rs.getString("gender");
				
				myDTO data = new myDTO(name, id, pw, phone1, phone2, phone3,gender);
				list.add(data);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		return list;
	}
	
	public myDTO getMember(String id) {

		myDTO mem = null;
		ResultSet rs = null;
		String query = "SELECT * FROM members WHERE id = ?";
		try {
			con = DriverManager.getConnection(url, uid, upw);
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				
				String name = rs.getString("name");
				id = rs.getString("id");
				String pw = rs.getString("pw");
				String phone1 = rs.getString("phone1");
				String phone2 = rs.getString("phone2");
				String phone3 = rs.getString("phone3");
				String gender = rs.getString("gender");
				
				
				mem = new myDTO(name, id, pw, phone1, phone2, phone3, gender);
			
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		return mem;
	}
	public void update(myDTO data) {
		
		String query = "UPDATE members SET name = ?, pw = ?, phone1 = ?, phone2= ?, phone3= ?, gender= ? WHERE id = ?";
		try {
			
			con = DriverManager.getConnection(url, uid, upw);
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, data.getName());
			pstmt.setString(2, data.getPw());
			pstmt.setString(3, data.getPhone1());
			pstmt.setString(4, data.getPhone2());
			pstmt.setString(5, data.getPhone3());
			pstmt.setString(6, data.getGender());
			pstmt.setString(7, data.getId());
			pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void delete(String id) {
		
		String query = "DELETE FROM members WHERE id = ?";
		try {
			
			con = DriverManager.getConnection(url,uid,upw);
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
