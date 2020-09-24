package com.abc;

class MyThread extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("i am lazy Thread :" + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("i got interrupted");
		}
	}
}
