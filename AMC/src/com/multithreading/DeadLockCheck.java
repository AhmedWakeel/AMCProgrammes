package com.multithreading;

import java.util.concurrent.locks.ReentrantLock;

class Display
{
	ReentrantLock l = new ReentrantLock();
	public   void wish(String name)   //synchronized
	{
		l.lock();
		for(int i = 0 ; i<10;i++)
		{
			System.out.println("calling the thread "+ i);
			try
			{
//				Thread.yield();
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
				System.out.println("interrupted is called");
			}
		}
		l.unlock();
	}
}

class MyThread extends Thread
{
	Display display;
	String name;
	
	MyThread(Display display,String name)
	{
	   this.display = display;
	   this.name = name;
	}
	public void run()
	{
		display.wish(name);
	}
}

public class DeadLockCheck {
	
  public static void main(String[] args) throws InterruptedException	
  {
	 Display display = new Display();
	 Display display1 = new Display();
	 MyThread t1 = new MyThread(display, "A");
	 MyThread t2 = new MyThread(display1, "B");
	 
	 t1.start();
//	 t1.join();
	 t2.start();
	 
  }
}
