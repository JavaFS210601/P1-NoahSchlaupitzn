package com.revature.daos;

import org.hibernate.Session;

import com.revature.models.ersStatus;
import com.revature.utils.HibernateUtil;

public class StatusDAO {

public void insertStatus(ersStatus status) {
		
		Session ses = HibernateUtil.getSession();
		
		ses.save(status);
		
		HibernateUtil.closeSession();
		
	}
}
