package com.multithreading;

import java.util.Stack;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		CheckThread checkThread = new CheckThread();
		Stack<String> stack = new Stack<>();
		checkThread.start();
		synchronized (stack) {
			System.out.println("calling the wait method");
			checkThread.mk(stack);
			stack.wait();
			System.out.println("var value is "+checkThread.var);
		}
	}
}
class CheckThread extends Thread {
	public int var = 0;
	Stack  stack = null;
	public void run() {
		synchronized (stack) {
			System.out.println("entered into the run sync method");
			stack.notify();
			for (int i = 1; i <= 100; i++) {
				var = var + i;
			}
			System.out.println("calling the notify method");
			this.notify();
		}
	}
	public void mk(Stack stack)
	{
		this.stack = stack;
	}
}
