package constructor;

public class Constructor_4 {
	
	String name;
	int age;
	
	Constructor_4(){
		name="vinayak";
		age=21;
		
	}

	
	Constructor_4(String str,int age){
		System.out.println(age);
		
	}
	public static void main(String[] args) {
		
		Constructor_4 cl= new Constructor_4();
		System.out.println(cl.age);
		Constructor_4 cls= new Constructor_4("vinayak",24);
	}

}
