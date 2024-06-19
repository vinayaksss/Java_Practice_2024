package java_Programs;

public class missingNumber {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,5};
		int n=a.length+1;
		int sum=0;
		int expectedSum = n * (n + 1) / 2;
		
		//sysout
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
				
		}
		
		System.out.println(sum-expectedSum);
		
	}

}
