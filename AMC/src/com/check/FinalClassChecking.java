package com.check;

public class FinalClassChecking {

	 FinalClassChecking() {
	}

	public static void m1() {
			m2();
		System.out.println("in m1");
	}

	public static void m2() {
			m3();
		System.out.println("in m2");
	}

	public static void m3()  {
		try {	
		System.out.println(20 / 10);
	} catch (ArithmeticException e) {
		System.out.println("in m3 catch");
		try {
			throw new Exception();
		} catch (Exception e1) {
			System.out.println("in the exception of m3");
		}
	}
		System.out.println("hi");
	}

	public static void main(String[] args) {
       m1();
	}
}

class Childf// extends FinalClassChecking
{

}