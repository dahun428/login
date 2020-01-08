package com.javalec.ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class JOINOUT
 */
@WebServlet("/JOINOUT")
public class JOINOUT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JOINOUT() {
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
		
		String joinoutpw = request.getParameter("joinoutpw");
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("loginid");
		
		Connection conn = null;
		PreparedStatement pstmtSelect = null;
		PreparedStatement pstmtDelete = null;
		ResultSet rs = null;
		
		server_join server = new server_join();
		String driver = server.driver();
		String url = server.url("basepratice");
		String uid = server.uid();
		String upw = server.upw();
		
		String selectQuery = "SELECT userpw FROM loginsystem WHERE userid = ?";
		String deleteQuery = "DELETE FROM loginsystem WHERE userid = ?";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, upw);
			pstmtSelect = conn.prepareStatement(selectQuery);
			pstmtDelete = conn.prepareStatement(deleteQuery);
			
			pstmtSelect.setString(1, id);
			rs = pstmtSelect.executeQuery();
			
			
			if(rs.next()) {
				if(rs.getString(1).equals(joinoutpw)) {
					pstmtDelete.setString(1, id);
					pstmtDelete.executeUpdate();
					response.sendRedirect(location);
					System.out.println("삭제되었습니다.");
				}else {
					System.out.println("삭제실패!");
				}
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmtSelect != null) {
				try {
					pstmtSelect.close();			
				}catch(Exception e) {}
				
			}if(conn != null) {
				try {
					conn.close();
			}catch(Exception e) {}
			
			
			}
		}
	}
}
