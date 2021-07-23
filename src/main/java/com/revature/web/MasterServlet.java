package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.controllers.loginController;
import com.revature.controllers.ticketController;

public class MasterServlet extends HttpServlet{

	private loginController LC = new loginController();
	private ticketController TC = new ticketController();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("application/json");
		
		res.setStatus(404);
		
		String URI = req.getRequestURI().replace("/P1-NoahSchlaupitzn/", "");
		
		switch(URI) {
		
		case "login":
			
			LC.login(req, res);
			break;
		
			
			
		case "printAllTickets":
			
			System.out.println("print tickets");
			
			TC.getAllTickets(req, res);
			break;
			
		case "makeTicket":
			//add functionality into 
			System.out.println("making tickets");
			TC.makeNewTicket(req, res);
			break;
			
		
		}
		
		
		
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
		
	}
	
	
}
