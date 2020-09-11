package com.abc6;

public class Venue {
	private String name;
	 private String city;
	 public Venue() {
		 
	 }
	 
	public Venue(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}
	public static void displayVenue(Venue v)
	{
		System.out.println("Venue Details:");
		System.out.println("Venue Name : "+v.getName());
		System.out.println("City Name : "+v.getCity());
	}
	
}
