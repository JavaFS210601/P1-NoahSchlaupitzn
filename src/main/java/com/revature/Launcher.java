package com.revature;

import java.time.LocalDateTime;
import java.util.List;

import com.revature.daos.RolesDAO;
import com.revature.daos.StatusDAO;
import com.revature.daos.TicketDAO;
import com.revature.daos.TypeDAO;
import com.revature.daos.UsersDAO;
import com.revature.models.ersRoles;
import com.revature.models.ersStatus;
import com.revature.models.ersTicket;
import com.revature.models.ersType;
import com.revature.models.ersUsers;

public class Launcher {
	
	private static TicketDAO tiDAO = new TicketDAO();
	private static UsersDAO uDAO = new UsersDAO();
	private static TypeDAO tDAO = new TypeDAO();
	private static StatusDAO sDAO = new StatusDAO();
	private static RolesDAO rDAO = new RolesDAO();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating status objects
		ersStatus s1 = new ersStatus("approved");
		ersStatus s2 = new ersStatus("denied");
		ersStatus s3 = new ersStatus("pending");
		
		//creating type objects
		ersType t1 = new ersType("lodging");
		ersType t2 = new ersType("travel");
		ersType t3 = new ersType("food");
		ersType t4 = new ersType("other");
		
		//creating roles objects
		ersRoles r1 = new ersRoles("employees");
		ersRoles r2 = new ersRoles("finance manager");
		
		//creating user objects
		ersUsers u1 = new ersUsers("mlc", "sparkle", "megan", "c", "meganc@gmail.com", r2);
		ersUsers u2 = new ersUsers("nns", "quincy", "noah", "s", "noahs@gmail.com", r1);
		ersUsers u3 = new ersUsers("qjcs", "carrot", "quincy", "jcs", "karitlover@gmail.com", r1);
		
		//creating reimbursement objects
		ersTicket ti1 = new ersTicket(375, "expense", "receipt".getBytes(), t1, s1, u2, u1);
		ersTicket ti2 = new ersTicket(150, "expense", "receipt".getBytes(), t2, s2, u3, u1);
		ersTicket ti3 = new ersTicket(400, "expense", "receipt".getBytes(), t3, s1, u2, u1);
		ersTicket ti4 = new ersTicket(100, "expense", "receipt".getBytes(), t4, s3, u3, u1);
		
		//inserting  data
	//	tiDAO.insertTicket(ti1);
	//	tiDAO.insertTicket(ti2);
	//	tiDAO.insertTicket(ti3);
		//tiDAO.insertTicket(ti4);
		
		//uDAO.insertUser(u1);
		//uDAO.insertUser(u2);
		//uDAO.insertUser(u3);
		
			//tDAO.insertType(t1);
			//tDAO.insertType(t2);
			//tDAO.insertType(t3);
			//tDAO.insertType(t4);
			
			//sDAO.insertStatus(s1);
			//sDAO.insertStatus(s2);
			//sDAO.insertStatus(s3);
			
			//rDAO.insertRoles(r1);
			//rDAO.insertRoles(r2);
		
		
	}

}
