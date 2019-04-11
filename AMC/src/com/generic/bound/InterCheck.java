package com.generic.bound;

public class InterCheck implements B11 {

	public static void main(String[] args) {
		
		InterCheck check = new InterCheck();
		check.sk();
     		
	}
}
interface A11
{
	public default void sk()
	{
	System.out.println("in sk method of A11 interface");	
	}
}

interface B11 extends A11
{
	public default void sk()
	{
		System.out.println("in sk method of B11 interface");	
	}
}