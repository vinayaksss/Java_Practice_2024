package java_Programs;

public class missingNumber {

	public static void main(String[] args) {
		
		int a[]= {11,12,13,15};
		int n=a.length+1;
		System.out.println(n);
		int sum=0;
		int expectedSum = n * (n + 1) / 2; 
		
		//sysout
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
				
		}
		
		System.out.println(sum-expectedSum);
		
	}

}
