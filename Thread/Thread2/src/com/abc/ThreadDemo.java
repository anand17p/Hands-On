package com.abc;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(9);
		MyThread t = new MyThread();
		System.out.println(t.getPriority());
	}
}
