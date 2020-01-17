package com.javalec.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.dao.userDAO;
import com.javalec.dto.userDTO;

public class BjoinCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String userID = request.getParameter("userID");
		String userPW = request.getParameter("userPW");
		String userName = request.getParameter("userName");
		String userGender = request.getParameter("userGender");
		String userEmail = request.getParameter("userEmail");
		
		userDAO dao = userDAO.getInstance();
		userDTO dto = new userDTO();
		
		if(dao.confirmId(userID) == userDAO.MEMBER_EXISTENT) {
			
			request.setAttribute("joinCheck", userDAO.MEMBER_EXISTENT);
			System.out.println(userDAO.MEMBER_EXISTENT);
		}else {
			
			dto.setUserID(userID);
			dto.setUserPW(userPW);
			dto.setUserName(userName);
			dto.setUserGender(userGender);
			dto.setUserEmail(userEmail);
			dao.insert(dto);
			
			request.setAttribute("joinCheck", userDAO.MEMBER_NONEXISTENT);
			System.out.println(userDAO.MEMBER_NONEXISTENT);
		}
		
	}

}
