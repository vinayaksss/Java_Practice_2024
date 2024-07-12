
public class demo {

	public static void main(String[] args) {


		/*A
		A B
		A B C 
		A B C D*/
		char c='A';
		
		for(int i=1;i<5;i++) {
						
			for(int j=1;j<=i;j++) {
				
				System.out.print(c++);
				
			}
		System.out.println();
		c='A';
		}

	}

}
