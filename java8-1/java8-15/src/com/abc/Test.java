package com.abc;

public class Test {
	public static void main(String[] args) {
		Interf f = s -> new Sample(s);
		f.get("From Lambda Expression");
		Interf f1 = Sample::new;
		f1.get("From Constructor Reference");
	}

}
