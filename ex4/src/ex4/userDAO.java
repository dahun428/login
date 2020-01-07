package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class userDAO {

	 private static Connection getMysqlConnection() {
		 Connection conn = null;
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			String url ="jdbc:mysql://localhost:3306/jsp_pratice";
			String user = "root";
			String password = "d1860429";
			
			conn = DriverManager.getConnection(url, user, password);
			
			 
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		 return conn;
	 }
}
