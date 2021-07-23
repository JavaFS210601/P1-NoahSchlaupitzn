package com.revature.daos;

import org.hibernate.Session;

import com.revature.models.ersRoles;
import com.revature.utils.HibernateUtil;

public class RolesDAO {

public void insertRoles(ersRoles roles) {
		
		Session ses = HibernateUtil.getSession();
		
		ses.save(roles);
		
		HibernateUtil.closeSession();
		
	}
	
	
}
