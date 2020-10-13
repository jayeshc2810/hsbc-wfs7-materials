package com.hsbc.springbootapp.model.beans;

import java.time.LocalDate;

public class User {
	private String name;
	private LocalDate dob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
}
