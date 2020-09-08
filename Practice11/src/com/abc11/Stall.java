package com.abc11;

public class Stall {
	protected String name;	
	protected String detail;	
	protected String ownerName;	
	Integer squareFeet;
	Integer numberOfTV;
	int cost;
	public Stall()
	{
		
	}
	public Stall(String name, String detail, String ownerName) {
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

	public void computeCost(Integer stallType, Integer squareFeet) 
	{
		if(stallType==1)
		{
			 cost=200*squareFeet;
		}
		
		else if(stallType==2)
		{
			cost=150*squareFeet;
		}
		else {
			 cost=100*squareFeet;
		}
		System.out.println("The cost of the stall is "+cost);
	}
	
	public void computeCost(Integer stallType, Integer squareFeet, Integer numberOfTV)	
	{
		if(stallType==1)
		{
			 cost=200*squareFeet*numberOfTV;
		}
		
		else if(stallType==2)
		{
		     cost=150*squareFeet*numberOfTV;
		}
		else {
			 cost=100*squareFeet*numberOfTV;
		}
		System.out.println("The cost of the stall is "+cost);
		
	}

}
