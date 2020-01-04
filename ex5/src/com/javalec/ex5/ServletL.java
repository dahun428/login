package com.javalec.ex5;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletL implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
System.out.println("contextDestroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
System.out.println("contextInitialized");
	}

}
