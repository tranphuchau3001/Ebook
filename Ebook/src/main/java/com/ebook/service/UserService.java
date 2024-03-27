package com.ebook.service;

import java.util.List;

import com.ebook.dao.UserDAO;
import com.ebook.model.User;

public class UserService {

	private UserDAO dao = new UserDAO();

	public User doLogin(String username, String password) {
		return dao.doLogin(username, password);
	}

	public List<User> getAllUsers() {
		return dao.getAllUsers();
	}

}
