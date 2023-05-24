package com.wiley.jdbcapp;

public interface EmployeeDao{

	//create employee
	public void createEmployee(Employee emp);
	//show employees
	public void getAllemployees();
	//show employee by id
	public void getEmpById(int id);
	//update employee
	public void updateEmpById(int id,String name);
	//delete emp by id
	public void deleteEmpById(int id);
	//search employee by name if only some characters are inserted
	public void searchEmployee(String name);
	//ordering employee by salary asc
	public void orderEmpAsc();
	//ordering employee by salary asc
		public void orderEmpDesc();
}
