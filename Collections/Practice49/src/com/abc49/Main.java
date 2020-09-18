package com.abc49;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int i = 0;
		String no = "";
		ArrayList<ItemType> list = new ArrayList<ItemType>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Enter the Item type " + (i + 1));
			System.out.println("Enter the name:");
			String c = br.readLine();
			System.out.println("Enter the deposit:");
			double c1 = Double.parseDouble(br.readLine());
			System.out.println("Enter the cost per day:");
			double c2 = Double.parseDouble(br.readLine());
			ItemType e = new ItemType(c, c1, c2);
			list.add(e);
			i++;
			System.out.println("Do you want to continue?(y/n)");
			no = br.readLine();
			if (no.equals("n")) {
				System.out.format("%-20s%-20s%-20s\n", "Name", "Deposit", "Costperday");
				for (ItemType k : list) {
					System.out.format("%-20s%-20s%-20s\n", k.getName(), k.getDeposit(), k.getCostPerDay());

				}
				break;
			}

		}
	}
}