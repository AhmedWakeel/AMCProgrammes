package com.generic.bound;

import java.lang.reflect.Method;

public class LangPackege {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class forName = Class.forName("java.lang.Object");
		        Method[] declaredMethods = forName.getDeclaredMethods();
		        
		        int count = 0;
		            for(Method method : declaredMethods)
		            {
		            	
		            }
		            System.out.println(count);
	}
}
