package static_NonStatc;

public class ExStaticAndNonStatic {
	
	/*The static keyword is used to declare static variables, methods, and blocks. 
	It indicates that the member belongs to the class rather than instances of the class*/
	
	static String str;
	String str2;
	void m1() {
		
		str="";
		
		/*Non-static Method m1():

			This method m1() is declared without the static keyword, making it a non-static method.
			Non-static methods belong to the instance of the class, which means you need to create an object of the class to access and invoke these methods.
			In your code, st.m1(); creates an instance of ExStaticAndNonStatic and invokes the m1() method on that instance
		*/
	}
	
	static void m2() {
		//str2="";//Cannot make a static reference to the non-static field str2
		
		
		/*This method m2() is declared with the static keyword, making it a static method.
		Static methods belong to the class itself and can be directly accessed without creating an instance of the class.
		In your code, ExStaticAndNonStatic.m2(); directly calls the static method m2() 
		without needing to create an object of ExStaticAndNonStatic.*/
	}
	

	public static void main(String[] args) {
		ExStaticAndNonStatic.m2();
		ExStaticAndNonStatic st= new ExStaticAndNonStatic();
	st.m1();
	}

}
