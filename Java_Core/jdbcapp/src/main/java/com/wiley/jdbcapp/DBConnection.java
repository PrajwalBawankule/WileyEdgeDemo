package com.wiley.jdbcapp;
// DBConnection.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
		static Connection conn;
		public static Connection createConnection() {
			
			try {
				String driver = "com.mysql.cj.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/wileyjdbc";
				String username = "root";
				String password = "Prajwal123";
				Class.forName(driver);
				conn = DriverManager.getConnection(url,username,password);
				System.out.println("Connection Sucessful");
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return conn;
	}
}