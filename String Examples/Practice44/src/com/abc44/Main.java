package com.abc44;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Address 1:");
		String s1 = br.readLine();
		System.out.println("Address 2:");
		String s2 = br.readLine();
		String[] a = s1.split(" ");
		String[] b = s2.split(" ");
		if (s1.equalsIgnoreCase(s2)) 
		{
			if (s1.length()==s2.length())
			{
				if (s1.equals(s2))
				{
					System.out.println("RED");
				}
				else 
				{
					System.out.println("BLUE");
				}
			}
			else
			{
				System.out.println("YELLOW");
			}

		}

		else 
		{
			System.out.println("GREEN ");
		}
	}
}
