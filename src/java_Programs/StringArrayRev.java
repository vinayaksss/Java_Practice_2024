package java_Programs;

import java.util.Arrays;

public class StringArrayRev {

	public static void main(String[] args) {
		
		
		String array[]= {"Arrays","Boolean","Character","Decimal"};
		
		int start=0;
		int end=array.length-1;
		
		while (start < end) {
			
			String temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			
			start++;
			end--;
			
			
			
		}
		System.out.println(Arrays.toString(array));
	}

}
