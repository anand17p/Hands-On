package com.abc46;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the date value");
		String s1 = br.readLine();
		s1=s1.replaceAll("\\W", "-");
		System.out.println("Date in correct format\n"+s1);
	}
}
