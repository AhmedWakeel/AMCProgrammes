package com.overloading;

public class CovariantType {

	public Object mk(int i) {
		return null;
	}

	public float mk(float i) {
		return 0;
	}
	private Object sk()
	{
		System.out.println("in the parent of sk");
		return null;
	}
}

class CovariantType1 extends CovariantType {
	public String mk(int i) {
		return null;
	}
	private String sk()
	{
		System.out.println("in the child of sk");
		return null;
	}
	public static void main(String[] args) {
		
		CovariantType covariantType = new CovariantType1();
//		covariantType.sk();
		CovariantType1 covariantType2 = new CovariantType1();
		covariantType2.sk();
	}
}