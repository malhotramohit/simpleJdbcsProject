package com.gs.jdbc.project.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.gs.jdbc.project.dao.UserDao;
import com.gs.jdbc.project.dao.UserDaoImpl;
import com.gs.jdbc.project.model.UserData;

public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();

	@Override
	public void save(UserData userData) throws SQLException {
		userDao.save(userData);
	}

	@Override
	public ArrayList<UserData> findAll() throws SQLException {
		return userDao.findAll();
	}

	@Override
	public UserData findById(long id) throws SQLException {
		return userDao.findById(id);
	}

}
