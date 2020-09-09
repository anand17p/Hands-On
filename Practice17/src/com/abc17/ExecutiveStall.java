package com.abc17;

public class ExecutiveStall {
	String stallName;
	Integer cost;
	String ownerName;
	Integer screen;
	public ExecutiveStall()
	{
		
	}
	public ExecutiveStall(String stallName, Integer cost, String ownerName, Integer screen) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.screen = screen;
	}
	
    public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setScreen(Integer screen) {
		this.screen = screen;
	}
	
	public String getStallName() {
		return stallName;
	}
	public Integer getCost() {
		return cost;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public Integer getScreen() {
		return screen;
	}
	public void display() {
		System.out.println("Stall Name:"+getStallName());
		System.out.println("Cost:"+getCost());
		System.out.println("Owner Name:"+getOwnerName());
		System.out.println("Number of Screens:"+getScreen());
		
	}
	

}
