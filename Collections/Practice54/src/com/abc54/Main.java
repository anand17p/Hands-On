package com.abc54;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String Name;
		String Detail;
		String Type;
		String OwnerName;
		List<String> list = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of stall details");
		int eno = Integer.parseInt(br.readLine());
		for (int i = 0; i < eno; i++) {
			System.out.println("Enter the stall "+(i+1)+" detail");
			String str = br.readLine();
			list.add(str);

		}
		Iterator<String> itr = list.iterator();
		String s = "";
		while (itr.hasNext()) {
			s = itr.next();
			if (s.contains("test")) {
				itr.remove();
			}
		}
		System.out.format(("%-15s %-20s %-15s %s\n"), "Name", "Detail", "Type", "OwnerName");
		for (String s1 : list) {
			String[] details = s1.split(",");
			Name = details[0];
			Detail = details[1];
			Type = details[2];
			OwnerName = details[3];
			System.out.format(("%-15s %-20s %-15s %s\n"), Name, Detail, Type, OwnerName);
		}

	}
}
