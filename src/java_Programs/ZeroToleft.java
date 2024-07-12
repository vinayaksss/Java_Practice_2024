package java_Programs;

import java.util.Arrays;

public class ZeroToleft {

	public static void main(String[] args) {
	int array[]={3,6,0,7,0,8};
	
		if(array.length==1) {
			
			System.out.println(Arrays.toString(array));
		}
		
		int newarray[]=new int[array.length];
		int count=array.length-1;
		
		for(int number:array) {
			
			if(number!=0) {
				newarray[count]=number;
				count--;
			}
		}
		System.out.println(Arrays.toString(newarray));
		
	}

}
