package com.abc25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any 10 values :\r\n" + 
				"");
		int[] c=new int[10];
		for(int j=0;j<10;j++)
		{
			c[j]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter Divisor :\r\n" + "");
		int a=Integer.parseInt(br.readLine());
			for(int i=0;i<10;i++)
			{
				if(c[i]%a!=0)
				{try
				{
					throw new ArithmeticException();
				}
				catch(ArithmeticException e)
				{
					System.out.println("Invalid Combination : "+c[i]+" "+a);
					System.exit(0);
				}
				}
				
				int Result=(c[i]%a);
				System.out.println("Result"+Result);
				
			}	
		}
		

	}
	




