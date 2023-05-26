package com.wiley.jdbcapp;

import java.sql.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class blobresume {

	public static void writeBlob(int candidateId,String fileName) throws SQLException, FileNotFoundException {
		 String query = "UPDATE candidates SET resume = ? WHERE id=?";
	        Connection conn = null;
	        PreparedStatement ps = null;
	        try  {
	        	conn = DBConnection.createConnection();
	        	ps = conn.prepareStatement(query);
	            File file = new File(fileName);
	            FileInputStream fname = new FileInputStream(file);


	            ps.setBinaryStream(1, fname);
	            ps.setInt(2, candidateId);

	            System.out.println("Added file in the database");
	            ps.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}
	
	public static void getBlobData(int candidateID, String filename) {
    	Connection conn = null;
    	ResultSet rs = null;
    	try {
    		String sql = "SELECT resume FROM candidates WHERE id = ?";
    		conn = DBConnection.createConnection();
    		PreparedStatement ps = conn.prepareStatement(sql);
    		ps.setInt(1, candidateID);
    		rs= ps.executeQuery();
    		File file = new File(filename);
    		FileOutputStream fout = new FileOutputStream(file);
    		
    		while(rs.next()) {
    			InputStream fin = rs.getBinaryStream("resume");
    			byte[] buffer = new byte[1024];
    			while(fin.read(buffer) > 0) {
    				fout.write(buffer);
    			}
    		}
    		System.out.println("File read");
    		
    	} catch(Exception e) {
    		e.printStackTrace();
    	}

    }
	
	public static void main(String[] args) throws FileNotFoundException, SQLException {
		// TODO Auto-generated method stub

		writeBlob(132,"C:\\Users\\Acer\\Documents\\Wiley Edge\\wiley_git_project\\Java_Core\\jdbcapp\\Docs\\Prajwal_Resume.pdf");
		getBlobData(133, "Prajwal_Resume.pdf");
	}

}
