package com.abc;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String name,city;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the venue name");
		name=sc.nextLine();
		System.out.println("Enter the city name");
		city=sc.nextLine();
		Venue v = new Venue();
		v.setName(name);
		v.setCity(city);
		System.out.println("Venue Details:");
		System.out.println("Venue Name : "+v.getName());
		System.out.println("City Name : "+v.getCity());
		
	}

}
