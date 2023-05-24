package com.wiley.jdbcapp;

import java.sql.*;

public class genericQueries {

	static final String DB_URL = "jdbc:mysql://localhost:3306/";
    static final String USER = "root";
    static final String PASS = "Prajwal123";

    public static void main(String[] args) {
        Connection conn;
        Statement stmt;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            // Execute create database query
            System.out.println("Creating database...");
            stmt = conn.createStatement();
            String sql = "CREATE DATABASE db";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");

            // Execute use database query
            sql = "USE db";
            stmt.executeUpdate(sql);
            System.out.println("Using database db...");

            // Execute create table query
            System.out.println("Creating table...");
            sql = "CREATE TABLE emp (id INT, name VARCHAR(50), age INT, PRIMARY KEY (id))";
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully...");

            // Execute drop table query
            System.out.println("Dropping table...");
            sql = "DROP TABLE emp";
            stmt.executeUpdate(sql);
            System.out.println("Table dropped successfully...");

            // Execute drop database query
            System.out.println("Dropping database...");
            sql = "DROP DATABASE db";
            stmt.executeUpdate(sql);
            System.out.println("Database dropped successfully...");

            stmt.close();
            conn.close();
            
        } catch(SQLException e){
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
	}
}

	 
	 
