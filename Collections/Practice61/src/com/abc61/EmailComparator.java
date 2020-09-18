package com.abc61;

import java.util.Comparator;

public class EmailComparator implements Comparator<User> {
	@Override
	public int compare(User e1, User e2) {

		return e1.email.compareTo(e2.email);
	}

}
