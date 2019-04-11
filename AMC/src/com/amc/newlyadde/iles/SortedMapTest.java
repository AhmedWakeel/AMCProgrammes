package com.amc.newlyadde.iles;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class SortedMapTest {

	public static void main(String[] args) {
		
/*		HashSet<Checking> hs = new HashSet<>();
		
		hs.add(new Checking("A", 1));
		hs.add(new Checking("A", 1));
		System.out.println(hs.size());
*/		
		
/*		HashMap<Checking,Integer> hm = new HashMap<>();
		
		hm.put(new Checking("A", 1), 20);
		hm.put(new Checking("A", 1), 10);
		System.out.println(hm.size());
		System.out.println(hm.get(new Checking("A", 1)));
*/
//        IdentityHashMap<Checking, Integer> hm = new IdentityHashMap<>();
//          IdentityHashMap<Integer, String> hm = new IdentityHashMap<>();
	    	IdentityHashMap hm = new IdentityHashMap();
        
          Integer i1 = new Integer(10);
          Integer i2 = new Integer(10);
          
          hm.put(i1, "A");
          hm.put(i2, "A");
          System.out.println(i1.equals(i2));
          System.out.println(hm.size()); 
          System.out.println(hm);
        
        /*hm.put(new Checking("A", 1), 20);
		hm.put(new Checking("A", 1), 10);
		System.out.println(hm.size());*/
//		System.out.println(hm.get(new Checking("A", 1)));
		
		
		/*SortedMap<Integer, String> sp = new TreeMap<>();
		sp.put(10, "A");
		sp.put(11, "B");
		sp.put(12, "C");
		sp.put(13, "D");
		sp.put(14, "F");
		sp.put(15, "G");

		// System.out.println(sp.headMap(12)); //{10=A, 11=B}
		System.out.println(sp.tailMap(11)); // {11=B, 12=C, 13=D, 14=F, 15=G}
		
		 * System.out.println(sp.firstKey()); System.out.println(sp.lastKey());
		 
		System.out.println(sp.subMap(11, 19)); // {11=B, 12=C, 13=D}
		// System.out.println(sp.comparator());
*/
	}
}

class Checking {
	String name;
	Integer id;

	public Checking(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public boolean equals(Object obj)
	{
		Checking checking = (Checking)obj;
		System.out.println(this.name);
		System.out.println(checking.name);
		
		return this.name.equals(checking.name);
	}

}
