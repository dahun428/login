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
		
		//로그인 form 값 파라미터 불러오기
		String loginid = request.getParameter("user_id");
		String loginpw = request.getParameter("user_pw");
		
		//데이터베이스 접근
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet =null;


		//server_join 자바 불러와서, 서버 객체 각각 접근
		server_join server = new server_join();
		String driver = server.driver();
		String url = server.url("basepratice");
		String uid = server.uid();
		String upw = server.upw();
		//query 값은 preparedstatement 객체 사용하여, 구체적으로 mysql 명령어 명시
		String query = "SELECT userpw FROM loginsystem WHERE userid = ?";

		//로그인 성공시 , 실패시 이동할 sendRedirect page 값 기본 설정
		String page ="";
		//java에서 이용할 수 있는 session 값 선언하여, 사용하기
		HttpSession session = request.getSession();
		//try&catch문 사용하여 데이터 불러오기, 데이터 종료 명시
		try {
		//database 본격적인 접근	
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, upw);
			
		//preparedstatement = pstmt , query = mysql 명령어, conn = 데이터 접근	
			pstmt = conn.prepareStatement(query);
		//preparedstatement query '?'에 loginid (form doPost 값)을 호출	
			pstmt.setString(1, loginid);
		//preparedstatement executeQuery를 호출하여 resultSet 변수에 담는다. 이때, resultSet는 ResultSet 객체를 호출하여,
		//next() 를 사용할 수 있게 한다.
			resultSet = pstmt.executeQuery();

		//	result.next()를 호출하여, 데이터베이스를 전체적으로 훑는다.
			if(resultSet.next()) {
		//getString 을 통해서 데이터베이스에서 값을 가져오고, 이때 '1' 은 loginid를 가리키기 때문에 이 값의 userpw 값은 loginid의 userpw 값이 된다.
		//mysql 쿼리문은 해당과 같다. SELECT userpw FROM loginsystem WHERE userid = 'dahun429'(userid);
				if(resultSet.getString(1).equals(loginpw)) {
					page = "LOGINRESULT.jsp";
		//해당내용을 httpsession의 session 객체에 불러왔던 session.setAttribute 값으로 저장하여 이후에 다른 페이지에서 getAttribute를 통해
		//불러올 수 있도록 값을 저장.
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
////					System.out.println("로그인되었습니다.");
//					System.out.println(userid);
//					System.out.println(loginid);
////					break;
//				}else {
//					page= "LOGINERROR.jsp";
//					response.sendRedirect(page);
////					System.out.println("없는 아이디입니다.");
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
