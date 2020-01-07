package com.javalec.ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
 
import java.sql.SQLException;
 
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class JOINOK
 */
@WebServlet("/JOINOK")
public class JOINOK extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JOINOK() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html; charset=euc-kr");
		
		
		String username = request.getParameter("username");
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		String[] phone1 = request.getParameterValues("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String gender = request.getParameter("gender");
		String phoneNumber = String.format("%s-%s-%s",Arrays.toString(phone1), phone2, phone3);   
		
		Connection conn = null;
		PreparedStatement pstmt = null;
				
		server_join server = new server_join();
		String urlname = "basepratice";
		String driver = server.driver();
		String url = server.url(urlname);
		String uid = server.uid();
		String upw = server.upw();
		String query = "INSERT INTO loginsystem (username, userid, userpw, userphone, usergender) VALUES(?,?,?,?,?)";
		
		try {
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, username);
			pstmt.setString(2, userid);
			pstmt.setString(3, userpw);
			pstmt.setString(4, phoneNumber);
			pstmt.setString(5, gender);
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt !=null) {
				try {
					pstmt.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}if(conn != null) {
				try {
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
//		response.sendRedirect("JOINRESULT.jsp");
//		PrintWriter writer = response.getWriter();
//		writer.println("<html><header></header><body>");
//		writer.println("이름 :" + username +"<br />");
//		writer.println("아이디 :" + userid +"<br />");
//		writer.println("비밀번호 :" + userpw +"<br />");
//		writer.println("전화번호 :" + Arrays.toString(phone1) + phone2 + phone3 + "<br />");
//		writer.println("성별 :" + gender + "<br />");
//		writer.close();
	}
}
//	}
//	private void getMysqlConnection() {
//
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		
//		String driver = "com.mysql.cj.jdbc.Driver";
//		String url = "jdbc:mysql://localhost:3306/jsp_pratice?serverTimezone=UTC";
//		String uid = "root";
//		String upw = "d1860429";
//		String query = "INSERT INTO loginsystem (username, userid, userpw, userpw, userphone, usergender) VALUES(?,?,?,?,?,?)";
//		
//		try {
//			
//			Class.forName(driver);
//			conn = DriverManager.getConnection(url,uid,upw);
//			pstmt = conn.prepareStatement(query);
//			
//			pstmt.setString(1, username);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//	}


