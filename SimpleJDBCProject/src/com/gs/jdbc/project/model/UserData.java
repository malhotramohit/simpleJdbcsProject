package com.gs.jdbc.project.model;

import java.util.Date;

public class UserData {
	
	private long id;
	private String name;
	private Date  dateOfBirth;
	
	
	
	
	public UserData(String name, Date dateOfBirth) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}


	public UserData() {
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	@Override
	public String toString() {
		return "UserData [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	

}
