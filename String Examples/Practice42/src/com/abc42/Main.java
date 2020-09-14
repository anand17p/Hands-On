package com.abc42;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Integer userId;
		String street;
		String city;
		String state;
		ArrayList<Address> list = new ArrayList<Address>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of users:");
		int eno = Integer.parseInt(br.readLine());
		System.out.println("Enter user address details in CSV format(User ID,Street,City,State):");
		for (int i = 0; i < eno; i++) {
			String str = br.readLine();
			String[] details = str.split(",");
			userId = Integer.parseInt(details[0]);
			street = details[1];
			city = details[2];
			state = details[3];
			Address e = new Address(userId, street, city, state);
			list.add(e);
		}
		System.out.format("%-15s %-15s %-15s %s\n", "User ID", "Street", "City", "State");
		for (Address e : list) {
			System.out.format("%-15s %-15s %-15s %s\n", e.getUserId(), e.getStreet(), e.getCity(), e.getState());

		}

	}

}
