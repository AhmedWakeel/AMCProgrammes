package com.overloading;

public class ExceptionTest {

 static	int i = 20;
	
	public static void mk()
	{
		System.out.println("hi");
		try
		{
		int k = i/0;
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}
		System.out.println("yes");
		
	}
	
	public static void main(String[] args) {
		
		mk();
	}
}
