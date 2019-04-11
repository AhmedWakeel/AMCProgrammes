package com.generic.bound;

public class GenericMethod extends Emp {

	public  <U> void mk(U u) {
	
		U t = u;
		
	}
	
	public static void main(String[] args) {
		
	}
}
class Emp
{
}
class A333<T> extends Emp implements Comparable<T>
 {

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}