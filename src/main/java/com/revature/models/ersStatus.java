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
@Table(name = "ers_status")
public class ersStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name = "ers_status_id")
	private int statusId;
	
	@Column(name = "ers_status")
	private String status;

	
	
	//boilerplate
	
	public ersStatus() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ersStatus(int statusId, String status) {
		super();
		this.statusId = statusId;
		this.status = status;
	}



	public ersStatus(String status) {
		super();
		this.status = status;
	}



	@Override
	public String toString() {
		return "ersStatus [statusId=" + statusId + ", status=" + status + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + statusId;
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
		ersStatus other = (ersStatus) obj;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (statusId != other.statusId)
			return false;
		return true;
	}



	public int getStatusId() {
		return statusId;
	}



	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}


	
}
