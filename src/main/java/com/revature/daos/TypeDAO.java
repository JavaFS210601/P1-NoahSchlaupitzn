package com.revature.daos;

import org.hibernate.Session;

import com.revature.models.ersType;
import com.revature.utils.HibernateUtil;

public class TypeDAO {

public void insertType(ersType type) {
		
		Session ses = HibernateUtil.getSession();
		
		ses.save(type);
		
		HibernateUtil.closeSession();
		
	}
}
