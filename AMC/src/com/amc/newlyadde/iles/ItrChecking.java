package com.amc.newlyadde.iles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class ItrChecking {

	public static void main(String[] args)
	{
//		te();
		
		Properties properties = System.getProperties();
	
	/*	   for(Map.Entry eb : properties.entrySet() )
		   {
			   Object key = eb.getKey();
			   Object value = eb.getValue();
			   System.out.println(key + "-"+value);
		   }*/
		
		
		Set<Entry<Object, Object>> entrySet = properties.entrySet();
		Iterator<Entry<Object, Object>> iterator = entrySet.iterator();
			while(iterator.hasNext())
			{
				Entry<Object, Object> next = iterator.next();
				System.out.println(next.getKey()+"  @@  "+next.getValue());
				
			}
		
		
	}

	private static void te() {
		List<Integer> ls = new ArrayList<>();
		ls.add(2); ls.add(4);
		
		
		Iterator<Integer> iterator = ls.iterator();
		
		while(iterator.hasNext())
		{
			Integer next = iterator.next();
			System.out.println(next);
		}
	}
}
