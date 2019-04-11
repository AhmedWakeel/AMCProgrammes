package com.multithreading;

public class DaemonThread extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("in the main run method");
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		DaemonThread daemonThread = new DaemonThread();
//		daemonThread.setDaemon(true);
		daemonThread.start();
//		System.out.println(daemonThread.isDaemon());
		System.out.println("end of the main thread");
        daemonThread.stop();
	}
}
