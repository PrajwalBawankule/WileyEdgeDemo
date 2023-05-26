package com.wiley.loanapplication;

public interface UserDAO {
	public void addUser(User user);
	public void loginUser(String account_number, String name);
}
