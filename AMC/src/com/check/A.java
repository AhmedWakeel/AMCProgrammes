package com.check;

public class A {

}

class B extends A
{
   public static void mk(Object s)	
   {
	   System.out.println("in the String");
   }
	public static void mk(Integer i)
	{
		System.out.println("in the integer method ");
	}
	
	public static void main(String[] args)
	{
		mk(null);
		
		/*A[] b = new B[3];
//		b[1] = new A(); 
		b[0] = new B();
		System.out.println(b[0]);*/
		
	}
}
