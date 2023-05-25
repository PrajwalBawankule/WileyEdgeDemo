package com.wiley.jdbcapp;
import java.sql.*;

public class BatchProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
        	DBConnection db = new DBConnection();
        	Connection conn = db.createConnection();
        	
        	conn.setAutoCommit(false);
        	Statement stmt = conn.createStatement();
        	
        	//stmt.addBatch("select * from employee");
        	stmt.addBatch("select * from candidates");
        	stmt.executeBatch();
        	
        	conn.rollback();
        	conn.commit();
        	
        	try {
        		stmt.close();
        	}
        	catch(SQLException sqe) {
        		sqe.printStackTrace();
        	}
        }catch(Exception e) {
        	e.printStackTrace();
        	
        }
		
	}

}
