package com.abc;

public class Test implements Left, Right {

	public void m1() {
		System.out.println("Test Class Method");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}

}
