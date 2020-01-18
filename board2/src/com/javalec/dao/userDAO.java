package com.javalec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.dto.userDTO;

public class userDAO {
	

	public static final int MEMBER_NONEXISTENT = 0;
	public static final int MEMBER_EXISTENT = 1;
	public static final int MEMBER_JOIN_FAIL = 0;
	public static final int MEMBER_JOIN_SUCCESS = 1;
	public static final int MEMBER_LOGIN_PW_NO_GOOD = 0;
	public static final int MEMBER_LOGIN_SUCCESS = 1;
	public static final int MEMBER_LOGIN_IS_NOT = -1;
	
	private static userDAO instance = new userDAO();
	public static userDAO getInstance() {
		return instance;
	}
	
	
	private DataSource dataSource;
	
	public userDAO() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/mysql");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public int insert(userDTO dto) {
		int ri=0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		String query="INSERT INTO user VALUES (?,?,?,?,?)";
		
		
		try {
			
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, dto.getUserID());
			pstmt.setString(2, dto.getUserPW());
			pstmt.setString(3, dto.getUserName());
			pstmt.setString(4, dto.getUserGender());
			pstmt.setString(5, dto.getUserEmail());
			pstmt.executeUpdate();
			ri = userDAO.MEMBER_JOIN_SUCCESS;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return ri;
	}
	
	
	
	public int confirmId(String userID) {
		
		int ri = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "SELECT userID FROM USER WHERE userID = ?";
	
		try {
			
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, userID);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				ri = userDAO.MEMBER_EXISTENT;
			}else {
				ri = userDAO.MEMBER_NONEXISTENT;
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
	public int userCheck(String userID, String userPw) {
		int ri = 0;
		String dbPw = null;
		String query="SELECT userPW FROM USER WHERE userID = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, userID);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dbPw = rs.getString("userPW");
				if(dbPw.equals(userPw)) {
					ri = userDAO.MEMBER_LOGIN_SUCCESS;
				}else {
					ri = userDAO.MEMBER_LOGIN_PW_NO_GOOD;
				}
				
			}else {
				ri = userDAO.MEMBER_LOGIN_IS_NOT;
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
	public userDTO getMember(String strID) {
		
		userDTO dto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM USER WHERE userID = ?";
		
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, strID);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new userDTO();
				
				dto.setUserID(rs.getString("userID"));
				dto.setUserName(rs.getString("userName"));
				dto.setUserGender(rs.getString("userGender"));
				dto.setUserEmail(rs.getString("userEmail"));		
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
		
		return dto;
	}
	public void update(userDTO dto, String strID) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String query = "UPDATE user SET userEmail = ?, userName= ? WHERE userID = ?";
		
		try {
			
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, dto.getUserEmail());
			pstmt.setString(2, dto.getUserName());
			pstmt.setString(3, strID);
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
	
	public void delete(String userID) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String query = "DELETE FROM user WHERE userID = ?";
		
		try {
			
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, userID);
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
