package com.multithreading;

public class InterruptingThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("inside run methodwwwww");
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("thread is interruptedwwwwwwwwwwwwwwwwwwwww");
			}
		}
	}

	public static void main(String[] args) {
		InterruptingThread exception = new InterruptingThread();
		exception.start();
//		exception.interrupt();
		Thread.interrupted();
		System.out.println("main is completedQQQQQQQQQQQQQQ");
	}
}
