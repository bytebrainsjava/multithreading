package com.app.bytebrains;

class Task1 extends Thread {
	public void run() {
		System.out.println("Generate Report");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("add entry into database");
	}
}

class Task2 extends Thread {
	public void run() {
		System.out.println("Send mail to Customer");
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		
		
		Task1 task1 = new Task1();
		Task2 task2 = new Task2();
		task1.start();
		task2.start();
	}
}
