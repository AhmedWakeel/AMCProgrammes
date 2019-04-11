package com.check;

import java.io.IOException;

public class ClassChecking {

	  ClassChecking() {
		System.out.println("in the constructor");
	}
	
   public static void main(String[] args) {
	ClassChecking checking = new ClassChecking();
	checking.m1(23,33);
}
   public 	void m1(int... is)
	{
		System.out.println("in the var arg");
	}
   public 	void m1(int i,int k)
	{
		System.out.println("in doublie int method");
	}
}

class A1 
{
	 A1() throws IOException
	{
//		 this(38);
		System.out.println("in the constructor A1");
	}
	 A1(int i) throws IOException
	{
//		 this();
		System.out.println("in the constructor A1");
	}
	 public static void mk()
	 {
		 mk();
		 System.out.println("in the mk metod");
	 }
	 public void mk1()
	 {
		 System.out.println("in the mk method of the system which makes the life in the things which makes in the life in the system i have many");
	 }
	 
	 public static void main(String[] args)
	 {
		 mk();
	 }
	 
}
class B1 extends A1
{

	B1() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
