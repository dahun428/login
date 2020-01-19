package com.javalec.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.command.BCommand;
import com.javalec.command.BcontentCommand;
import com.javalec.command.BdeleteCommand;
import com.javalec.command.BjoinCommand;
import com.javalec.command.BjoinOutCommand;
import com.javalec.command.BlistCommand;
import com.javalec.command.BloginCommand;
import com.javalec.command.BmodifyCommand;
import com.javalec.command.BupdateCommand;
import com.javalec.command.BwriteCommand;
/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request, response);
	}
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("actionDo");
		request.setCharacterEncoding("UTF-8");
		
		String viewPage = null;
		BCommand command = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		if(com.equals("/login.do")) {
			command = new BloginCommand();
			command.execute(request, response);
			viewPage = "userCheck.jsp";
		}else if(com.equals("/join.do")) {
			command = new BjoinCommand();
			command.execute(request, response);
			viewPage = "joinCheck.jsp";
		}else if(com.equals("/delete.do")) {
			command = new BjoinOutCommand();
			command.execute(request, response);
			viewPage = "deleteCheck.jsp";
		}else if(com.equals("/update.do")) {
			command = new BupdateCommand();
			command.execute(request, response);
			viewPage = "updateCheck.jsp";
		}else if(com.equals("/write.do")) {
			command = new BwriteCommand();
			command.execute(request, response);
			viewPage = "list.do";
		}else if(com.equals("/list.do")) {
			command = new BlistCommand();
			command.execute(request, response);
			viewPage = "bbs.jsp";
		}else if(com.equals("/view.do")) {
			command = new BcontentCommand();
			command.execute(request, response);
			viewPage = "view.jsp";
		}else if(com.equals("/bbsModify.do")) {
			command = new BmodifyCommand();
			command.execute(request, response);
			viewPage = "/view.do";
		}else if(com.equals("/bbsDelete.do")) {
			command = new BdeleteCommand();
			command.execute(request, response);
			viewPage = "/list.do";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(viewPage);
		rd.forward(request, response);
	}

}
