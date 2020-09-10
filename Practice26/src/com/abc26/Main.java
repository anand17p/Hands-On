package com.abc26;

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
			try
			{
			if(c[i]%2==0&&a%2==1||c[i]%2==1&&a%2==0)
			{
				throw new IllegalArgumentException();
				
			}
			}
			catch(IllegalArgumentException ile)
			{
				System.out.println("Exception handled in the main() method" );
				System.exit(0);
			}
			
			int Result=(c[i]/a);
			System.out.println("Result : "+Result);
			
		}	


	}

}
