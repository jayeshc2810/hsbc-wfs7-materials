package com.hsbc.model.service;

import com.hsbc.model.beans.User;

public interface UserService {
	public String fetchUser(int id);
	public User fetchUser(String name);
}
