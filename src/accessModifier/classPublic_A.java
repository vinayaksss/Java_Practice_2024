package accessModifier;

public class classPublic_A {//anywhere
	
	private void m1() {
		
		System.out.println("Only accessible within the same class");
	}
	
	void m2() {
		
		System.out.println("Accessible within the same package");
	}

	
protected  void m3() {
		
		System.out.println("Accessible within the same package and also in subclasses outside the package");
	}

public  void m4() {
	
	System.out.println("Public method can be acceassed from anywhere creating object");
}

}
