package com.abc55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		String name;
		String contactNumber;
		Double costPerDay;
		String ownerName;
		ArrayList<Hall> list = new ArrayList<Hall>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of halls:");
		int eno = Integer.parseInt(br.readLine());
		for (int i = 0; i < eno; i++) {
			System.out.println("Enter the details of hall " + (i + 1));
			String str = br.readLine();
			String[] details = str.split(",");
			name = details[0];
			contactNumber = details[1];
			costPerDay = Double.parseDouble(details[2]);
			ownerName = details[3];
			Hall h = new Hall(name, contactNumber, costPerDay, ownerName);
			list.add(h);
		}
		System.out.println("Sorted Order (from the least expensive to the most):");
		Collections.sort(list);
		System.out.format(("%-15s %-20s %-15s %s\n"), "Name", "Contact number", "Cost per day", "OwnerName");
		for (Hall h : list) {
			System.out.format(("%-15s %-20s %-15s %s\n"), h.name, h.contactNumber, h.costPerDay, h.ownerName);
		}

	}
}
