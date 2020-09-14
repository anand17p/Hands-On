package com.abc41;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the email address");
		String s1 = br.readLine();
		if (s1.contains("com") || s1.contains("in") || s1.contains("net") || s1.contains("org")) {
			System.out.println("Valid email address");
		} else {
			System.out.println("Invalid email address");
		}

	}
}