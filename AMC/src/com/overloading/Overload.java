package com.overloading;

public class Overload {

	public void mk(A1 a1) {
		System.out.println("a1");
	}
	/*
	 * public void mk(B1 b1) { System.out.println("b1"); }
	 */

}

class Overload1 extends Overload {
	@Override
	public void mk(A1 a1) {
		System.out.println("b1");
	}

	public static void main(String[] args) {
		Overload overload = new Overload1();
		A1 a1 = new A1();
		B1 b1 = new B1();
		A1 a12 = new B1();

		/*
		 * overload.mk(a1); overload.mk(b1); overload.mk(a12);
		 */
	}
}

class A1 {

}

class B1 extends A1 {

}
