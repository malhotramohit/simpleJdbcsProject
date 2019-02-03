package com.gs.jdbc.project;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.gs.jdbc.project.model.UserData;
import com.gs.jdbc.project.service.UserService;
import com.gs.jdbc.project.service.UserServiceImpl;

public class TestSimpleJDBCClass {

	public static void main(String[] args) {

		UserService userService = new UserServiceImpl();
		UserData user1 = new UserData("Mohit", new Date());
		UserData user2 = new UserData("Rohit", new Date());
		UserData user3 = new UserData("Amit", new Date());

		try {
			userService.save(user1);
			userService.save(user2);
			userService.save(user3);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ArrayList<UserData> userList = null;
		try {
			userList = userService.findAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (UserData userData : userList) {
			System.out.println(userData);
		}

		System.out.println("Find data for the user with id 8");
		try {
			UserData user = userService.findById(8);
			System.out.println(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
