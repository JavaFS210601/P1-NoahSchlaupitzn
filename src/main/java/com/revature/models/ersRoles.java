package com.revature.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ers_user_roles")
public class ersRoles {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name = "ers_user_roles_id")
	private int roleId;
	
	@Column(name = "ers_user_roles")
	private String userRoles;

	@OneToMany(mappedBy="role_id", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<ersUsers> userList;
	
	
	//now making boilerplate code
	
	
	public ersRoles() {
		super();
		// TODO Auto-generated constructor stub
	}




	public ersRoles(int roleId, String userRoles) {
		super();
		this.roleId = roleId;
		this.userRoles = userRoles;
	}




	public ersRoles(String userRoles) {
		super();
		this.userRoles = userRoles;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + roleId;
		result = prime * result + ((userRoles == null) ? 0 : userRoles.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ersRoles other = (ersRoles) obj;
		if (roleId != other.roleId)
			return false;
		if (userRoles == null) {
			if (other.userRoles != null)
				return false;
		} else if (!userRoles.equals(other.userRoles))
			return false;
		return true;
	}




	public int getRoleId() {
		return roleId;
	}




	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}




	public String getUserRoles() {
		return userRoles;
	}




	public void setUserRoles(String userRoles) {
		this.userRoles = userRoles;
	}




	

}
