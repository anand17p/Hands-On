package com.abc40;

public class CheckStrings {
	public boolean checkUpperCase(String s) {
		if (s.contentEquals(s.toUpperCase())) {
			return true;
		}
		return false;
	}
}