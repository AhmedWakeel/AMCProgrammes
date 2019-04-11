package com.amc.newlyadde.iles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CountryData {

	public String name;
	
	public CountryData(String name)
	{
		this.name = name;
	}

	@Override
	public String toString() {
		return "CountryData [name=" + name + "]";
	}
}

class Main 
{
	public static List<CountryData> get()
	{
		List<CountryData> ls = new ArrayList<>();
		
		ls.add(new CountryData("india"));
		ls.add(new CountryData("china"));
		ls.add(new CountryData("pakistan"));
		ls.add(new CountryData("lanka"));
		return ls;
	}
	public static void main(String[] args)
	{
		 long currentTimeMillis = System.currentTimeMillis();
		List<CountryData> list = get();  
		System.out.println(list);
		
		List<CountryData> ls = new ArrayList<>();
		
		Iterator<CountryData> iterator = list.iterator();
		while(iterator.hasNext())
		{
			
			CountryData next = iterator.next();
			
			if("lanka".equals(next.name) || "pakistan".equals(next.name) )
			{
				ls.add(next);
				iterator.remove();
			}
		}
		ls.addAll(list);
//		System.out.println(list);
		System.out.println(ls);
		System.out.println(System.currentTimeMillis()-currentTimeMillis+"ms");		
		
	}
} 

/*      
 * package com.amc.newlyadde.iles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CountryData {

	public String name;
	
	public CountryData(String name)
	{
		this.name = name;
	}

	@Override
	public String toString() {
		return "CountryData [name=" + name + "]";
	}
}

class Main 
{
	public static List<CountryData> get()
	{
		List<CountryData> ls = new ArrayList<>();
		
		ls.add(new CountryData("india"));
		ls.add(new CountryData("china"));
		ls.add(new CountryData("pakistan"));
		ls.add(new CountryData("lanka"));
		return ls;
	}
	public static void main(String[] args)
	{
		 long currentTimeMillis = System.currentTimeMillis();
		List<CountryData> list = get();  
		System.out.println(list);
		
		List<CountryData> ls = new ArrayList<>();
		
		Iterator<CountryData> iterator = list.iterator();
		while(iterator.hasNext())
		{
			
			CountryData next = iterator.next();
			
			if("lanka".equals(next.name) || "pakistan".equals(next.name) )
			{
				ls.add(next);
				iterator.remove();
			}
		}
		ls.addAll(list);
//		System.out.println(list);
		System.out.println(ls);
		System.out.println(System.currentTimeMillis()-currentTimeMillis);		
		
	}
} 
 *  
 *  */
