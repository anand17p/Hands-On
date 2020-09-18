package com.abc50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of halls:");
		int eno = Integer.parseInt(br.readLine());
		for (int i = 0; i < eno; i++) {
			System.out.println("Enter the Hall Name " + (i + 1));
			list.add(br.readLine());
		}
		System.out.println("Enter the hall name to be searched:");
		String s = br.readLine();
		boolean no = list.contains(s);
		if (no) {
			int p = list.indexOf(s);
			System.out.println("" + (s) + " hall is found in the list at position " + p);
		} else {
			System.out.println("" + (s) + " hall is not found");
		}

	}

}
