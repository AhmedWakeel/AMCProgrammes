package com.amc.newlyadde.iles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BinarySearchChecking {

	public static void main(String[] args)
	{
		ArrayList<Integer> ls = new ArrayList<>();
		
		ls.add(10);
		ls.add(9);
		ls.add(8);
		ls.add(3);
		ls.add(15);
		
//		Collections.sort(ls);
		System.out.println(ls);
		
		System.out.println(Collections.binarySearch(ls, 3,new Sorting()));
		
		Collections.sort(ls);
		System.out.println(ls);
		
	}
}
class Sorting implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i2-i1;
	}
}
