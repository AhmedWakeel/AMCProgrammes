package com.generic.bound;

import java.util.List;

public class ClassCastChecking {

	ClA clA;	
	
	public void setA(ClA a) {
		System.out.println(a.getClass().getName());
		clA = a;
		System.out.println(clA.getClass().getName());
	}
	public ClA getA() {
		System.out.println(clA.getClass().getName());
		return clA;
	}
	public static void main(String[] args) {
		
		/*ClassCastChecking castChecking = new ClassCastChecking();
		castChecking.setA(new ClB());
		ClA a = castChecking.getA();
		System.out.println(a.getClass().getName());*/
		 C55< String> c55 = new C55<String>();
		new ClassCastChecking().<String>mk(c55);
		
	}
	
	public static double sum(List<? super Object> list){
		double sum = 0;
		for(Object n : list){
//			sum += n.doubleValue();
		}
		return sum;
	}
	
	public <T> boolean mk(C55<T> c55)
	{
		return true;
	}
}

class ClA
{
	int i = 34;
}

class ClB extends ClA
{
	int i = 340;
}

class C55<T>
{
	
}
