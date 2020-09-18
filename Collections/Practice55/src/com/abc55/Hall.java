package com.abc55;

public class Hall implements Comparable<Hall> {
	String name;
	String contactNumber;
	Double costPerDay;
	String ownerName;

	public Hall() {

	}

	public Hall(String name, String contactNumber, Double costPerDay, String ownerName) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public Double getCostPerDay() {
		return costPerDay;
	}

	public String getOwnerName() {
		return ownerName;
	}

	@Override
	public int compareTo(Hall h) {
		double c = ((Hall) h).getCostPerDay();
		int a = (int) (this.costPerDay - c);
		return a;
	}

	public String toString() {

		return name + contactNumber + costPerDay + ownerName;

	}

}
