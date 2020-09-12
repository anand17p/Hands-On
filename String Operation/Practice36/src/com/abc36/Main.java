package com.abc36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		CheckStrings c = new CheckStrings();
		String s1=br.readLine();
		System.out.println("Dumpty Says :"+s1);
		System.out.println("What Humpty Want To Remove?");
		String s2=br.readLine();
		String s=c.editString(s1,s2);
		System.out.println("Dumpty's New Sentense :"+s);

	}

}
