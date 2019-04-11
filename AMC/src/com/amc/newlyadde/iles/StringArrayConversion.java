package com.amc.newlyadde.iles;

public class StringArrayConversion {

	public static void main(String[] args)
	{

		String s = "2Ã¢Â€Â x 3Ã¢Â€Â x 23.25Ã¢Â€Â  4140 STEEL BAR PER  ASTM-A29";
		System.out.println(s.replaceAll("â", "\""));
		
		System.out.println("â".equals("â"));
		/*String s2 = "hi how hi there is hi";
//		char[] split = s2.toCharArray();
		String[] split = s2.split("\\s");
		for(String s : split)
		{
			System.out.println(s);
		}*/
	}
}
