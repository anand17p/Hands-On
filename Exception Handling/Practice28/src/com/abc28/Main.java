package com.abc28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Item type details:");
        try {
        System.out.println("Enter the name:");
        String c=br.readLine();
        System.out.println("Enter the deposit:");
        double c1=Double.parseDouble(br.readLine());
        System.out.println("Enter the cost per day:");
        double c2=Double.parseDouble(br.readLine());
        ItemType i= new ItemType(c,c1,c2);
		i.display();
        }
        catch(NumberFormatException e)
        {
        	System.out.println(e.toString()); 
        }
        
	}

}
