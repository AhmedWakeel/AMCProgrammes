package com.amc.newlyadde.iles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		
		
		 Stream<String> build = Stream.<String>builder().add("ad").add("ad1").build();
		 build.forEach(System.out::println);
		
		  Stream<String> limit = Stream.generate(() -> "Hello").limit(20);
		  limit.forEach(System.out::println);
		 
		     IntStream chars = "gg".chars();
		   Stream<Integer> iterate = Stream.iterate(20, x -> x+20);
		   iterate.forEach(System.out::println);
		
		
		/* List<String> ls = new ArrayList<>();
		   ls.add("ab3");
		   ls.add("ab2");*/
	 
		/*List<String> ls = new ArrayList<>();
		   ls.add("ab3");
		   ls.add("ab2");
		   ls.add("ab3");
		   ls.add("ab1");
		   
		   long count = ls.stream().distinct().distinct().distinct().count();		
		   System.out.println(count);*/
		   /*boolean anyMatch = ls.stream().allMatch(x ->
		   {
		     System.out.println(x);
		return   x.contains("ab");
		   }
				   );
		   System.out.println(anyMatch);
*/	}
}
