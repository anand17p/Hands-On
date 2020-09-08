package com.abc13;

public class Exhibition extends Event  {
	Integer noOfStall;
	public Exhibition()
	{
		
	}

	public Exhibition(Integer noOfStall) {
		super();
		this.noOfStall = noOfStall;
	}

	public void setNoOfStall(Integer noOfStall) {
		this.noOfStall = noOfStall;
	}

	public Integer getNoOfStall() {
		return noOfStall;
	}
	void projectedRevenue(Integer noOfStall) 
	{
	    int revenue=10000*noOfStall;
		System.out.println("The projected revenue of the event is :"+revenue);
	}
	
	

}
