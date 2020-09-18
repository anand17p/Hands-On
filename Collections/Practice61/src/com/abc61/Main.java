package com.abc61;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
		Comparator<User> c = new Comparator<User>() {
			public int compare(User e1, User e2) {
				return e1.name.compareTo(e2.name);
			}

		};
		Comparator<User> c1 = new Comparator<User>() {
			public int compare(User e1, User e2) {
				return e1.email.compareTo(e2.email);
			}

		};
		System.out.println("Sort by");
		System.out.println("1.Name\r\n" + "2.Email\r\n" + "");
		int no = Integer.parseInt(br.readLine());
		if (no == 1) {
			Collections.sort(list, new NameComparator());
			System.out.println("Enter the name");
			String name1 = br.readLine();
			int index = Collections.binarySearch(list, new User(name1, null, null, null), c);
			if (index < list.size()) {
				System.out.format(("%-15s %-20s %-15s %s\n"), "Name", "Email", "Username", "Password");
				System.out.println(list.get(index));
			}

		} else if (no == 2) {
			Collections.sort(list, new EmailComparator());
			System.out.println("Enter the name");
			String name1 = br.readLine();
			int index = Collections.binarySearch(list, new User(name1, null, null, null), c1);
			if (index < list.size()) {
				System.out.format(("%-15s %-20s %-15s %s\n"), "Name", "Email", "Username", "Password");
				System.out.println(list.get(index));
			}

		} else {
			System.out.println("Invalid choice");
		}
	}
}
