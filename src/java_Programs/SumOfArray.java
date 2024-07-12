package java_Programs;

public class SumOfArray {

	public static void main(String[] args) {
	
		int n=121;
		int rev=0;
		int temp=n;
		
		while(temp>0) {
			
			int lastdig=temp%10;
			rev=rev*10+lastdig;
			temp=temp/10;
			
		}
		
		System.out.println(rev);
		
	}

}
