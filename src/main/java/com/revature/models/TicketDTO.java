package com.revature.models;

public class TicketDTO {

	private String amount;
	private String typeId;
	private String author;
	
	
	
	public TicketDTO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public TicketDTO(String amount, String typeId, String author) {
		super();
		this.amount = amount;
		this.typeId = typeId;
		this.author = author;
	}



	public String getAmount() {
		return amount;
	}



	public void setAmount(String amount) {
		this.amount = amount;
	}



	public String getTypeId() {
		return typeId;
	}



	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	
	
}
