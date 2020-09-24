package com.abc;

class ThreadJoinDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		// t.join(); 1
		for (int i = 0; i < 5; i++) {
			System.out.println("Rama Thread");
		}
	}
}
