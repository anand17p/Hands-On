package com.abc54;

public class Stall {
	String name;
	String detail;
	String type;
	String ownerName;

	public Stall() {

	}

	public Stall(String name, String detail, String type, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getType() {
		return type;
	}

	public String getOwnerName() {
		return ownerName;
	}

}
