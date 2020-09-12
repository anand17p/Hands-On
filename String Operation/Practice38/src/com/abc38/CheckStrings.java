package com.abc38;

public class CheckStrings {
	public int countWords(String s1, String s2) {

		String[] w1 = s1.split("\\s+");
		String[] w2 = s2.split("\\s+");
		if (w1.length == w2.length) {
			return 0;
		} else if (w1.length > w2.length) {
			return 1;
		}
		return 2;
	}
}
