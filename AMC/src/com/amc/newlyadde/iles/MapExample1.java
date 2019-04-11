package com.amc.newlyadde.iles;

import java.util.*;
import java.util.Map.Entry;  
public class MapExample1 {  
public static void main(String[] args) {  
  /*  Map map=new HashMap();  
    //Adding elements to map  
    map.put(1,"Amit");  
    map.put(5,"Rahul");  
    map.put(2,"Jai");  
    map.put(6,"Amit");  
    //Traversing Map  
    Set set=map.entrySet();//Converting to Set so that we can traverse  
    Iterator itr=set.iterator();  
    while(itr.hasNext()){  
        //Converting to Map.Entry so that we can get key and value separately  
        Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());  
    }  
    
    for(Object entry :  map.entrySet())
    {
    	Map.Entry entry2 = (Map.Entry)entry;
    	System.out.println(entry2.getKey()+" "+entry2.getValue());
    }*/
	
	  Map<Integer,String> map=new HashMap<Integer,String>();  
	  map.put(100,"Amit");  
	  map.put(101,"Vijay");  
	  map.put(102,"Rahul");
	  
	  Set<Entry<Integer, String>> entrySet = map.entrySet();
	  Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
	  while(iterator.hasNext())
	  {
		  Entry<Integer, String> next = iterator.next();
		  System.out.println(next.getKey()+" "+next.getValue());
	  }
}  
}  