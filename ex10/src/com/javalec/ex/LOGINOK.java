package com.javalec.ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.Session;


/**
 * Servlet implementation class LOGINOK
 */
@WebServlet("/LOGINOK")
public class LOGINOK extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LOGINOK() {
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
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html; charset=euc-kr");
		//로그인 파라미터 불러오기
		String loginid = request.getParameter("userid");
		String loginpw = request.getParameter("userpw");
	
		Connection conn = null;
		Statement stmt = null;
		ResultSet resultSet;
		
		server_join server = new server_join();
		String driver = server.driver();
		String url = server.url("basepratice");
		String uid = server.uid();
		String upw = server.upw();
		String query = "SELECT * FROM loginsystem";
				
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, upw);
			stmt = conn.createStatement();
			resultSet = stmt.executeQuery(query); 
			
			while(resultSet.next()) {
				
				String userid = resultSet.getString("userid");
				String userpw = resultSet.getString("userpw");
			
				if((userid.equals(loginid)) && (userpw.equals(loginpw))) {
					
					response.sendRedirect("LOGINRESULT.jsp");
					System.out.println("로그인되었습니다.");
				}else {
					response.sendRedirect("LOGIN.html");
					System.out.println("없는 아이디입니다.");
				}
							
				
			}
			
			
				
					
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(stmt !=null) {
				try {
					stmt.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}if(conn != null) {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
				
		
	}

}
