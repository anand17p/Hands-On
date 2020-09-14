package com.abc43;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String name;
		String type;
		Integer cost;
		Integer availableQuantity;
		ArrayList<Item> list = new ArrayList<Item>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of items:");
		int eno = Integer.parseInt(br.readLine());
		System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");
		for (int i = 0; i < eno; i++) {
			StringBuilder str = new StringBuilder(br.readLine()); 
			String[] details = str.toString().split("\\$");
			name = details[0];
			type = details[1];
			cost = Integer.parseInt(details[2]);
			availableQuantity = Integer.parseInt(details[3]);
			Item e = new Item(name, type, cost, availableQuantity);
			list.add(e);
		}
		System.out.println("Items:");
		for (Item e : list) {
			if(e.getAvailableQuantity()==0)
			{
			System.out.println(e.getName()+","+e.getType()+","+e.getCost()+","+"Not Available");
			}
			else
			{
				System.out.println(e.getName()+","+e.getType()+","+e.getCost()+","+"Available");
			}
		}
	}
}
