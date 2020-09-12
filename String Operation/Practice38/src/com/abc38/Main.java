package com.abc38;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		CheckStrings c = new CheckStrings();
		System.out.println("Enter Humpty's Sentence :");
		String s1 = br.readLine();
		System.out.println("Enter Dumpty's Sentence :");
		String s2 = br.readLine();
		int result = c.countWords(s1, s2);
		switch (result) {
		case 0:
			System.out.println("Both have used equal number of words");
			break;
		case 1:
			System.out.println("Humpty has used more words");
			break;
		case 2:
			System.out.println("Dumpty has used more words");
			break;
		}

	}
}
