package com.abc30;

public class Event {
	String name;
	String detail;
	String ownerName;	
	Long typeId;
	public Event()
	{
		
	}
	public Event(String name, String detail, String ownerName, Long typeId) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
		this.typeId = typeId;
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
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
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
	public Long getTypeId() {
		return typeId;
	}
	
}
