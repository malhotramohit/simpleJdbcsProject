package com.gs.jdbc.project.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import com.gs.jdbc.project.model.UserData;
import com.gs.jdbc.project.util.DBManager;

public class UserDaoImpl implements UserDao {

	DBManager dbManager = DBManager.getInstance();

	@Override
	public void save(UserData userData) throws SQLException {
		String query = "INSERT INTO UserData(user_id,username,dateOfBirth)" + "VALUES (DEFAULT,?,?);";
		Connection con = null;
		PreparedStatement ps = null;
		Calendar cal = Calendar.getInstance();
		cal.setTime(userData.getDateOfBirth());

		try {
			con = dbManager.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, userData.getName());
			ps.setDate(2, new Date(cal.getTime().getTime()));
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ps.close();
			con.close();
		}
	}

	@Override
	public ArrayList<UserData> findAll() throws SQLException {
		String query = "select * from UserData";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<UserData> userList = new ArrayList<>(10);
		UserData userData = null;

		try {
			con = dbManager.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				userData = new UserData();
				userData.setId(rs.getLong(1));
				userData.setName(rs.getString(2));
				userData.setDateOfBirth(rs.getDate(3));
				userList.add(userData);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ps.close();
			con.close();
		}
		return userList;
	}

	@Override
	public UserData findById(long id) throws SQLException {
		String query = "select * from UserData where user_id = ?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		UserData userData = null;

		try {
			con = dbManager.getConnection();
			ps = con.prepareStatement(query);
			ps.setLong(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				userData = new UserData();
				userData.setId(rs.getLong(1));
				userData.setName(rs.getString(2));
				userData.setDateOfBirth(rs.getDate(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ps.close();
			con.close();
		}
		return userData;
	}

}
