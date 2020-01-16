package com.javalec.loginsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class memberDAO {

	//로그인 판단 여부 
	public static final int MEMBER_NONEXISTENT = 0;
	public static final int MEMBER_EXISTENT = 1;
	public static final int MEMBER_JOIN_FAIL = 0;
	public static final int MEMBER_JOIN_SUCCESS = 1;
	public static final int MEMBER_LOGIN_PW_NO_GOOD = 0;
	public static final int MEMBER_LOGIN_SUCCESS = 1;
	public static final int MEMBER_LOGIN_IS_NOT = -1;
	//
	private DataSource dataSource;
	private Connection con = null;
	private PreparedStatement pstmt = null;
	
	
	//인스턴스 객체로 외부접근 차단.
	private static memberDAO instance = new memberDAO();
	
	private memberDAO() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/mysql");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static memberDAO getInstance() {
		return instance;
	}
	
	
	
	public int insert(memberDTO dto) {
		int ri = 0;
		
		String query = "INSERT INTO loginsystem VALUES(?,?,?,?,?,?)";
		
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.geteMail());
			pstmt.setString(5, dto.getAddress());
			pstmt.setTimestamp(6, dto.getrDate());
			pstmt.executeUpdate();
			
			ri = memberDAO.MEMBER_JOIN_SUCCESS;
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

		return ri;
	}
	public int confirmId(String id) {
		int ri = 0;
		
		String query = "SELECT id FROM loginsystem WHERE id = ?";
		ResultSet rs = null;
		try {
			
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				ri = memberDAO.MEMBER_EXISTENT;
			}else {
				ri = memberDAO.MEMBER_NONEXISTENT;
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
		String query = "SELECT pw FROM loginsystem WHERE id = ?";
		ResultSet rs = null;
		
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dbPw = rs.getString("pw");
				if(dbPw.equals(pw)) {
					ri = memberDAO.MEMBER_LOGIN_SUCCESS;
				}else {
					ri = memberDAO.MEMBER_LOGIN_PW_NO_GOOD;
				}
			}else {
				ri = memberDAO.MEMBER_LOGIN_IS_NOT;
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null)pstmt.close();
				if(con != null )con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		return ri;
	}
	public memberDTO getMember(String id) {
		
		
		String query = "SELECT * FROM loginsystem WHERE id = ?";
		ResultSet rs = null;
		memberDTO dto = null;
		
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto = new memberDTO();
				
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				dto.seteMail(rs.getString("eMail"));
				dto.setAddress(rs.getString("address"));
				dto.setrDate(rs.getTimestamp("rDate"));
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
		return dto;
	}
	
	public void update(memberDTO dto, String id) {
		
		String query =
		"UPDATE loginsystem SET pw =? , eMail =? , address = ? WHERE id =?";
		
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, dto.getPw());
			pstmt.setString(2, dto.geteMail());
			pstmt.setString(3, dto.getAddress());
			pstmt.setString(4, id);
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	public void delete(String id) {
		String query ="DELETE FROM loginsystem WHERE id = ?";
		
		
		try {
			
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
