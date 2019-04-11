package com.amc.newlyadde.iles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetTesting {

	public static void main(String[] args)
	{
		Integer i1 = new Integer(20);
		Integer i2 = new Integer(20);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		/*Map<Integer,Integer> mp = new HashMap<>();
		
		System.out.println(mp.put(2, 22));
		System.out.println(mp.put(2, 10));*/
		
   /*     Integer i= 1;
        Integer i1= 42;
        System.out.println(i1.compareTo(33));
//		System.out.println("Z".compareTo("A"));
		TreeSet<Emp> tr = new TreeSet<>();
		tr.add(new Emp("e2"));
		tr.add(new Emp("e1"));
		tr.add(new Emp("e3"));
		
		
		tr.forEach(x -> System.out.println(x.name));
		
		test();*/
	}

	private static void test() {
		List<Integer> ls = new ArrayList<>();
   
//		 Collections.synch
		
		/*ls.iterator();
		
		Stack<Integer> stack = new Stack<>();
		stack.push(3);
		stack.push(5);
		stack.push(7);
		System.out.println(stack.search(5));
		
		
		Vector v = new Vector();
		Iterator iterator = v.iterator();
		v.add("e");
		
		 Enumeration elements = v.elements();
		 while(elements.hasMoreElements())
		 {
			 Object nextElement = elements.nextElement();
		 }*/
		/*System.out.println(stack.push(7));
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);*/
		
		
		
		Set<Emp> set = new HashSet<>();
		
	/*	set.add("e");
		set.add("z");
		set.add("c");
		set.add("d");
		set.add("b");*/
		/*List<String> ls = new ArrayList<>();
		
		
        LinkedList<String> ln = new LinkedList<>();
        ln.add(2, "dd");
		*/
/*		set.add(new Emp("e"));
		set.add(new Emp("z"));
		set.add(new Emp("c"));
		set.add(new Emp("d"));
		set.add(new Emp("b"));
		*/
		
//		set.forEach(x -> System.out.println(name));
	}
}

class Emp implements Comparable
{
	String name;

	public Emp(String name1) {
		super();
		name = name1;
	}

	@Override
	public int compareTo(Object var1) {
		Emp emp = (Emp)var1;
		System.out.println("THIS "+this.name);
		System.out.println("emp "+emp.name);
		System.out.println(this.name.compareTo(emp.name));
		return this.name.compareTo(emp.name);
	}
	
}
