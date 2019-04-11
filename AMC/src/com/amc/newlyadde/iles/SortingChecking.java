package com.amc.newlyadde.iles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingChecking {

	public static void main(String[] args)
	{
		ArrayList<String> ar =  new ArrayList<>();
		ar.add("d");
		ar.add("c");
		ar.add("a");
		ar.add("k");
		ar.add("o");
//		Collections.sort(ar,new MyComparator());
		System.out.println(ar);
		System.out.println(Collections.binarySearch(ar, "d"));
		System.out.println(Collections.binarySearch(ar, "b"));
		System.out.println(Collections.binarySearch(ar, "b"));
//		Collections.reverse(ar);
		Collections.sort(ar, new MyComparator());
		System.out.println(ar);
		Comparator<Object> reverseOrder = Collections.reverseOrder(new MyComparator());
		Collections.sort(ar, reverseOrder);
		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println(ar);
	}
}

class MyComparator implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		String i1 = (String)o1;
		String i2 = (String)o2;
		return -(i1.compareTo(i2));
	}
	
}