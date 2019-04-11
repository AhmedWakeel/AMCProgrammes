package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutorCheckign implements Runnable {
 
	 String name;
	 ThreadExecutorCheckign(String name)
	 {
		 this.name = name;
	 }
	  public void run()
	  {
         System.out.println(name+" is started by "+Thread.currentThread().getName());		  
         try
         {
        	 Thread.sleep(100);
         }
           catch(InterruptedException exception)
         {
        	   System.out.println("in exception");
         }
         System.out.println(name+" completed by "+Thread.currentThread().getName());
	  }
}
class Main13
{
	public static void main(String[] args)
	{
		ThreadExecutorCheckign[] checkigns = {new ThreadExecutorCheckign("A"),new ThreadExecutorCheckign("B"),new ThreadExecutorCheckign("C"),new ThreadExecutorCheckign("D"),new ThreadExecutorCheckign("E"),new ThreadExecutorCheckign("F")};
		ExecutorService executorService = Executors.newFixedThreadPool(6);
		
		for(ThreadExecutorCheckign checkign : checkigns)
		{
			executorService.submit(checkign);
		}
		executorService.shutdown();
		
	}
}