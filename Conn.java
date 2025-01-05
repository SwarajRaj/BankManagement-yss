package bank_management_system;

import java.sql.*;

public class Conn {
	
//	public static final String URL = "jdbc:mysql://localhost:3306/ bankmanagementsystem";
//	public static final String USER_NAME = "root";
//	public static final String PASSWORD = "root";
	
	
	Connection c  ;
	Statement s;

	public Conn() {
		
		try {
			
			//Class.forName("com.mysql.cj.jdbc.Driver");
		    c = DriverManager.getConnection("jdbc:mysql:/// bankmanagementsystem","root", "root");
		    s = c.createStatement();

			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}

/*

Register driver
create connection
create statement
execute query
close connection

*/