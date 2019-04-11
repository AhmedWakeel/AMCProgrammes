package com.multithreading;

public class JoinMethod extends Extended implements Runnable    // extends Thread
{
 
  public static Thread mt ;

	public void run()
	{
				try {
					mt.join();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			
		for(int i = 0 ;i <10; i++)
		{
			System.out.println("in run method "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		  /*JoinMethod.mt = Thread.currentThread();
          JoinMethod joinMethod = new  JoinMethod();
          Thread thread = new Thread(joinMethod);
          thread.start();*/
		
		    Thread.currentThread().join();
		
//          thread.join();
//          Thread.yield();
          
          for(int i =0 ; i<10; i++)
          {
        	  System.out.println("in the main method");
          }
	}
}

class Extended
{
	  public  void mk() 
      {
      }
}