package keywords;

public class This {
	
	private static String name="vinayak";
	
	private This() {
		//this(20);
	}
	
	private This(int a) {
		this();
		System.out.println("A value is "+a);
		
	}
	//when we this keyword when we want to diff instance and method variable we call constructor
	
	public void m1(String name)
	
	
	{	
		name="Sonar";
		System.out.println("Name is "+name);
	}

	public static void main(String[] args) {
		This th= new This();
		th.m1(name);

	}

}
