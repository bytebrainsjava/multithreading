package com.app.bytebrains;

class Test {
	 void  UpdateAccountBalance() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class ThreadDemo2 {
	public static void main(String[] args) {
		Test test1 = new Test();
		Thread t1 = new Thread("Google Pay") {  // Naveen 
			public void run() {
				test1.UpdateAccountBalance();
			}
		};
		Thread t2 = new Thread("Phone Pay") {  // Ajy
			public void run() {
				test1.UpdateAccountBalance();
			}
		};
		t1.start();
		t2.start();
	}
}
