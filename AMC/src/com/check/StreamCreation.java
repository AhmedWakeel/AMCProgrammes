package com.check;

import java.lang.String;
import java.lang.System;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
  
		/*Stream str = Stream.of(1,2,3);
		             
		Stream str2= str;
		System.out.println(str);
		
		str.forEach(System.out::print);
		str2.forEach(System.out::print);
//		System.out.println(str2);
*/		
		
		 List<String> list = Arrays.asList("232bcc","B","Cfdf3","D");
		 
		    Optional<String> result = list.parallelStream().findAny();
		    
		    if(result.isPresent())
		    {
		    	System.out.println(result.get());	
		    }
		
	}

}
