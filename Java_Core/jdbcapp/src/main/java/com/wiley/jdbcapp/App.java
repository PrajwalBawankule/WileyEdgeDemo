package com.wiley.jdbcapp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;
import java.sql.Date;

//CREATE TABLE employee (
//id INT NOT NULL,
//name VARCHAR(45) NULL,
//salary DOUBLE NULL,
//age INT NULL,
//PRIMARY KEY (id));

public class App 
{
	public static void addcandidate(String firstName,String lastName,Date dob,String email,String phone,int[] skills) {
		
		  Connection con = null;
	        PreparedStatement ps = null;
	        PreparedStatement psSkills = null;
	        ResultSet rs  = null;
	        try {
	           DBConnection dbcon  = new DBConnection();
	           con = dbcon.createConnection();

	           String sqlInsert = "Insert into candidates values(first_name,last_name,dob,phone,email)values(?,?,?,?,?)";
	con.setAutoCommit(false);
	           ps = con.prepareStatement(sqlInsert,Statement.RETURN_GENERATED_KEYS);
	           ps.setString(1,firstName);
	           ps.setString(2,lastName);
	           ps.setDate(3,dob);
	           ps.setString(4,phone);
	           ps.setString(5,email);
	           int rowsAffected  = ps.executeUpdate();
	           rs = ps.getGeneratedKeys();

	            System.out.println("generated keys" + rs);
	            int candidateId = 0;
	            if(rs.next()){
	                candidateId = rs.getInt(1);
	                System.out.println("Candidate Id: "+candidateId);

	            }
	            if(rowsAffected==1){
	                String sqlSkillInsert =  "Insert into candidate_skills(candidate_id,skill_id)values(?,?)";
	                psSkills = con.prepareStatement(sqlSkillInsert);


	                for(int skillId:skills){
	                    psSkills.setInt(1,candidateId);
	                    psSkills.setInt(2,skillId);
	                    psSkills.executeUpdate();
	                }
	                con.commit();
	            }else {
	                System.out.println("Roll back done");
	                con.rollback();
	            }
	        }catch (Exception e){
	try{
	    if(con!=null)con.rollback();
	}catch (SQLException e2){
	    System.out.println(e2.getMessage());
	}
	        }
	        finally{
	            try{
	                if(rs!=null)rs.close();
	                if(ps!=null)ps.close();
	                if(psSkills!=null)psSkills.close();
	            }
	            catch (SQLException e){
	                System.out.println(e.getMessage());
	            }
	        }

	}
    public static void main( String[] args )
    {
    	int skills[] = {1,2,3};

    	addcandidate("Prajwal","Bawankule",Date.valueOf("1920-01-20"),"prajwalbawankule19@gmail.com","99440293029",skills);

//        EmployeeDaoImpl edi = new EmployeeDaoImpl();
//        
//        Scanner sc = new Scanner(System.in);
//        
//        do {
//        	System.out.println("1.Add Employee\n2.Show All Employees\n3.Show Employee based on ID\n4.Update Employee\n5.Delete Employee\n6.Order employee by salary(asc)\n7.Order Employee by salary(desc)\n8.Search employee by first 2 characters of name");
//        	System.out.println("Enter your choice : ");
//        	int ch = sc.nextInt();
//        	if(ch==1) {
//        		System.out.print("Enter employee id : ");
//        		int id = sc.nextInt();sc.nextLine();
//        		System.out.println("Enter employee name : ");
//        		String name = sc.nextLine();
//        		System.out.println("Enter employee salary : ");
//        		double salary = sc.nextDouble();sc.nextLine();
//        		System.out.println("Enter employee age : ");
//        		int age = sc.nextInt();sc.nextLine();
//        		
//        		Employee emp = new Employee(id,name,salary,age);
//        		edi.createEmployee(emp);
//        	}
//        	else if(ch==2) {
//        		System.out.println("Employees are : ");
//        		edi.getAllemployees();
//        	}
//        	else if(ch==3) {
//        		System.out.println("Enter the id of employee to display : " );
//        		int id = sc.nextInt();
//        		edi.getEmpById(id);
//        	}
//        	else if(ch==4) {
//        		System.out.println("enter the id of employee to update name : ");
//        		int id = sc.nextInt();sc.nextLine();
//        		System.out.println("Enter the new name to update : ");
//        		String name = sc.nextLine();
//        		edi.updateEmpById(id, name);
//        	}
//        	else if(ch==5) {
//        		System.out.println("Enter the id of employee to delete : ");
//        		int id = sc.nextInt();sc.nextLine();
//        		edi.deleteEmpById(id);
//        	}
//        	else if(ch==6) {
//        		edi.orderEmpAsc();
//        	}
//        	else if(ch==7) {
//        		edi.orderEmpDesc();
//        	}
//        	else if(ch==8) {
//        		System.out.println("Enter the employee name to search from starting characters : ");
//        		String nam = sc.next();
//        		edi.searchEmployee(nam);	
//        	}
//        	else {
//        		break;
//        	}
//        }while(true);
        
        
        
        
        
//    	try {
//        	DBConnection db = new DBConnection();
//        	Connection conn = db.createConnection();
//        	
//        	Statement stmt = conn.createStatement();
//        	String sql = "Select first_name,last_name,email From candidates limit 5";
//        	stmt.execute("use wileyjdbc");
//        	ResultSet rs = stmt.executeQuery(sql);
//        	
//        	while(rs.next()) {
//        		System.out.println(rs.getString("first_name")+"\t"+rs.getString("last_name")+"\t"+rs.getString("email"));
//        	}
//        	
//        	try {
//        		rs.close();
//        		stmt.close();
//        	}
//        	catch(SQLException sqe) {
//        		sqe.printStackTrace();
//        	}
//        }catch(Exception e) {
//        	e.printStackTrace();
//        	
//        }

    	
    }
}