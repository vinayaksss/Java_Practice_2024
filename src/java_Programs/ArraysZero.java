package java_Programs;

import java.util.Arrays;

public class ArraysZero {

	public static void main(String[] args) {
		
		//int array[]= {1,0,0,4};
		
		
		int array[]= {3,0,7,0,4,0};
		
		int n=array.length;
		int nz=0;
		
		for(int i=0;i<n;i++) {
			
			
			if(array[i]!=0) {
				
				int temp=array[i];
				
				array[i]=array[nz];
				
				array[nz]=temp;
				
				nz++;
				
				
				
			}
			
			
			
		}
		System.out.println(Arrays.toString(array));
		 
		
	}

}