package com.javalec.ex18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MyDAO {

	
	public static final int MEMBER_NONEXISTENT = 0;
	public static final int MEMBER_EXISTENT = 1;
	public static final int MEMBER_JOINFAIL = 0;
	public static final int MEMBER_JOIN_SUCCESS = 1;
	public static final int MEMEBER_LOGIN_PW_NO_GOOD = 0;
	public static final int MEMBER_LOGIN_SUCCESS = 1;
	public static final int MEMBER_LOGIN_IS_NOT = -1;
	
	
	
	private DataSource dataSource;
	private Connection con = null;
	private PreparedStatement pstmt = null;
	
	public MyDAO() {
		
		try {
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/mysql");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int insert(MyDTO data) {
		int ri = 0;
		String query = "INSERT INTO loginSystem VALUES (?,?,?,?,?,?)";
		
		
		try {
			
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, data.getId());
			pstmt.setString(2, data.getPw());
			pstmt.setString(3, data.getName());
			pstmt.setString(4, data.geteMail());
			pstmt.setString(5, data.getAddress());
			pstmt.setTimestamp(6, data.getrDate());
			pstmt.executeUpdate();
			ri = 1;
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
		return ri;
	
	}
	public int confirm(String id) {
		int ri = 0;
		
		ResultSet rs = null;
		
		String query = "SELECT * FROM loginSystem WHERE id = ?";
		
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				ri = MyDAO.MEMBER_EXISTENT;
			}else {
				ri = MyDAO.MEMBER_NONEXISTENT; 
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
		
		return ri;
	}
	public int userCheck(String id, String pw) {
		
		int ri = 0;
		String dbPw;
		
		ResultSet rs = null;
		String query = "SELECT pw FROM loginSystem where id = ?";
		
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dbPw = rs.getString("pw");
				if(dbPw.equals(pw)) {
					ri = MyDAO.MEMBER_LOGIN_SUCCESS;
				}else {
					ri = MyDAO.MEMEBER_LOGIN_PW_NO_GOOD;
				}
			}else {
				ri = MyDAO.MEMBER_LOGIN_IS_NOT;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return ri;
	}
	public MyDTO getMember(String id) {
		
		ResultSet rs = null;
		String query = "SELECT * FROM loginSystem WHERE id = ?";
		MyDTO mem = null;
		
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				
				mem = new MyDTO();
				mem.setId(rs.getString("id"));
				mem.setPw(rs.getString("pw"));
				mem.setName(rs.getString("name"));
				mem.seteMail(rs.getString("eMail"));
				mem.setAddress(rs.getString("address"));
				mem.setrDate(rs.getTimestamp("rDate"));
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null)con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return mem;
	}
//	public ArrayList<MyDTO> select() {
//		
//		ArrayList<MyDTO> list = new ArrayList<>();
//		ResultSet rs = null;
//		String query = "SELECT * FROM loginSystem";
//		
//		try {
//			con = dataSource.getConnection();
//			pstmt = con.prepareStatement(query);
//			rs = pstmt.executeQuery();
//			
//			
//			while(rs.next()) {
//				MyDTO data = new MyDTO();
//				
//				data.setId(rs.getString("id"));
//				data.setPw(rs.getString("pw"));
//				data.setName(rs.getString("name"));
//				data.seteMail(rs.getString("eMail"));
//				data.setAddress(rs.getString("address"));
//				data.setrDate(rs.getTimestamp("rDate"));
//				list.add(data);
//			}
//				
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(rs != null)rs.close();
//				if(pstmt != null)pstmt.close();
//				if(con != null)con.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//		return list;
//		
//	}
	public int update(MyDTO data) {
		int ri = 0;
		String query = "UPDATE loginSystem SET pw = ?, eMail =?, address=? WHERE id = ?";
		try {
			
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, data.getPw());
			pstmt.setString(2, data.geteMail());
			pstmt.setString(3, data.getAddress());
			pstmt.setString(4, data.getId());
			ri = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)pstmt.close();
				if(con != null) con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return ri;
	}
	
	public void delete(String id) {
		
		String query = "DELETE FROM loginSystem WHERE id = ?";
		
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
