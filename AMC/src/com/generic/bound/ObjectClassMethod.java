package com.generic.bound;

public class ObjectClassMethod {
   
	   int i ;
	
	public ObjectClassMethod(int i) {
		this.i = i;
	}
	public ObjectClassMethod() {
		// TODO Auto-generated constructor stub
	}
	@Override
	   public int hashCode()
	   {
		   return i;
	   }
	
	public static void main(String[] args) {
		
		String string = new String("a");
		String string1 = new String("a");
		
		String string2 = "d";
		String string3 ="d";
		
		char[] ch = {'a','b'};
		String string4 = new String(ch);
		
		System.out.println(string==string1);
		System.out.println(string2==string3);
		
		
		
//		ObjectClassMethod classMethod = new ObjectClassMethod(10);
//		ObjectClassMethod classMethod1 = new ObjectClassMethod(100);
    
//		 System.out.println(classMethod+"         "+classMethod1);
		/*
		Bpp bpp = new Bpp();
		bpp.mk();*/
	/*	Aq aq = new  Aq();
		Bq bq = new Bq();
		Cq cq = new Cq();
		ObjectClassMethod objectClassMethod = new ObjectClassMethod();
		ObjectClassMethod objectClassMethod1 = new ObjectClassMethod();
		System.out.println(objectClassMethod.equals(23));*/
//		objectClassMethod.mk(cq);
	}
	private  void 	mk(Object object) {
		if (object instanceof Aq )
		{
			System.out.println("yes");
		}
	}
}
class Aq
{
}
class Bq extends Aq
{
}
class Cq extends Bq
{
}





class App
{
	
	public void  mk() {
		System.out.println("in mk of App");
		sk();
	}
	public void sk() {
      System.out.println("in sk method of App");		
	}
}
class Bpp extends App
{
	public void sk() {
	      System.out.println("in sk method of Bpp");		
		}
}
