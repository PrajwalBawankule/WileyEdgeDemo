package com.wiley.loanapplication;

public class User {
	private int  user_id;
	private String acc_number;
	private String name;
	private String mobile;
	private String address;
	private String gender;
	private String pancard;
	private String dob;
	private int account_type;
	
	public User(int user_id, String acc_number, String name, String mobile, String address, String gender,
			String pancard, String dob,int account_type) {
		
		this.user_id = user_id;
		this.acc_number = acc_number;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.gender = gender;
		this.pancard = pancard;
		this.dob = dob;
		this.account_type = account_type;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(String acc_number) {
		this.acc_number = acc_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getAccount_type() {
		return account_type;
	}
	public void setAccount_type(int account_type) {
		this.account_type = account_type;
	}
	
	

}
