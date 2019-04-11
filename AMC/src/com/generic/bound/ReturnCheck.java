package com.generic.bound;

import java.lang.String;

public class ReturnCheck {

	public static C1 mk() {
		return new B1();
//		return (B1) new A1();
		
	}
	
	public static void main(String[] args) {
		
		mk();
	}
}

class A1
{
	
}
class B1  extends A1 implements C1
{
	
}

interface C1
{
	
}
/*class D1 extends B1 implements C1
{
	
}
*/