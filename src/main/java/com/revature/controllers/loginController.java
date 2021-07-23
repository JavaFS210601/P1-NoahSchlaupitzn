package com.revature.controllers;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.LoginDTO;
import com.revature.services.LoginService;

public class loginController {

	ObjectMapper om = new ObjectMapper(); 
	private LoginService ls = new LoginService();
	
	public void login(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		System.out.println("hello");
		
		if(req.getMethod().equals("POST")) { 
			
			BufferedReader reader = req.getReader(); 
			
			StringBuilder sb = new StringBuilder(); 
			
			String line = reader.readLine(); 
			
			while(line != null) { 
				
				sb.append(line); 
				line = reader.readLine(); 
			}
			
			
			String body = new String(sb); 
			
			LoginDTO lDTO = om.readValue(body, LoginDTO.class); 
			
			if(ls.login(lDTO.username, lDTO.password, lDTO.id) !=0) { 
				
				String loginView = "http://127.0.0.1:5500/html/index.html";
				String managerView = "http://127.0.0.1:5500/html/manager.html";
				String employeeView = "http://127.0.0.1:5500/html/employee.html";
				
				HttpSession ses = req.getSession(); 
				
				ses.setAttribute("user", lDTO); 
				ses.setAttribute("loggedin", true);
				
		
				res.setStatus(200); 
				res.getWriter().print("Hi Login was successful"); 
				
				//can else if function for ids 1 and 2???
				
				if(lDTO.id == 1) {
					//functionality to direct to employee view
					
					res.sendRedirect(employeeView);
					
					
				}else if(lDTO.id == 2) {
					//functionality to direct to manager view
					
					res.sendRedirect(managerView);
					
				}
					
			} else {
				HttpSession ses = req.getSession(false); 
				
				if(ses != null) { 
					ses.invalidate(); 
				}
				
				res.setStatus(401); 
				res.getWriter().print("Login Invalidated"); 
					
			}
			
		}
		
	}

}
	

