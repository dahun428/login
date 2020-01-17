package com.javalec.command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.dao.userDAO;

public class BloginCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String userID = request.getParameter("userID");
		String userPW = request.getParameter("userPW");
		
		userDAO dao = new userDAO();
		
		int checkNum = dao.userCheck(userID, userPW);
		request.setAttribute("userCheck", checkNum);
		if(checkNum == userDAO.MEMBER_LOGIN_IS_NOT) {
			request.setAttribute("userCheck", userDAO.MEMBER_LOGIN_IS_NOT);
		}else if(checkNum == userDAO.MEMBER_LOGIN_PW_NO_GOOD) {
			request.setAttribute("userCheck", userDAO.MEMBER_LOGIN_PW_NO_GOOD);
		}else {
			request.setAttribute("userCheck", userDAO.MEMBER_LOGIN_SUCCESS);
			request.setAttribute("userID", userID);
		}
	}

}
