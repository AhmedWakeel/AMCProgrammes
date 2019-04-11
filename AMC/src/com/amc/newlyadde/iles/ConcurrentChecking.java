package com.amc.newlyadde.iles;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentChecking extends Thread{

	static ArrayList ls = new ArrayList();
	
	
	public void run()
	{
		System.out.println("in the run method");
		try
		{
			Thread.sleep(200);
		}
		catch(InterruptedException ex){
		}
         System.out.println("updating the list");		
         ls.add("yes");
	}
	
	
	public static void main(String[] args)
	{
      ls.add("one");		
      ls.add("two");
      ls.add("three");
      
      ConcurrentChecking checking = new ConcurrentChecking();
      checking.start();
      
      Iterator iterator = ls.iterator();
      while(iterator.hasNext())
      {
    	  String next = (String)iterator.next();
    	  System.out.println("element is "+next);
          try {
        	  System.out.println("in sleep ");
			Thread.sleep(200);
		} catch (InterruptedException e) {
			System.out.println("exception is thorwn	");
		}    	  
      }
          System.out.println(ls); 		
	}
}
