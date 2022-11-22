package com.app.bytebrains;

class Task4 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Task 4");
		}
	}
}

class Task5 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Task 5");
		}
	}
}
public class RunnableDemo {
	public static void main(String[] args) {
		Task4 task4 = new Task4();
		Thread thread = new Thread(task4);
		thread.start();
		
		Task5 task5 = new Task5();
		Thread thread1 = new Thread(task5);
		thread1.start();
	}

}
