package Test;





public class testThis {

	int x=10;
	
	public void m1(int x) {
		
		System.out.println("Method variable "+x);
		System.out.println("This keyword "+this.x);
		
	}
	
	
	public static void main(String[] args) {
		testThis th= new testThis();
		th.m1(30);
	}

}
