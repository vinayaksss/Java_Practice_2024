package java_Programs;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		int a[]= {34,56,3,5,7};
		
		System.out.println("Array Befor Sorting "+Arrays.toString(a));
		int n=a.length;
		
		
		for(int i=0;i<n-1;i++) {//number of passes which is n-1
			
			for(int j=0;j<n-1;j++){//for swaping which n-1 times
				//swaping code
				if(a[j]>a[j+1]) {
					
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
									
				}
			}
		}
		
		System.out.println("Array After Sorting "+Arrays.toString(a));

	}

}
