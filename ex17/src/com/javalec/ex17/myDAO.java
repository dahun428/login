package com.javalec.ex17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import javax.naming.Context;
public class myDAO {
//
//	private String driver = "com.mysql.cj.jdbc.Driver";
//	private String url = "jdbc:mysql://localhost:3306/basepratice?serverTimezone=UTC";
//	private String uid = "root";
//	private String upw = "d1860429";
	private DataSource dataSource;
	private Connection con = null;
	private PreparedStatement pstmt = null;
	//jsp�� DB�� ����ǵ��� �ϴ� driver�� ����
	public myDAO() {
//		try {
//			Class.forName(driver);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/mysql");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//insert ���� Create Read Update Delete (CRUD)
	//myDTO ������ Ÿ���� data�� ���ڰ����� �޴´�. 
	public void insert(myDTO data) {
		
		//query������ insert����
		String query = "INSERT INTO members VALUES (?,?,?,?,?,?,?)";
		
		try {
			
//			con = DriverManager.getConnection(url, uid, upw);
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
		//setString ���ڷ� data.get~ (DTO���� ���� ���� �� getName return name) 
		//pstmt.setString(1, name) �� ����.
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
	//read�� ǥ���� select ��. ������Ÿ������ arraylist �� �ش�. ����Ŭ������ myDTO
	//���� ������ arraylist �ν��Ͻ��� �޴´�.
	public ArrayList<myDTO> select(){
	//���� ���� list �ν��Ͻ�	
		ArrayList<myDTO> list = new ArrayList<>();
		
		ResultSet rs = null;
	//query ��	
		
		String query = "SELECT * FROM members"; 
		
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
	//ResultSet next�� ���ؼ� ��δ� �˻��ϰ�, �� �˻� ���� data�� �ް� �� ����Ʈ�� arraylist �� ���Խ�Ų��.		
			while(rs.next()) {
				
				String name = rs.getString("name");
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String phone1 = rs.getString("phone1");
				String phone2 = rs.getString("phone2");
				String phone3 = rs.getString("phone3");
				String gender = rs.getString("gender");
				
				myDTO data = new myDTO(name, id, pw, phone1, phone2, phone3,gender);
		//�� data�� list�� ��� ������ �ϰ� ������ �����Ѵ�.		
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
	//getMember�� ��. - �ش� ���� Ư�� id�� ���� ������ �������� ���̴�.
	//getMember�� ������ �� ����, id ���� ���Ŀ� ���ɶ� �ش� ���� �������� ������������ ����
	public myDTO getMember(String id) {

		myDTO mem = null;
		ResultSet rs = null;
		
	//�̶�, ResultSet�� ���ؼ� ������ �������� ���� ����������, query�� �Ű�������Ѵ�.	
		String query = "SELECT * FROM members WHERE id = ?";
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
	//��δ� �˻��ϴ� ���� �ƴϱ� ������, if�� ����Ͽ�, ������ �� �ֵ����Ѵ�.
	//if�� ���ڷ�, ��й�ȣ���� �־��� ���� if�� �ι����.		
			if(rs.next()) {
				
				String name = rs.getString("name");
				id = rs.getString("id");
				String pw = rs.getString("pw");
				String phone1 = rs.getString("phone1");
				String phone2 = rs.getString("phone2");
				String phone3 = rs.getString("phone3");
				String gender = rs.getString("gender");
				
	//���� �� ���� next ���� ��´�.			
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
	//update ����
	//Ư�� data���� �޴���.
	public void update(myDTO data) {
		
		String query = "UPDATE members SET name = ?, pw = ?, phone1 = ?, phone2= ?, phone3= ?, gender= ? WHERE id = ?";
		try {
			
			con = dataSource.getConnection();
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
	//delete �� �� ���ڷδ� ������ �Ǵ� ������ ���� ���� ����.
	public void delete(String id) {
	//where���� �� �Ἥ delete�� ��� ���� �ʵ��� ��������.	
		String query = "DELETE FROM members WHERE id = ?";
		try {
			
			con = dataSource.getConnection();
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
