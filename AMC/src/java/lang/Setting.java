package java.lang;

public class Setting {

	String first_name;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public static void main(String[] args) {
		
		int  count = 0;
		for(int i = 0; i<10;i++)
		{
			count = count++;
		}
		System.out.println(count);
		
		
	}
}
