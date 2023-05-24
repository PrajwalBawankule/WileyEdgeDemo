package com.wiley.jdbcapp;

import java.sql.*;

public class EmployeeDaoImpl implements EmployeeDao {

	Connection conn;

	@Override
	public void createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		conn = DBConnection.createConnection();
		String query = "Insert into employee values(?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			ps.setInt(4, emp.getAge());
			int count = ps.executeUpdate();
			if (count != 0) {
				System.out.println("Employee inserted successfully.....");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void getAllemployees() {
		// TODO Auto-generated method stub
		conn = DBConnection.createConnection();
		String query = "SELECT * FROM employee";

		System.out.println("---------------------");
		System.out.format("%s\t%s\t%s\t%s\t", "ID", "Name", "Salary", "Age");
		System.out.println("\n---------------------");

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\t", rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
				System.out.println("\n--------------------");

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@Override
	public void getEmpById(int id) {
		// TODO Auto-generated method stub
		Connection conn = DBConnection.createConnection();
		String query = "SELECT * from Employee where id =" + id;

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\t", rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void updateEmpById(int id, String name) {
		// TODO Auto-generated method stub

		conn = DBConnection.createConnection();
		String query = "Update employee set name=? where id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setInt(2, id);

			int count = ps.executeUpdate();

			if (count != 0) {
				System.out.println("Employee details updated successfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmpById(int id) {
		// TODO Auto-generated method stub
		conn = DBConnection.createConnection();
		String query = "Delete from employee where id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			int count = ps.executeUpdate();
			if (count != 0) {
				System.out.println("Employee deleted sucessfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void searchEmployee(String name) {
		// TODO Auto-generated method stub

		String n = '"'+name+'%'+'"';
		Connection conn = DBConnection.createConnection();
		String query = "SELECT * from Employee where name like "+n;

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\t\n", rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void orderEmpAsc() {
		// TODO Auto-generated method stub
		conn = DBConnection.createConnection();
		String query = "Select * from employee order by salary";

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\t\n", rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void orderEmpDesc() {
		// TODO Auto-generated method stub
		conn = DBConnection.createConnection();
		String query = "Select * from employee order by salary desc";

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\t\n", rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
