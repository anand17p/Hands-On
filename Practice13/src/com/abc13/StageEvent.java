package com.abc13;

public class StageEvent extends Event  {
	Integer noOfShows;
	Integer noOfSeatsPerShow;
	public StageEvent()
	{
		
	}
	public StageEvent(Integer noOfShows, Integer noOfSeatsPerShow) {
		super();
		this.noOfShows = noOfShows;
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}
	public void setNoOfShows(Integer noOfShows) {
		this.noOfShows = noOfShows;
	}
	public void setNoOfSeatsPerShow(Integer noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}
	public Integer getNoOfShows() {
		return noOfShows;
	}
	public Integer getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}
	void projectedRevenue(Integer noOfShows, Integer noOfSeatsPerShow) 
	{
	    int revenue=50*noOfShows*noOfSeatsPerShow;
		System.out.println("The projected revenue of the event is :"+revenue);
	}
	
	

}
