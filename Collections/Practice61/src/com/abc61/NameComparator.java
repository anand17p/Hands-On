package com.abc61;

import java.util.Comparator;

public class NameComparator implements Comparator<User> {

	@Override
	public int compare(User e1, User e2) {

		return e1.name.compareTo(e2.name);
	}

}
