package com.revature.daos;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.TicketDTO;
import com.revature.models.ersTicket;
import com.revature.utils.HibernateUtil;

public class TicketDAO {

public static boolean insertTicket(ersTicket ticket) {
		
		Session ses = HibernateUtil.getSession();
		
		ses.save(ticket);
		
		HibernateUtil.closeSession();
		return false;
		
	}
	
	public void updateTicket(ersTicket ticket) {
		
		Session ses = HibernateUtil.getSession();
		
		ses.merge(ticket);
		
		HibernateUtil.closeSession();
		
	}
	
	public ersTicket selectTicketById(int id) {
		
		Session ses = HibernateUtil.getSession();
		
		ersTicket ticket = ses.get(ersTicket.class, id);
		
		HibernateUtil.closeSession();
		
		return ticket;
		
	}
	
	public List<ersTicket> findAllTickets(){
		
		Session ses = HibernateUtil.getSession();
		
		List<ersTicket> ticketList = ses.createQuery("FROM ersTicket").list();
		
		HibernateUtil.closeSession();
		
		return ticketList;
	}



	
	
	
	
}
