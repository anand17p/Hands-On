package com.abc;

class ThreadB extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("child thread starts calcuation");// step-2
			for (int i = 0; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("child thread giving notification call");// step-3
			this.notify();
		}
	}
}
