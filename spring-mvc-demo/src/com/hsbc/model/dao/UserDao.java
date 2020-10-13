package com.hsbc.model.dao;

import com.hsbc.model.beans.User;

public interface UserDao {
	public String fetchUserById(int id);
	
	public User fetchUserByName(String name);
}
