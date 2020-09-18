package com.abc53;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Set<String> u = new HashSet<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String no = "";
		while (true) {
			System.out.println("Enter the username ");
			String s1 = br.readLine();
			u.add(s1);
			System.out.println("Do you want to continue?(y/n)");
			no = br.readLine();
			if (no.equals("n")) {
				for (String s : u) {
					if (s != null && !s.isEmpty()) {
						System.out.println("Number of usernames is " + u.size());
						break;

					} else {
						System.out.println("Number of usernames is " + (u.size() - 1));
						break;

					}
				}
				break;
			}

		}

	}
}
