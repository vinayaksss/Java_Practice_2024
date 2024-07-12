package java_Programs;

import java.util.Arrays;

public class OccuranceofEachWord {

	public static void main(String[] args) {

		//int a[]= {2,4,5,4};
		
		
		String str="java c python java";
		String[] a=str.split(" ");
		for(int i=0;i<a.length;i++) {
			
			
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					//System.out.println(Arrays.deepToString(a[j]));
				}
				
			}
		}
		
	}

}
