package com.multithreading;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonChecking {
  
	 private static  SingletonChecking checking;
	
	private SingletonChecking()
	{
	}

	public static SingletonChecking getInstance()
	{
		if(checking == null)
		{
			checking = new SingletonChecking();
		}
		return checking;
	}
}

class Main
{
	public static void main(String[] args) throws ReflectiveOperationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		SingletonChecking checking1 = SingletonChecking.getInstance();
//		SingletonChecking checking2 = SingletonChecking.getInstance();
		SingletonChecking checking2 = null;
		Constructor[] declaredConstructors = SingletonChecking.class.getDeclaredConstructors();
		Constructor<?>[] constructors = SingletonChecking.class.getConstructors();
		for(Constructor constructor :declaredConstructors )
		{
			constructor.setAccessible(true);
			
			System.out.println(constructor.getName());
			checking2 =(SingletonChecking) constructor.newInstance();
			break;
		}
		
		System.out.println(checking1 == checking2);
		
	}
}
