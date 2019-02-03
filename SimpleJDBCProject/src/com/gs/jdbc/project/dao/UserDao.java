package com.gs.jdbc.project.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.gs.jdbc.project.model.UserData;

public interface UserDao {
		public void save(UserData userData) throws SQLException;

		public ArrayList<UserData> findAll() throws SQLException;

		public UserData findById(long id) throws SQLException;
}
