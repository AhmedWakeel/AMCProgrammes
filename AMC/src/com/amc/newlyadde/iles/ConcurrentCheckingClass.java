package com.amc.newlyadde.iles;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class ConcurrentCheckingClass extends Thread {

	static ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
	
	public void run()
	{
		try
		{
			Thread.sleep(200);
		}
		catch (InterruptedException e) {
		}
		System.out.println("putting the value in cm");
		concurrentHashMap.put(101, "E");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		concurrentHashMap.put(103, "A");
		concurrentHashMap.put(102, "B");
		
		ConcurrentCheckingClass checking = new ConcurrentCheckingClass();
		checking.start();
		
		KeySetView keySet = concurrentHashMap.keySet();
		Iterator iterator = keySet.iterator();
		while(iterator.hasNext())
		{
			Integer next = (Integer)iterator.next();
			System.out.println("iterating the cocu "+concurrentHashMap.get(next)+" "+next);
			Thread.sleep(300);
		}
		System.out.println(concurrentHashMap);
		
		/*ConcurrentHashMap cm = new ConcurrentHashMap();
		cm.put(101, "A");
		cm.put(102, "B");
		cm.putIfAbsent(103, "C");
		cm.replace(102, "B","E");
		System.out.println(cm);*/
	}
}
