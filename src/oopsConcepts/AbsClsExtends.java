package oopsConcepts;

public class AbsClsExtends extends AbsClass {//to access abstract class methods extend the class 

	@Override
	void m1() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String arg[]) {
		
		//AbsClass cl= new AbsClass();
		
		AbsClsExtends cl= new AbsClsExtends();//create a object and access the methods
		cl.m1();
		cl.m2();
		
	}

}
