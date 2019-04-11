package com.overloading;

public abstract class OverridingChecking {
	public static void main(String[] args) {

		M2 m2 = new M2();
		M1 m1 = new M1();
		M1 m12 = new M2();
		m2.ss(30);
		m1.ss(30);
		m12.ss(30);
	}

}

abstract class A2 {
	public void mk() {
	}

	abstract void mk1();
}

abstract class B2 extends A2 {
	@Override
	abstract void mk1();

	public final void mk() {

	}
}

class M1 {
	public void ss(int... i) {
		System.out.println("in args");
	}
}

class M2 extends M1 {
	public void ss(int i) {
		System.out.println("in int");
	}
}
