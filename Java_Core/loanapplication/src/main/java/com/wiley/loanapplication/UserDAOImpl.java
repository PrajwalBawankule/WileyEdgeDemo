package com.wiley.loanapplication;

import java.util.*;
import java.sql.*;

public class UserDAOImpl implements UserDAO{

	Connection con= null;

	public void addUser(User user) {
		con =  DBConnection.createConnection();
		String q = "INSERT INTO user (user_id,acc_number, name, mobile, address, gender, pan_number, dob, account_type_id)\r\n"
				+ "VALUES (?,?, ?, ?, ?, ?, ?, ?, ?);";

		try {
			PreparedStatement ps = con.prepareStatement(q);

			ps.setInt(1, user.getUser_id());
			ps.setString(2,user.getAcc_number());
			ps.setString(3, user.getName());
			ps.setString(4,user.getMobile());
			ps.setString(5,user.getAddress());
			ps.setString(6,user.getGender().toLowerCase());
			ps.setString(7,user.getPancard().toUpperCase());
			ps.setString(8,user.getDob());
			ps.setInt(9,user.getAccount_type());

			int count = ps.executeUpdate();
			if(count != 0) {
				System.out.println("New User added successfully !!!!!!");
			}
			ps.close();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//		

	}

	
	public void loginUser(String acc_number, String name) {
		con =  DBConnection.createConnection();
		String q = "SELECT * FROM user where acc_number LIKE "+acc_number;

		try {
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(q);


			if(rs.next())
			{
				System.out.println("Login SuccessFull");
			}
			
			else
				System.out.println("Invalid input");
			
			st.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}		
 }
}
