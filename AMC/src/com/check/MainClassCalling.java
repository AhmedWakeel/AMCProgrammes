package com.check;

public class MainClassCalling {

	public static void main(String[] args)
	{
		FinalClassChecking checking = new FinalClassChecking();
//		checking.m1();
		mk();
		
	}
	public static void mk()
	{
		System.out.println("in the mk method of ");
		try {
			System.out.println(10/0);
		} 
		catch (Exception e) {
			System.out.println("in the Exception block");
//			System.out.println(e);
//			e.printStackTrace();
		}
		System.out.println("after the exception ");
	}
}
