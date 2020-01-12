package com.javalec.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MyDAO {
	
	private static MyDAO instance = new MyDAO();
	

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/basepratice?serverTimezone=UTC";
	private String uid = "root";
	private String upw = "d1860429";
	
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public MyDAO(){try {Class.forName(driver);	}catch(Exception e) {e.printStackTrace();}
	}
	public MyDAO getInstance() {
		return instance;
	}
	
	
	public void insert(MyDTO data) {
		
	String query = "INSERT INTO alba VALUES(_id,?,?,?,?,?,?,?,?,?,?,?,?)";	
	
	
	try {
		con = DriverManager.getConnection(url, uid, upw);
		pstmt = con.prepareStatement(query);
		
		pstmt.setString(1, data.getName());
		pstmt.setInt(2, data.getDateY());
		pstmt.setInt(3, data.getDateM());
		pstmt.setInt(4, data.getDateD());
		pstmt.setInt(5, data.getPay());
		pstmt.setString(6, data.getTime());
		pstmt.setInt(7, data.getHour());
		pstmt.setDouble(8, data.getMin());
		pstmt.setString(9, data.getPlace());
		pstmt.setString(10, data.getMemo());
		
		if(data.getTime().equals("noon")) {
			pstmt.setDouble(11, data.getWage());
			pstmt.setDouble(12, 0);
				
		}else {
			pstmt.setDouble(11, 0);
			pstmt.setDouble(12, data.getNight_wage());
				
		}
		System.out.println(data.getTime());
		
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
	public ArrayList<MyDTO> select() {
		
		ArrayList<MyDTO> list = new ArrayList<>();
		
		String query = "SELECT * FROM alba";
		
		try {
			con = DriverManager.getConnection(url, uid, upw);
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				MyDTO data = new MyDTO();
				
				data.set_id(rs.getInt("_id"));
				data.setName(rs.getString("name"));
				data.setDateY(rs.getInt("dateY"));
				data.setDateM(rs.getInt("dateM"));
				data.setDateD(rs.getInt("dateD"));
				data.setPay(rs.getInt("pay"));
				data.setTime(rs.getString("time"));
				data.setHour(rs.getInt("hour"));
				data.setMin(rs.getDouble("min"));
				data.setPlace(rs.getString("place"));
				data.setMemo(rs.getString("memo"));
				data.setWage(rs.getDouble("wage"));
				data.setNight_wage(rs.getDouble("night_wage"));
				
				list.add(data);
				
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
		
		return list;
	}
	public void update(MyDTO data) {
		
		String query = "UPDATE alba SET name = ?, dateY =?, dateM=?, dateD =?, pay=?, time =?, hour =?, min=?,place=?,memo=?,"
				+ "wage=?,night_wage=? WHERE _id = ?";
		
		try {
			
			con = DriverManager.getConnection(url, uid, upw);
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, data.getName());
			pstmt.setInt(2, data.getDateY());	
			pstmt.setInt(3, data.getDateM());
			pstmt.setInt(4, data.getDateD());
			pstmt.setInt(5, data.getPay());
			pstmt.setString(6, data.getTime());
			pstmt.setInt(7, data.getHour());
			pstmt.setDouble(8, data.getMin());
			pstmt.setString(9, data.getPlace());
			pstmt.setString(10, data.getMemo());
			pstmt.setDouble(11, data.getWage());
			pstmt.setDouble(12, data.getNight_wage());
			pstmt.setInt(13, data.get_id());
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
	public void delete(int _id) {
		
		String query = "DELETE FROM alba WHERE _id= ?";
		
		try {
			
			con = DriverManager.getConnection(url, uid, upw);
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, _id);
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
	public MyDTO getData(int _id) {
		
		
		MyDTO data = null;
		
		String query = "SELECT * FROM alba WHERE _id = ?";
		
		try {
			
			con = DriverManager.getConnection(url,uid,upw);
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, _id);
			rs = pstmt.executeQuery();
			
			
			if(rs.next()) {
				
				
				data = new MyDTO();
				data.set_id(rs.getInt("_id"));
				data.setName(rs.getString("name"));
				data.setDateY(rs.getInt("dateY"));
				data.setDateM(rs.getInt("dateM"));
				data.setDateD(rs.getInt("dateD"));
				data.setPay(rs.getInt("pay"));
				data.setTime(rs.getString("time"));
				data.setHour(rs.getInt("hour"));
				data.setMin(rs.getDouble("min"));
				data.setPlace(rs.getString("place"));
				data.setMemo(rs.getString("memo"));
				data.setWage(rs.getDouble("wage"));
				data.setNight_wage(rs.getDouble("night_wage"));
				
				
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
		
		return data;
	}
	
	
}
