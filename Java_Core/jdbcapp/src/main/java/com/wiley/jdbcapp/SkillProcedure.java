package com.wiley.jdbcapp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;


public class SkillProcedure {

	public static void getCandidateSkills(int candidateId) {
		String query = "{call get_candidate_skill(?}";
		
		Connection conn = null;
		ResultSet rs = null;
		
		try {
			DBConnection dbcon = new DBConnection();
			conn = dbcon.createConnection();
			
			CallableStatement cstmt = conn.prepareCall(query);
			cstmt.setInt(1, candidateId);
			
			rs = cstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(
						String.format("%s - %s",
								rs.getString("first_name") + " "+rs.getString("last_name"),rs.getString("skill") 
								)
						);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getCandidateSkills(132);

	}

}
