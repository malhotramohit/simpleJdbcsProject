package com.gs.jdbc.project.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.gs.jdbc.project.model.UserData;

public interface UserService {
	
	public void save(UserData userData) throws SQLException;

	public ArrayList<UserData> findAll() throws SQLException;

	public UserData findById(long id) throws SQLException;

}
