package com.generic.bound;

import java.util.ArrayList;
import java.util.List;

public class Test333<T> {

	  public void  mk(Test333<? extends Number> ls) {
		
		  
	}
	
	public static void main(String[] args) {
		
		Test333<? extends Number> test333 = new Test333<>();
		
		
		/*
		Object[] objects = new String[10];
		objects[0] = "fdf";
		objects[1] = 39;
		for(Object str : objects)
		{
		System.out.println(str);
		}
	*/
		B21 b21 = new B21();
		A21 a21 = new A21();
		
		a21 = (A21)b21;
//		b21 = (B21)a21;
		
		
	   List<B21> ls = new ArrayList<>();	
	   ls.add(new B21());
	   ls.add(new A21());
	}
}

class A21 extends B21
{
}

class B21
{
}
