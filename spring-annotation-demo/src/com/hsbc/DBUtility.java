package com.hsbc;

public class DBUtility {
	private String username;
	private String password;
	public DBUtility() {
		System.out.println("DBUtility() created");
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void getConnection() {
		System.out.println("getConnection() inside DBUtility");
	}
}
