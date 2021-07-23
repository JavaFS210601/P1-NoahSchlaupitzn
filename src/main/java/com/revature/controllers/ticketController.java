package com.revature.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.TicketDTO;
import com.revature.models.ersTicket;
import com.revature.services.TicketService;

public class ticketController {

	private ObjectMapper om = new ObjectMapper();
	private TicketService TS = new TicketService();
	
	
	public void getAllTickets(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub

	        
	            List<ersTicket> ticketList = TS.findAllTickets();

	            String data = null;

	            data = om.writeValueAsString(ticketList);


	            response.getWriter().print(data);
	            response.setStatus(200);
	       
	}
	
	public void makeNewTicket(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		if(request.getMethod().equals("POST")) {
			
			BufferedReader BR = request.getReader();
			StringBuilder SB = new StringBuilder();
			String line = BR.readLine();
			
			while(line !=null) {
				SB.append(line);
				line = BR.readLine();
			}
			
			String s = new String(SB);
			
			TicketDTO tDTO = om.readValue(s, TicketDTO.class);
			
			if(TicketService.makeNewTicket(tDTO)) {
				response.setStatus(200);
			}
			else {
				response.setStatus(500);
			}
			
			
		}

	}

	
	
	
	
}
