package com.coderscampus.assignment3;

public class User {
	
	private String username;
	private String password;
	private String name;

	public User(String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}

	public User(String[] String) {
		username = String[0];
		password = String[1];
		name = String[2];
	}
}
