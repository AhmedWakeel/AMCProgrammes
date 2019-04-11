package com.amc.newlyadde.iles;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Encod {

	public static void main(String[] args) throws UnsupportedEncodingException
	{
         String str = "changing the UR";
         String encodeToString = Base64.getEncoder().encodeToString(str.getBytes("UTF-8"));
         System.out.println(encodeToString);
         
         byte[] decode = Base64.getDecoder().decode(encodeToString);
         String string = new String(decode);
         System.out.println(string);
         
	}
	
}
