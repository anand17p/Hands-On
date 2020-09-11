package com.abc6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;
		String city;
		int i=0,menu;
		Scanner sc=new Scanner(System.in);
		Venue v = new Venue();
		do {
		System.out.println("Enter the venue name");
		name=sc.nextLine();
		System.out.println("Enter the city name");
		city=sc.nextLine();
		v.setName(name);
		v.setCity(city);
		System.out.println("Venue Details:");
		System.out.println("Venue Name : "+v.getName());
		System.out.println("City Name : "+v.getCity());
        System.out.println("Verify and Update details");
        System.out.println("Menu");
        System.out.println("1.Update Venue Name ");
        System.out.println("2.Update City Name ");
        System.out.println("3.All informations Correct/Exit ");
        System.out.println("Type 1 or 2 or 3 ");
        menu=sc.nextInt();
        switch(menu) {
        case 1:
        	name=sc.nextLine();
        	v.setName(name);
        	break;
        case 2:
        	city=sc.nextLine();
        	v.setCity(city);
        	break;
	     }
        i++;
     }while(menu<3);
		System.out.println("Venue Details:");
		System.out.println("Venue Name : "+v.getName());
		System.out.println("City Name : "+v.getCity());
		
	}
	
}
	
   
