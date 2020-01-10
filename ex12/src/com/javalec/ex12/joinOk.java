package com.javalec.ex12;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class joinOk
 */
@WebServlet("/joinOk")
public class joinOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public joinOk() {
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
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		request.setCharacterEncoding("EUC-KR");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String[] phone1 = request.getParameterValues("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String gender = request.getParameter("gender");
		
		Connection con = null;
//		PreparedStatement ptsmt = null;
		Statement stmt = null;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/basepratice?serverTimezone=UTC";
		
		String uid = "root";
		String upw = "d1860429";
		//Äõ¸®°ª
//		String query = "INSERT INTO members (name, id, pw, phone1, phone2, phone3, gender) VALUES(?,?,?,?,?,?,?)";
		String query =  "INSERT INTO members VALUES ('"+ name + "','" +id + "','" + pw + "','" 
						+ Arrays.toString(phone1) + "','" + phone2 + "','" + phone3 + "','" + gender + "')";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,uid,upw);
//			ptsmt = con.prepareStatement(query);
			stmt = con.createStatement();
			
//			ptsmt.setString(1, name);
//			ptsmt.setString(2, id);
//			ptsmt.setString(3, pw);
//			ptsmt.setString(4, Arrays.toString(phone1));
//			ptsmt.setString(5, phone2);
//			ptsmt.setString(6, phone3);
//			ptsmt.setString(7, gender);
			
//			int i = ptsmt.executeUpdate();
			int i = stmt.executeUpdate(query);
			if(i==1) {
				System.out.println("insert success");
				response.sendRedirect("joinResult.jsp");
			}else {
				System.out.println("fail to insert");
				response.sendRedirect("join.html");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			}catch(Exception e) {}
			
			
		}
		
	}

}
