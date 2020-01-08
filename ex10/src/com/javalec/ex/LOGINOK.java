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
		
		//�α��� form �� �Ķ���� �ҷ�����
		String loginid = request.getParameter("user_id");
		String loginpw = request.getParameter("user_pw");
		
		//�����ͺ��̽� ����
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet =null;


		//server_join �ڹ� �ҷ��ͼ�, ���� ��ü ���� ����
		server_join server = new server_join();
		String driver = server.driver();
		String url = server.url("basepratice");
		String uid = server.uid();
		String upw = server.upw();
		//query ���� preparedstatement ��ü ����Ͽ�, ��ü������ mysql ��ɾ� ���
		String query = "SELECT userpw FROM loginsystem WHERE userid = ?";

		//�α��� ������ , ���н� �̵��� sendRedirect page �� �⺻ ����
		String page ="";
		//java���� �̿��� �� �ִ� session �� �����Ͽ�, ����ϱ�
		HttpSession session = request.getSession();
		//try&catch�� ����Ͽ� ������ �ҷ�����, ������ ���� ���
		try {
		//database �������� ����	
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, upw);
			
		//preparedstatement = pstmt , query = mysql ��ɾ�, conn = ������ ����	
			pstmt = conn.prepareStatement(query);
		//preparedstatement query '?'�� loginid (form doPost ��)�� ȣ��	
			pstmt.setString(1, loginid);
		//preparedstatement executeQuery�� ȣ���Ͽ� resultSet ������ ��´�. �̶�, resultSet�� ResultSet ��ü�� ȣ���Ͽ�,
		//next() �� ����� �� �ְ� �Ѵ�.
			resultSet = pstmt.executeQuery();

		//	result.next()�� ȣ���Ͽ�, �����ͺ��̽��� ��ü������ �ȴ´�.
			if(resultSet.next()) {
		//getString �� ���ؼ� �����ͺ��̽����� ���� ��������, �̶� '1' �� loginid�� ����Ű�� ������ �� ���� userpw ���� loginid�� userpw ���� �ȴ�.
		//mysql �������� �ش�� ����. SELECT userpw FROM loginsystem WHERE userid = 'dahun429'(userid);
				if(resultSet.getString(1).equals(loginpw)) {
					page = "LOGINRESULT.jsp";
		//�ش系���� httpsession�� session ��ü�� �ҷ��Դ� session.setAttribute ������ �����Ͽ� ���Ŀ� �ٸ� ���������� getAttribute�� ����
		//�ҷ��� �� �ֵ��� ���� ����.
					session.setAttribute("loginid", loginid);
					
					response.sendRedirect(page);
				}else {
					page= "LOGINERROR.jsp";
					response.sendRedirect(page);
				}
				
				
			}
			
			
			
//			while(resultSet.next()) {
//				String userid = resultSet.getString("userid");
//				String userpw = resultSet.getString("userpw");
//				
//				if((userid.equals(loginid)) && (userpw.equals(loginpw))) {
//					page = "LOGINRESULT.jsp";
//					session.setAttribute("userid", userid);
//					response.sendRedirect(page);
//					
////					HttpSession session = request.getSession();
////				    String username = (String)request.getAttribute("un");
////				    session.setAttribute("UserName", username);
//					
//					
////					System.out.println("�α��εǾ����ϴ�.");
//					System.out.println(userid);
//					System.out.println(loginid);
////					break;
//				}else {
//					page= "LOGINERROR.jsp";
//					response.sendRedirect(page);
////					System.out.println("���� ���̵��Դϴ�.");
//					System.out.println(userid);
//					System.out.println(loginid);
////					break;
//				}
			
			
					
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
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
			
		
	}
	
}
