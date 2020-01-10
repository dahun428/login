package com.javalec.ex12;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class modifyOk
 */
@WebServlet("/modifyOk")
public class modifyOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection con = null;
	private Statement stmt = null;
//	private ResultSet rs = null;
	String id, name, pw, phone1, phone2, phone3, gender;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modifyOk() {
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
		HttpSession session = request.getSession();
		
		id = (String) session.getAttribute("id");
		name = request.getParameter("name");
		pw = request.getParameter("pw");
		phone1 = request.getParameter("phone1");
		phone2 = request.getParameter("phone2");
		phone3 = request.getParameter("phone3");
		gender = request.getParameter("gender");
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/basepratice?serverTimezone=UTC";
		String uid = "root";
		String upw = "d1860429";
		String query = "UPDATE members SET name = '" + name + "', pw = '" + pw 
					+ "', phone1 ='" + phone1 + "', phone2 ='" + phone2 + "', phone3 ='" 
					+ phone3+"'WHERE id = '"+id+"'";
//		String query2 = "SELECT * FROM members WHERE name ='" + name +"'AND pw  ='" + pw + "'AND phone1  ='" 
//						+ phone1 +"'AND phone2  ='"+ phone2 +"'AND phone3  ='"+ phone3 +"'" ;
//		
//		String query2 = "SELECT * FROM members WHERE id = '" + id+"'";
		
		
		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, uid, upw);
			stmt = con.createStatement();
			
			int i = stmt.executeUpdate(query);
			if(i == 1) {
				
//				rs = stmt.executeQuery(query2);
//				while(rs.next()) {
//					name = rs.getString("name");
//					id = rs.getString("id");
//					pw = rs.getString("pw");
//					phone1 = rs.getString("phone1");
//					phone2 = rs.getString("phone2");
//					phone3 = rs.getString("phone3");
//					gender = rs.getString("gender");
//				}
				session.setAttribute("id",id);
				session.setAttribute("name", name);
				session.setAttribute("pw", pw);
				session.setAttribute("phone1", phone1);
				session.setAttribute("phone2", phone2);
				session.setAttribute("phone3", phone3);
				session.setAttribute("gender", gender);
				
				
				System.out.println("modify success");
				response.sendRedirect("modifyResult.jsp");
			}else {
				System.out.println("modify fail");
				response.sendRedirect("loginResult.jsp");
			}
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}


}
