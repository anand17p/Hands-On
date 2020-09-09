package com.abc17;

public class PremiumStall {
	String stallName;
	Integer cost;
	String ownerName;
	Integer projector;
	public PremiumStall()
	{
		
	}
	public PremiumStall(String stallName, Integer cost, String ownerName, Integer projector) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.projector = projector;
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
	public void setProjector(Integer projector) {
		this.projector = projector;
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
	public Integer getProjector() {
		return projector;
	}
	public void display() {
		System.out.println("Stall Name:"+getStallName());
		System.out.println("Cost:"+getCost());
		System.out.println("Owner Name:"+getOwnerName());
		System.out.println("Number of Projectors:"+getProjector());
		
	}


}
