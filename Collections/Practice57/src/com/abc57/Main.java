package com.abc57;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String name;
		String email;
		String username;
		String password;
		ArrayList<User> list = new ArrayList<User>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of user details");
		int eno = Integer.parseInt(br.readLine());
		for (int i = 0; i < eno; i++) {
			System.out.println("Enter the user " + (i + 1) + " details ");
			String str = br.readLine();
			String[] details = str.split(",");
			name = details[0];
			email = details[1];
			username = details[2];
			password = details[3];
			User e = new User(name, email, username, password);
			list.add(e);
		}
		System.out.println("Sort by");
		System.out.println("1.Name\r\n" + "2.Email\r\n" + "");
		int no = Integer.parseInt(br.readLine());
		if (no == 1) {
			System.out.format(("%-15s %-20s %-15s %s\n"), "Name", "Email", "Username", "Password");
			Collections.sort(list, new NameComparator());
			for (User h : list) {
				System.out.format(("%-15s %-20s %-15s %s\n"), h.name, h.email, h.username, h.password);
			}
		} else if (no == 2) {
			System.out.format(("%-15s %-20s %-15s %s\n"), "Name", "Email", "Username", "Password");
			Collections.sort(list, new EmailComparator());
			for (User h : list) {
				System.out.format(("%-15s %-20s %-15s %s\n"), h.name, h.email, h.username, h.password);
			}

		} else {
			System.out.println("Invalid Choice");
		}
	}

}
