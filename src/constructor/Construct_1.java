package constructor;

public class Construct_1 {
	int c;
	//Yes, constructors can be overloaded by defining multiple constructors with different parameter lists
	
	//Constructor does'n have return type
	Construct_1(int a, int b){
		this.c=a+b;
		System.out.println("I am default constructor"+c);
		
	}
	Construct_1(){
		//this.c=a+b;
		System.out.println("I am default constructor"+c);
		
	}
}
