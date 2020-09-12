package com.abc35;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		CheckStrings c = new CheckStrings();
		System.out.println("Enter Humpty's Sentence :");
		String s=br.readLine();
		System.out.println("Word To Replace :");
		String s2=br.readLine();
		System.out.println("Synonym :");
		String s3=br.readLine();
		String s1=c.replaceString(s,s2,s3);
		System.out.println("Cocantenated String :"+s1);

	}

}
