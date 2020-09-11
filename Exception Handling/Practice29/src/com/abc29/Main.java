package com.abc29;
import java.util.*;
import java.util.InputMismatchException;


public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer input:");
        try {
    		int c=sc.nextInt();
    		System.out.println("Entered value is "+c);
        }
        catch(InputMismatchException i)
        {
        	System.out.println(i.toString()); 
        }
		
	}

}
