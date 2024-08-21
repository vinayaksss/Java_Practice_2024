package java_Programs;

public class SlidingWindow {
	
	static void subArray(int a[],int k) {
		
		int wSum=0;
		int mSum=Integer.MIN_VALUE;
		
		for(int i=0;i<k;i++) {
			
			wSum=wSum+a[i];
		}
		
		
		 for(int i=k;i<a.length;i++) {
		System.out.println("K value is "+k);
		 System.out.println("A[i]"+a[i]);
		 System.out.println("wSum"+wSum);
		  wSum=wSum-a[i-k]+a[i]; 
		  mSum=Math.max(mSum, wSum); 
		 }
		 
		 System.out.println("max sum "+mSum);
		 
	}

	public static void main(String[] args) {
		
		
		int a[]= {2,9,31,-4,21,7};
		
		subArray(a, 3);
			}
			
			
		}
		
		
	


