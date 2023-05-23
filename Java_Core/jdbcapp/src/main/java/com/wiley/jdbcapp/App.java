package com.wiley.jdbcapp;

import java.sql.DriverManager;
import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        try {
        	String driver = "com.mysql.cj.jdbc.Driver";
        	String url = "jdbc:mysql://localhost:3306/WileyEdge";
        	String username = "root";
        	String password = "Prajwal123";
        	
        	Class.forName(driver);
        	
        	Connection conn = DriverManager.getConnection(url,username,password);
        	System.out.println("Conn success");
        }catch(Exception e){
        	e.printStackTrace();
        }
        System.out.println("Hi");
    }
}
