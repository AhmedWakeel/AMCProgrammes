package com.overloading;

  class ClassTest {

	  void ClassTest()
	  {
		  System.out.println("constructor is called");
	  }
	  
	public void mk()
	{
	 	int i = 40;
	}
	
	/*public static void main(String[] args) {
		System.out.println("in the parent static method of CLassTest");
	}*/
}

 class ClassTest1 extends ClassTest {

	public void mk1()
	{
		  int i1 =39;
	 	int i = 40;
	}
	
	public static void main(String[] args) {
		
		ClassTest classTest = new ClassTest();
		
	}
}
