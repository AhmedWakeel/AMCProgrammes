package com.multithreading;

public class ArrayChecking {

	public static void main(String[] args)
	{
		String[] str = {"hi how are you","what is this","where is this"};
		System.out.println(str.length);
		StringBuffer buffer = new StringBuffer();
		buffer.append(str[0]+" ");
		for(int i =1 ;i<str.length;i++)
		{
			buffer.append(str[i]+" ");
		}
		System.out.println(buffer);
	}
	private static final int i = 0;
	
}
