package com.amc.newlyadde.iles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortingTest {

	public static void main(String[] args)
	{
		List<String> ls = new ArrayList<>();
		
		ls.add("c");
		ls.add("b");
		ls.add("a");
		ls.add(null);
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
		
		TreeSet<String> st = new TreeSet<>();
		st.add("a");
		st.add("e");
		st.add("d");
		
	}
}
