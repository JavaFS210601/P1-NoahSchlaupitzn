package com.revature.services;

import java.util.List;

import org.hibernate.Session;

import com.revature.daos.TicketDAO;
import com.revature.models.TicketDTO;
import com.revature.models.ersTicket;
import com.revature.utils.HibernateUtil;

	public class TicketService {
	
		TicketDAO tDAO = new TicketDAO();
	
		public List<ersTicket> findAllTickets(){
		return tDAO.findAllTickets();
	}
	


	/*public void insertTickets(ersTicket ticket) {
	
		tDAO.insertTicket(ticket);
	}*/



	public static boolean makeNewTicket(ersTicket tDTO) {
		// TODO Auto-generated method stub
		if(TicketDAO.insertTicket(tDTO)) {
			return true;
		}
		
		return false;
	}

}
