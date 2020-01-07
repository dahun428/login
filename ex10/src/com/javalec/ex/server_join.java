package com.javalec.ex;

public class server_join {

	String driver , url , uid, upw;
	
	
	public String driver() {
		return "com.mysql.cj.jdbc.Driver";
		
	}
	public String url(String url) {
		this.url = url;
		return "jdbc:mysql://localhost:3306/"+url+"?serverTimezone=UTC";
	}
	public String uid() {
		return "root";
	}
	public String upw() {
		return "d1860429";
	}
}
