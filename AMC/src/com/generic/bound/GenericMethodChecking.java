package com.generic.bound;

public class GenericMethodChecking<T> {

	public  <T> Object[] name(T t) {
		
		return new Integer[]{10,22,22};
		
	}
	
	public static void main(String[] args) {
		
		GenericMethodChecking<String> checking = new GenericMethodChecking<>();
	        Object[] name = checking.name("sa");	
	}
}

class A31
{
	
	public A31 mk(A31 a31) {
		System.out.println(a31.getClass().getName());
		return a31;
	}
}

class B31 extends A31
{
	
	public static void main(String[] args) {
		
		A31 a31 = new A31();
		B31 b31 = new B31();
		
		A31 mk = a31.mk(b31);
		System.out.println(mk.getClass().getName());
		
		
		
	}
}