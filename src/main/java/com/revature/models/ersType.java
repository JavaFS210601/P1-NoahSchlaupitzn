package com.revature.models;

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
@Table(name = "ers_types")
public class ersType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name = "ers_types_id")
	private int typeId;
	
	@Column(name = "ers_type")
	private String type;

	
	
	//boilerplate
	
	public ersType() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ersType(int typeId, String type) {
		super();
		this.typeId = typeId;
		this.type = type;
	}



	public ersType(String type) {
		super();
		this.type = type;
	}



	@Override
	public String toString() {
		return "ersType [typeId=" + typeId + ", type=" + type + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + typeId;
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
		ersType other = (ersType) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (typeId != other.typeId)
			return false;
		return true;
	}



	public int getTypeId() {
		return typeId;
	}



	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}

	

	
}
