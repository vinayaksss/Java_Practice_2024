package variables;

public class Variable {
String str="Non Static variable";//non static variable
 static int a=10;//class variable or instace variable 
	
	void m1(String name)//parameter variable
	{
		int a=10;//local variable
		System.out.println("Local Variable  "+a);
		System.out.println("parameter Variable  "+name);
	}
	
	
	public static void main(String[] args) {
		Variable lv= new Variable();
		System.out.println(lv.str);
		lv.m1("Parameter variable");
		System.out.println("static variable "+a);
		
	}

}
