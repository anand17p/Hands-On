package com.abc52;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<String> list = new ArrayList<String>();
		Set<String> u = new HashSet<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		String no = "";
		while (true) {
			System.out.println("Enter the username " + (i + 1));
			String s1 = br.readLine();
			list.add(s1);
			i++;
			System.out.println("Do you want to continue?(y/n)");
			no = br.readLine();
			if (no.equals("n")) {
				for (String s : list) {
					if (u.add(s) == false) {
						System.out.println("The unique number of usernames is " + list.lastIndexOf(s));
					}
				}
				break;

			}

		}
	}
}
