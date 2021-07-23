package com.revature.services;

public class LoginService {

	public int login(String username, String password, int id) {
		
		int id1 = 1;
		int id2 = 2;
		
		//make this employee log in, don't worry about making all employees logins
		if(username.equals("nns") && password.equals("quincy") && id == id1) {
			return id;
		}
		
		//make this finance manager log in, (only have one FM)
		if(username.equals("mlc") && password.equals("sparkle") && id == id2) {
			return id;
		}
		
		return 0;
		
	}
}
