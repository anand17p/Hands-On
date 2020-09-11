package com.abc27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter the cost of the item for n days");
			int c=Integer.parseInt(br.readLine());
			System.out.println("Enter the value of n");
			int a=Integer.parseInt(br.readLine());
	    	int Result=(c/a);
				System.out.println("Cost per day of the item is "+Result);	
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString()); 
		}

	}

}
