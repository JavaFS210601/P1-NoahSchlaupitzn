package com.revature;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;

import com.revature.services.LoginService;

public class Tests {
	//this is a placeholder test class - feel free to delete or rename it

	LoginService ls = new LoginService();
	
	@BeforeAll 
    public static void init() {
        System.out.println("In BeforeAll");

        Tests serviceTest = new Tests();
    }
	
	@Test
	public void testValidLoginEmployee() {
		// TODO Auto-generated method stub
		System.out.println("testing valid login");
		
		assertEquals(1,ls.login("nns", "quincy", 1));
	}
	
	@Test
	public void testValidLoginManager() {
		// TODO Auto-generated method stub
		System.out.println("testing valid login");
		
		assertEquals(2,ls.login("mlc", "sparkle", 2));
	}
	
	
	
	
	
	
	
	
	
	
}
