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
	//jsp와 DB가 연결되도록 하는 driver를 연결
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
	//insert 역할 Create Read Update Delete (CRUD)
	//myDTO 데이터 타입의 data를 인자값으로 받는다. 
	public void insert(myDTO data) {
		
		//query값으로 insert구문
		String query = "INSERT INTO members VALUES (?,?,?,?,?,?,?)";
		
		try {
			
//			con = DriverManager.getConnection(url, uid, upw);
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
		//setString 인자로 data.get~ (DTO에서 만든 셋팅 값 getName return name) 
		//pstmt.setString(1, name) 과 같다.
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
	//read를 표기할 select 값. 데이터타입으로 arraylist 를 준다. 가상클래스는 myDTO
	//리턴 값으로 arraylist 인스턴스로 받는다.
	public ArrayList<myDTO> select(){
	//리턴 값인 list 인스턴스	
		ArrayList<myDTO> list = new ArrayList<>();
		
		ResultSet rs = null;
	//query 값	
		
		String query = "SELECT * FROM members"; 
		
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
	//ResultSet next를 통해서 모두다 검색하고, 그 검색 값을 data로 받고 그 리스트를 arraylist 에 포함시킨다.		
			while(rs.next()) {
				
				String name = rs.getString("name");
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String phone1 = rs.getString("phone1");
				String phone2 = rs.getString("phone2");
				String phone3 = rs.getString("phone3");
				String gender = rs.getString("gender");
				
				myDTO data = new myDTO(name, id, pw, phone1, phone2, phone3,gender);
		//이 data는 list에 담는 역할을 하고 역할을 종료한다.		
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
	//getMember할 값. - 해당 값은 특정 id의 정보 값만을 가져오는 것이다.
	//getMember의 리턴할 값 따로, id 값은 이후에 사용될때 해당 세션 참조값을 가져오기위해 셋팅
	public myDTO getMember(String id) {

		myDTO mem = null;
		ResultSet rs = null;
		
	//이때, ResultSet을 통해서 정보를 가져오는 것은 동일하지만, query에 신경을써야한다.	
		String query = "SELECT * FROM members WHERE id = ?";
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
	//모두다 검색하는 것이 아니기 때문에, if를 사용하여, 가져올 수 있도록한다.
	//if의 인자로, 비밀번호등을 주었을 떄는 if를 두번사용.		
			if(rs.next()) {
				
				String name = rs.getString("name");
				id = rs.getString("id");
				String pw = rs.getString("pw");
				String phone1 = rs.getString("phone1");
				String phone2 = rs.getString("phone2");
				String phone3 = rs.getString("phone3");
				String gender = rs.getString("gender");
				
	//리턴 할 값에 next 값을 담는다.			
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
	//update 구문
	//특정 data값을 받느낟.
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
	//delete 값 의 인자로는 기준이 되는 값으로 오는 것은 동일.
	public void delete(String id) {
	//where값을 꼭 써서 delete가 모두 되지 않도록 주의하자.	
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
