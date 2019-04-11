package com.multithreading;

public class Multi extends Thread{

	public void run()
	{
		int i;
		for(i=0 ; i<10 ; i++)
		{
			System.out.println("in the run method "+ Thread.currentThread().getName()+ " ="+i);
			Thread.yield();
		}
	}
	
	public static void main(String[] args)
	{
		Multi multi = new Multi();
		multi.start();
		
		for(int i =0; i<10;i++)
		{
			System.out.println("in  main method "+Thread.currentThread().getName()+ " ="+i);
			Thread.yield();
		}
		/*System.out.println(Thread.currentThread().getName());
		Multi multi = new Multi();
		System.out.println(Thread.currentThread().getName()+" "+multi.getName());*/
		
		
	}
}
