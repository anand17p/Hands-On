package com.abc28;

public class ItemType {
	String name;
	Double deposit;		
	Double costPerDay;
	public ItemType()
	{
		
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
	public void  display() 
	{
		System.out.println("The details of the item type are:");
		System.out.println("Name: "+getName());
		System.out.println("Deposit: "+ getDeposit());
		System.out.println("Cost Per Day: "+getCostPerDay());
	}


}
