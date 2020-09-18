package com.abc49;

public class ItemType {
	String name;
	Double deposit;
	Double costPerDay;

	public ItemType() {

	}

	public ItemType(String name, Double deposit, Double costPerDay) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}

	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public String getName() {
		return name;
	}

	public Double getDeposit() {
		return deposit;
	}

	public Double getCostPerDay() {
		return costPerDay;
	}

}
