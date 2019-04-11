package com.amc.newlyadde.iles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CountryName {

	  String name;

	public CountryName() {
		super();
	}

	public CountryName(String name) {
		super();
		this.name = name;
	}

	public List<CountryName> get() 
	{
		List<CountryName> ls = new ArrayList<>();
		
		ls.add(new CountryName("LANKA"));
		ls.add(new CountryName("CHINA"));
		ls.add(new CountryName("RUSSIA"));
		ls.add(new CountryName("US"));
		ls.add(new CountryName("INDIA"));
		
		return ls;
	}
}

class Main1 
{
	public static void main(String[] args)
	{
		CountryName countryName = new CountryName();
		List<CountryName> list = countryName.get();
		 ArrayList<CountryName> arrayList = new ArrayList<>();
		 
		 arrayList.add(null);
		 arrayList.add(null);
		 
		        Iterator<CountryName> iterator = list.iterator();
		        while(iterator.hasNext())
		        {
		        	CountryName next = iterator.next();
		        	
					 if(next.name.equals("US"))
					 {
						 arrayList.set(1,next);
						 iterator.remove();
					 }	
					 if(next.name.equals("INDIA"))
					 {
						 arrayList.set(0,next);
						 iterator.remove();
					 }
		        }
		 
		        arrayList.addAll(list);
		for(CountryName countryName2 : arrayList)
		{
           System.out.println(countryName2.name);	// [LANKA,CHINA,RUSSIA,INDIA,US]	want [INDIA,US,RUSSIA,LANKA,CHINA]	
		}
	}
}