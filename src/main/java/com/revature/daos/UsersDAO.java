package com.revature.daos;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.ersUsers;
import com.revature.utils.HibernateUtil;

public class UsersDAO {

	public void insertUser(ersUsers users) {
		
		Session ses = HibernateUtil.getSession();
		
		ses.save(users);
		
		HibernateUtil.closeSession();
		
	}
	
	public void updateUser(ersUsers users) {
		
		Session ses = HibernateUtil.getSession();
		
		ses.merge(users);
		
		HibernateUtil.closeSession();
		
	}
	
	public ersUsers selectUserById(int id) {
		
		Session ses = HibernateUtil.getSession();
		
		ersUsers users = ses.get(ersUsers.class, id);
		
		HibernateUtil.closeSession();
		
		return users;
		
	}
	
	public List<ersUsers> findAllUsers(){
		
		Session ses = HibernateUtil.getSession();
		
		List<ersUsers> userList = ses.createQuery("FROM ersUser").list();
		
		HibernateUtil.closeSession();
		
		return userList;
	}
	
	
	
}
