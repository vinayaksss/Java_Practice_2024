package keywords;

class C{
	
	int a=10;
	
	//using super keyword from constructor only we call super class constructor
	C(){
		System.out.println("\"C is Super Class constructor for A\"");
	}
	void m1() {
		System.out.println("Class C");
	}
	
}

class A{
	int a=30;
	
	A(){
		super();
		System.out.println("\"A is Super Class constructor for B\"");
	}
	
	
	void m2() {
		
		System.out.println("Class A");
	}
}


class B extends A{
	
	B()
	{
		super();//it 
		
	}
	
	
	void m3() {
		super.m2();//to call super call methods we need to extend the super calss 
		System.out.println("Class B");
		super.a=10;
	}
	
}


public class Super {

	public static void main(String[] args) {
	B b= new B();
	A a= new A();
	C c= new C();
	b.m3();
	

	}

}
