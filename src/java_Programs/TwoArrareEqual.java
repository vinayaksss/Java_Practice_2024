package java_Programs;

import java.util.Arrays;

public class TwoArrareEqual {

	
	static boolean areArraysEqual(int a[],int b[]) {
		
		
		if(a.length!=b.length) {
			
			return false;
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
	return Arrays.equals(a, b);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,3,2,4,7};
		int b[]= {4,5,1,2,3};
		System.out.println(areArraysEqual(a, b));
	}

}
