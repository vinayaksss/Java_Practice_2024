package oopsConcepts;

public class OverloadExa {

	void m1(int a) {

		System.out.println("Method m1 in OverloadingExample");

	}

	void m1(String a) {

		System.out.println("Method m2 in OverloadingExample");

	}

	class a extends OverloadExa {

		void m1(int a) {

			System.out.println("Method m1 in Overriding ");

		}

	}

	public static void main(String[] arg) {

			OverloadExa aa = new OverloadExa();
			aa.m1(10);
			aa.m1("Vinayak");
			
			

		}
	

}
