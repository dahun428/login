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
		actionDo(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request,response);
		
		
		
	}
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html; charset=euc-kr");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String[] phone1 = request.getParameterValues("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String gender = request.getParameter("gender");
		
		
		
		//데이터베이스 초기설정값
		Connection con = null;
		PreparedStatement ptsmt = null;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/basepratice?serverTimezone=UTC";
		
		String uid = "root";
		String upw = "d1860429";
		//쿼리값
		String query = "INSERT INTO members (name, id, pw, phone1, phone2, phone3, gender) VALUES(?,?,?,?,?,?,?)";
		
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,uid,upw);
			ptsmt = con.prepareStatement(query);
			
			ptsmt.setString(1, name);
			ptsmt.setString(2, id);
			ptsmt.setString(3, pw);
			ptsmt.setString(4, Arrays.toString(phone1));
			ptsmt.setString(5, phone2);
			ptsmt.setString(6, phone3);
			ptsmt.setString(7, gender);
			
			//select -> executeQuery , insert,delete,update -> executeUpdate
			int i = ptsmt.executeUpdate();
			if(i==1) {
				System.out.println("insert success");
				response.sendRedirect("joinResult.jsp");
			}else {
				System.out.println("fail to insert");
				response.sendRedirect("join.html");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(ptsmt != null) ptsmt.close();
				if(con != null) con.close();
			}catch(Exception e) {}
		}
		
	}

}
