package com.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantChecking {

	public static void main(String[] args)
	{
		ReentrantLock lock = new ReentrantLock();
		
		lock.lock();
		lock.lock();
		System.out.println(lock.getHoldCount());
		System.out.println(lock.isHeldByCurrentThread());
		System.out.println(lock.getQueueLength());
		System.out.println(lock.isLocked());
		System.out.println(lock.isFair());
		System.out.println(lock.hasQueuedThreads());
	}
}
