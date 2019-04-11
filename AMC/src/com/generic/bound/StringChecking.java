package com.generic.bound;

import java.util.stream.IntStream;

public class StringChecking {
 
	final StringChecking  checking;
	 int k = 45;
	 
	 public StringChecking(StringChecking checking) {
		 
		 this.checking = checking;
	}
    public StringChecking() {
    	this.checking = new StringChecking(); 
	}	 
    public void mk()
	{
    	
      final int  m = 34;
       System.out.println(m);

		final String s = "ss";
		 System.out.println(s);
	}


	public static void main(String[] args) {

		StringChecking  checking = new StringChecking(new StringChecking());  
		
		IntStream chars = "ww".chars();		
	final	StringBuffer buffer = new StringBuffer("aa");
		     buffer.append("bb");
		     System.out.println(buffer);
		     
//		  buffer = new StringBuffer();   
		final   String s = new String("ab");
//		   s = s.concat("d");
		     
		
        /*new StringChecking().mk();

		String  s1 = new String("xyz");
		String  s2 = s1.toUpperCase();
		String  s3 = s2.toLowerCase();
		
		String s4 = s1.concat("");
		String s5 = s1+"";

		System.out.println(s5);
		System.out.println(s1==s4);
		System.out.println(s1==s5);
*/		
	}
}
