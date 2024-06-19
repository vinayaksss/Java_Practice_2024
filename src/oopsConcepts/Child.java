package oopsConcepts;

public class Child extends Supper{
	
	
void m1(int a, int b) {
		
		System.out.println(a-b);
		
		
	}


public static void main(String arg[]) {
	Child ch= new Child();
	ch.m1(23, 12);
	Supper sp= new Supper();
	sp.m1(23, 12);
}



}
