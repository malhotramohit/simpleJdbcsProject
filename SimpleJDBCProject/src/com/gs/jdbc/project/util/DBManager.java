package com.gs.jdbc.project.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	private static volatile DBManager dbUtil;
	private DBManager() {
	}
	public static DBManager getInstance() {
		if(null==dbUtil)
		{
			synchronized (DBManager.class) {
				dbUtil=new DBManager();
			}
		}
		return dbUtil;
	}
	private  String driver="org.postgresql.Driver";
	private String userName="postgres";
	private String password="gh1pv376";
	
	public Connection getConnection() throws SQLException
	{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return DriverManager.getConnection("jdbc:postgresql://localhost:5432/hibernatedb",userName,password);
		
	}
	
	
}
