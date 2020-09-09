package com.amc22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int a[]={10,9,8,7,6,5,4,3,2,1};
		try
		{
			System.out.println("Enter any 10 values :\r\n" + 
					"");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int[] c=new int[10];
			for(int j=0;j<10;j++)
			{
				c[j]=Integer.parseInt(br.readLine());
			}
			for(int i=0;i>=0;i++)
			{
				int Result=(a[i]/c[i]);
				System.out.println("Result"+Result);
				
			}	
		}
		catch(ArrayIndexOutOfBoundsException aoe)
		{
			System.out.println("Elements Over");
		}

	}

}
