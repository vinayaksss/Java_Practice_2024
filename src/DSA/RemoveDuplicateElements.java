package DSA;

import java.util.Arrays;

public class RemoveDuplicateElements {
		public static void main(String[] args) {
		int a[]= {1,2,2,3,3,4,5,};
		int rd=0;
		for(int i=1;i<a.length;i++) {
								
			if(a[rd]!=a[i]) {
				rd++;
				a[rd]=a[i];
				
			}
			
		}
		for(int i=0;i<rd;i++) {
		System.out.print(a[i]);
		}
	}
}
