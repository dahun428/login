package com.javalec.ex12;

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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginOk
 */
@WebServlet("/loginOk")
public class loginOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    String name, id, pw, phone1, phone2, phone3, gender, getId, getPw;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginOk() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAction(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAction(request, response);
	}
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException {
		request.setCharacterEncoding("EUC-KR");
		
		getId = request.getParameter("id");
		getPw = request.getParameter("pw");
		
		HttpSession session = request.getSession();
		session.setAttribute("getId", getId);
		session.setAttribute("getPw", getPw);
		
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/basepratice?serverTimezone=UTC";
		String uid = "root";
		String upw = "d1860429";
		
		String query = "SELECT * FROM members WHERE id ='" +getId+"'AND pw  ='" + getPw +"'" ;
		
	
		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, uid, upw);
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(query);

			while(rs.next()) {
				name = rs.getString("name");
				id = rs.getString("id");
				pw = rs.getString("pw");
				phone1 = rs.getString("phone1");
				phone2 = rs.getString("phone2");
				phone3 = rs.getString("phone3");
				gender = rs.getString("gender");
			}
			
			session.setAttribute("name", name);
			session.setAttribute("id", id);
			session.setAttribute("pw", pw);
			session.setAttribute("phone1", phone1);
			session.setAttribute("phone2", phone2);
			session.setAttribute("phone3", phone3);
			session.setAttribute("gender", gender);
			
			
			response.sendRedirect("loginResult.jsp");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
