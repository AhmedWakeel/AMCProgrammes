package com.generic.bound;

import java.util.ArrayList;
import java.util.List;

public class GenChecking {

	static void printListItems2(List<? super Integer> list){
	    for (Object num : list){
	        System.out.println(num);
	    }
	}
	
	public static void main(String[] args) {
		
		List<Number> doubles = new ArrayList<>();
		doubles.add(23.3d);
		
		printListItems2(doubles);
		
	}
}
