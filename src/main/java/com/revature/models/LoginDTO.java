package com.revature.models;

public class LoginDTO {

	//loginDTO is going to store the username and password sent by the user
	
	public String username;
	public String password;
	public int id;
	
	
	//using two constructors to instantiate loginDTO objects
	
	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LoginDTO(String username, String password, int id) {
		super();
		this.username = username;
		this.password = password;
		this.id = id;
	}
	
	
	
	
}
