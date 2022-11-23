package com.app.bytebrains;

class Task1 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Task - 1");
		}
	}
}

class Task2 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Task - 2");
		}
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
