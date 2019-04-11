package com.generic.bound;

import java.util.Arrays;

public class TestBound
{
	
}

class Calculator<T extends Number> {
	  T[] nums;/*from ww  w. ja v  a  2 s . c o m*/
	  Calculator(T[] o) {
	    nums = o;
	  }
	  double average() {
	    double sum = 0.0;
	    for (int i = 0; i < nums.length; i++){
	      sum += nums[i].doubleValue();
	    }
	    return sum / nums.length;
	  }
	}
	  class Main {
 static	  boolean sameAvg(Calculator<?> ob) {
	    if (1.2 == ob.average())
	      return true;
	    return false;
	  }

	  public static void main(String args[]) {
		  
		  Double[] doubles = {1.2d,3.4d};
		  Integer[] integers = {12,34};
		  String[]  strings  = {"s","b","c"};
		  Object[] objects = {new Object(),new Object()};
		  Calculator<? super Number> calculator = new  Calculator<Number>(integers);
		  System.out.println(calculator.average());
          boolean c = sameAvg(calculator);
          System.out.println(c);
		  
	  }
	}
	   class P
	   {
		   
	   }