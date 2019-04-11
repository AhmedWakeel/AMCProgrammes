package com.generic.bound;

import java.util.ArrayList;
import java.util.List;

public class Test33 {

	public static void main(String[] args) {
		
	/*	Object[] objects = new Object[10];
		objects[0] = "hi";
		objects[1] = 10;
		
		List<?> list = new ArrayList<>();*/
//		list.add(3);
		
	}
}

class A3
{
}

class B3 extends A3
{
}

class C3
{
	A3 mk()
	{
		System.out.println("in C3 A3");
		return new A3();
	}
}
class D3 extends C3
{
	@Override
	B3 mk()
	{
		System.out.println("in D3 B3");
		return new B3();
	}
}
class D4
{
	
}
