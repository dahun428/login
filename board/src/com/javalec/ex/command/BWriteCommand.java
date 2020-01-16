package com.javalec.ex.command;


import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.dao.BDao;
import com.javelec.ex.dto.BDto;

public class BWriteCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
	
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		Timestamp bDate = new Timestamp(System.currentTimeMillis());
		
		
		BDto dtos = new BDto();
		
		dtos.setbName(bName);
		dtos.setbTitle(bTitle);
		dtos.setbContent(bContent);
		dtos.setbDate(bDate);
		BDao dao = new BDao();
		dao.write(bName, bTitle, bContent, bDate);
	
	}

}
