package com.app.bytebrains;

/*
 * Create a Thread By Extending java.lang.Thread Class
 */
class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Number : " + i);
		}
	}
}

public class ThreadsInJava {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
	}
}