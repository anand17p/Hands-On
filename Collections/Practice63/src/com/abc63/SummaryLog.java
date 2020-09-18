package com.abc63;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SummaryLog {
	public static void main(String[] args) {
		List<CallLog> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\admin\\Desktop\\calllog.csv"))) {
			String line = br.readLine();
			while (line != null) {
				String[] details = line.split(",");
				String dialledNumber = details[0];
				String duration = details[1];
				String dialledDate = details[2];
				CallLog cal = new CallLog(dialledNumber, duration, dialledDate);
				list.add(cal);
				line = br.readLine();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		Collections.reverse(list);
		for (CallLog b : list) {
			System.out.format(("%-20s %-20s \n"), b.dialledNumber+"("+b.duration+")",b.dialledDate);
		}
	}
}
