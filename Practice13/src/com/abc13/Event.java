package com.abc13;

public class Event {
	protected String name;
	protected String detail;
	protected String ownerName;
	Double revenue;
	public Event()
	{
		
	}
	
	public Event(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	

	public String getName() {
		return name;
	}

	public String getDetail() {
		return detail;
	}

	public String getOwnerName() {
		return ownerName;
	}
	protected void display()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Detail:"+this.detail);
		System.out.println("Owner Name:"+this.ownerName);
	}



}
