package com.revature.models;

import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class ersTicket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticket_id")
	private int reimd_id;
	
	@Column(name = "ticket_amount")
	private int amount;
	
	@Column(name = "ticket_description")
	private String description;
	
	@Column(name = "ticket_receipt")
	private byte[] receipt;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "types_id")
	private ersType typeId;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "ers_status_id")
	private ersStatus statusId;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "ticket_author")
	private ersUsers author;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "ticket_resolver")
	private ersUsers resolver;

	//boiler plate
	
	public ersTicket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ersTicket(int reimd_id, int amount, String description, byte[] receipt, ersType typeId, ersStatus statusId,
			ersUsers author, ersUsers resolver) {
		super();
		this.reimd_id = reimd_id;
		this.amount = amount;
		this.description = description;
		this.receipt = receipt;
		this.typeId = typeId;
		this.statusId = statusId;
		this.author = author;
		this.resolver = resolver;
	}

	public ersTicket(int amount, String description, byte[] receipt, ersType typeId, ersStatus statusId,
			ersUsers author, ersUsers resolver) {
		super();
		this.amount = amount;
		this.description = description;
		this.receipt = receipt;
		this.typeId = typeId;
		this.statusId = statusId;
		this.author = author;
		this.resolver = resolver;
	}

	@Override
	public String toString() {
		return "ersTicket [reimd_id=" + reimd_id + ", amount=" + amount + ", description=" + description + ", receipt="
				+ Arrays.toString(receipt) + ", typeId=" + typeId + ", statusId=" + statusId + ", author=" + author
				+ ", resolver=" + resolver + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + Arrays.hashCode(receipt);
		result = prime * result + reimd_id;
		result = prime * result + ((resolver == null) ? 0 : resolver.hashCode());
		result = prime * result + ((statusId == null) ? 0 : statusId.hashCode());
		result = prime * result + ((typeId == null) ? 0 : typeId.hashCode());
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
		ersTicket other = (ersTicket) obj;
		if (amount != other.amount)
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (!Arrays.equals(receipt, other.receipt))
			return false;
		if (reimd_id != other.reimd_id)
			return false;
		if (resolver == null) {
			if (other.resolver != null)
				return false;
		} else if (!resolver.equals(other.resolver))
			return false;
		if (statusId == null) {
			if (other.statusId != null)
				return false;
		} else if (!statusId.equals(other.statusId))
			return false;
		if (typeId == null) {
			if (other.typeId != null)
				return false;
		} else if (!typeId.equals(other.typeId))
			return false;
		return true;
	}

	public int getReimd_id() {
		return reimd_id;
	}

	public void setReimd_id(int reimd_id) {
		this.reimd_id = reimd_id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getReceipt() {
		return receipt;
	}

	public void setReceipt(byte[] receipt) {
		this.receipt = receipt;
	}

	public ersType getTypeId() {
		return typeId;
	}

	public void setTypeId(ersType typeId) {
		this.typeId = typeId;
	}

	public ersStatus getStatusId() {
		return statusId;
	}

	public void setStatusId(ersStatus statusId) {
		this.statusId = statusId;
	}

	public ersUsers getAuthor() {
		return author;
	}

	public void setAuthor(ersUsers author) {
		this.author = author;
	}

	public ersUsers getResolver() {
		return resolver;
	}

	public void setResolver(ersUsers resolver) {
		this.resolver = resolver;
	}

	
	
}



