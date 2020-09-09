package com.abc17;

class GoldStall implements Stall  {
	String stallName;
	Integer cost;
	String ownerName;
	Integer tvSet;
	public GoldStall()
	{
		
	}
	public GoldStall(String stallName, Integer cost, String ownerName, Integer tvSet) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.tvSet = tvSet;
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
	public void setTvSet(Integer tvSet) {
		this.tvSet = tvSet;
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
	public Integer getTvSet() {
		return tvSet;
	}
	@Override
	public void display() {
		System.out.println("Stall Name:"+getStallName());
		System.out.println("Cost:"+getCost());
		System.out.println("Owner Name:"+getOwnerName());
		System.out.println("Number of TV sets:"+getTvSet());
		
	}
	
}
