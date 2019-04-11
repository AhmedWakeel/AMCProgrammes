package java.util;

public class CollectionTest<E extends Object> {
	
	
	NavigableMap<E,Object> m = new TreeMap<E,Object>();
	
	@SuppressWarnings("unchecked")
	NavigableMap<E,Object> m1 = new TreeMap<>(new X());

	NavigableMap<E, Object> map ;
	static NavigableMap<String,Object> map2 = new TreeMap<>();
	
	TreeSet<E> es = (TreeSet<E>) new TreeSet<>(new X<String>());
	
	static TreeSet<String> set = new TreeSet<String>(map2);
	
	public CollectionTest() {
		this(new TreeMap<E,Object>());
	}
	
	CollectionTest(NavigableMap<E, Object> map)
	{
		this.map = map;
	}
	
	public static void main(String[] args)
	{
		System.out.println(map2.hashCode());
		
	}
}

class X<Ex> implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}