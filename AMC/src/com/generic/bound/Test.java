package com.generic.bound;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		 
	/*	A a = new A();
		B b = new B();*/
		
//		a = (A)b;
//		b = (B)a;
//		a = (A) b;
		
		A a = new B();   //B type is auto up casted to A type
		System.out.println(a.getClass().getName());
        B b = (B) a;     //A type is explicitly down casted to B type.
        System.out.println(b.getClass().getName());
        C c = (C) b;
		/*Test deliveryAddress = new Test();

		String substring = deliveryAddress.getPhone1().substring(deliveryAddress.getPhone1().indexOf(" ") + 1);
		System.out.println(substring);
		
		
		deliveryAddress.getPhone1().substring(deliveryAddress.getPhone1().indexOf(" ")+1);
		System.out.println(deliveryAddress.getPhone1().substring(deliveryAddress.getPhone1().indexOf(" ")+ 1 ));*/
		

		/*String s = "+52 998894";
		System.out.println(s.length());
		String substring = s.substring(s.indexOf(" ")+1);
		System.out.println(substring);
		System.out.println(substring.length());*/
	}
	
	public  String getPhone1() {
		
		return "+52 998 894 4101";
	}
}
class A 
{
}
class B extends A
{
}
class C extends B
{
}
