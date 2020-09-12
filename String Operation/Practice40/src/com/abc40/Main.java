package com.abc40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		CheckStrings c = new CheckStrings();
		System.out.println("Enter Humpty's Sentence :");
		String s=br.readLine();
	    boolean b=c.checkUpperCase(s);
	    String str = String.valueOf(b);
		if(str=="true") {
			System.out.println("String is in uppercase");
		}
		else if(str=="false")
		{
			System.out.println("String is not in uppercase");
		}
	}

}
