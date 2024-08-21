package java_Programs;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,8,7,9,10};
		Arrays.sort(a);
		int key=5;
		boolean flag=false;
		int l=0;
		int h=a.length-1;
		
		while(l<=h) {
			
			int m=(l+h)/2;
			
			
			if(a[m]==key) {
				
				System.out.println("Element found ");
				flag=true;
				break;
			}
			
			if(a[m]<key) {
				
				l=m+1;
			}
			
			if(a[m]>key) {
				
				h=m-1;
			}
		}
		
	if(flag==false) {
		System.out.println("Elemets Not Found");
	}
	
	}

}
