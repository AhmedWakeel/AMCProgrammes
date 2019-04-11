package com.amc.newlyadde.iles;

import java.util.ArrayList;
import java.util.TreeSet;

public class MapCheck {

	public static void main(String[] args)
	{
/*//		HashMap<Integer, String> hm = new HashMap<>();
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
		
		hm.put(8, "A");
		hm.put(3, "C");
		hm.put(2, "D");
		System.out.println(hm);*/
		
	/*	LinkedHashSet<String> ls = new LinkedHashSet<>();
//		HashSet<String> ls = new HashSet<>();
		ls.add("c");
		ls.add("b");
		System.out.println(ls);*/
		
		/*HashSet<Empp> ls1 = new HashSet<>();
		ls1.add(new Empp("c", 4));
		ls1.add(new Empp("a", 2));
		System.out.println(ls1);*/
		
	/*	Hashtable<Integer,String>  ht = new Hashtable<>();
		HashMap<Integer,String>  hm = new HashMap<>();
		hm.put(null, null);
		hm.put(null, null);*/
//		ht.put(null, null);
		
		
		ArrayList<Empp> ar = new ArrayList<>();
		ar.add(new Empp("c", 4));
		ar.add(new Empp("a", 2));
		
		TreeSet<Empp> tt = new TreeSet<>(ar);
		System.out.println(tt);
	}
}
class Empp
{
	String name;
	Integer id;
	public Empp(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", id=" + id + "]";
	}
	
	
	
}
