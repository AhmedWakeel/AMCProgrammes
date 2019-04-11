package com.multithreading;

public class CreatingThreadGroup extends Thread {
	
	public CreatingThreadGroup(ThreadGroup group , String name) {
		super(group, name);
	} 

	public static void main(String[] args) throws InterruptedException
	{
		
		ThreadGroup par = new ThreadGroup("parent");
		ThreadGroup chil = new ThreadGroup(par, "chld");
		
		CreatingThreadGroup t1 = new CreatingThreadGroup(par,"t1");
		CreatingThreadGroup t2 = new CreatingThreadGroup(par,"t2");
		
		t1.start();
        t2.start();
        
        System.out.println(par.activeCount());
        System.out.println(par.activeGroupCount());
        par.list();
        Thread.sleep(1000);
        
		
		
		
		/*ThreadGroup parent = Thread.currentThread().getThreadGroup().getParent();
		System.out.println("__"+parent.getName());
		Thread[] threads = new Thread[parent.activeCount()];
		parent.enumerate(threads);
		for(Thread thread : threads)
		{
			System.out.println(thread.getName()+"  "+thread.isAlive());
		}*/
	}
}
