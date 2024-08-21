package keywords;

public class This {
	int n=0;//this keyword always points instance variable 
	//this keyword used to cll the constructor 
	//To pass current object as a parameter
	private static String name="vinayak";
	
	private This() {
		//this(20);
	}
	
	private This(int a) {
		this();
		this.n=10;
		System.out.println("A value is "+a);
		
	}
	//when we this keyword when we want to diff instance and method variable we call constructor
	
	public void m1(String name)
	
	
	{	
		name="Sonar";
		System.out.println("Name is using this "+name);
	}

	public static void main(String[] args) {
		This th= new This();
		th.m1(name);

	}

}
