package com.amc37;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		CheckStrings c = new CheckStrings();
		System.out.println("Enter Humpty's Sentence :");
		String s1 = br.readLine();
		System.out.println("Humpty Says :" + s1);
		System.out.println("What Dumpty want to insert & where?");
		String s2 = br.readLine();
		System.out.println("Enter Position :");
		int pos = Integer.parseInt(br.readLine());
		String s3 = c.insertData(s1, s2, pos);
		System.out.println("Humpty's New Sentense :" + s3);

	}
}
