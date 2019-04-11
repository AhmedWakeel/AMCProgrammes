package com.overloading;

public class A {

	/*void mk(String s)
	{
		System.out.println("in string");
	}
	void mk(Object s)
	{
		System.out.println("in mk object");
	}*/
	void mk(B s)
	{
		System.out.println("in string");
	}
	void mk(C s)
	{
		System.out.println("in mk object");
	}
	/*void mk(A s)
	{
		System.out.println("in mk A");
	}*/
	void mk(int i, Float ik)
	{
		System.out.println("in mk int");
	}
	void mk(Float i, int ik)
	{
		System.out.println("in mk int");
	}
	void mk(float i)
	{
		System.out.println("in mk float");
	}
	public static void main(String[] args) {
		
		Integer integer = new Integer(34);
		new A().mk(integer);
	}
}

 class B
 {
	 
 }
 class C extends B
 {
	 
 }