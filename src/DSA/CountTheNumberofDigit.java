package DSA;

public class CountTheNumberofDigit {

	/*public static void main(String[] args) {
		
		int n=1;
		
		String str=String.valueOf(n);
		
System.out.println(str.length());
	}

}*/
	public static void main(String[] args) {
		
		int n=123454;
		int count=0;
		
		while(n>0) {
			
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
	}