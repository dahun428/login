package com.javalec.ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MODIFYOK
 */
@WebServlet("/MODIFYOK")
public class MODIFYOK extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MODIFYOK() {
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
		response.setContentType("text/html; charset = euc-kr"); 
		
		String username = request.getParameter("username");
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
		String query = "UPDATE loginsystem SET username =? ,userpw =? ,userphone =? ,usergender=? WHERE userid = ?";
		
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("loginid");
		System.out.println(id);
		try {
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid ,upw);
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, username);
			pstmt.setString(2, userpw);
			pstmt.setString(3, phoneNumber);
			pstmt.setString(4, gender);
			pstmt.setString(5, id);
			pstmt.executeUpdate();
			
			session.setAttribute("userid", id);
			session.setAttribute("username", username);
			session.setAttribute("userpw", userpw);
			session.setAttribute("phoneNumber", phoneNumber);
			session.setAttribute("gender", gender);
			
			
			
			response.sendRedirect("MODIFYRESULT.jsp");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt !=null) {
				try {
					pstmt.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}if(conn != null) {
				try {
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}

}
