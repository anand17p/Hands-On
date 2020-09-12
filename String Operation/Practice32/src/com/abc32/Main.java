package com.abc32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		CheckStrings c = new CheckStrings();
		System.out.println("Enter Humpty's Sentence :");
		String s1=br.readLine();
		System.out.println("Enter Dumpty's Sentence :");
		String s2=br.readLine();
		String s3=c.concatString(s1,s2);
		System.out.println("Cocantenated String :"+s3);
	}

}
