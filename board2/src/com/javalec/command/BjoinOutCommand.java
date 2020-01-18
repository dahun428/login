package com.javalec.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.dao.userDAO;

public class BjoinOutCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String userID = request.getParameter("userID");
		String userPW = request.getParameter("userPW");
		String userPW_chk = request.getParameter("userPW_check");
		
		userDAO dao = new userDAO();
		
		int checkNum = dao.userCheck(userID, userPW);
		
		if(checkNum == userDAO.MEMBER_LOGIN_IS_NOT) {
			request.setAttribute("usercheck", userDAO.MEMBER_LOGIN_IS_NOT);
		}else if(checkNum == userDAO.MEMBER_LOGIN_PW_NO_GOOD) {
			request.setAttribute("usercheck", userDAO.MEMBER_LOGIN_PW_NO_GOOD);
		
		}else if(!(userPW.equals(userPW_chk))) {
			request.setAttribute("usercheck", userDAO.MEMBER_LOGIN_PW_NO_GOOD);
				
		}else {
			request.setAttribute("usercheck", userDAO.MEMBER_LOGIN_SUCCESS);
			dao.delete(userID);
		}
	}

}
