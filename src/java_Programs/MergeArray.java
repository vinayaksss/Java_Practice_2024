package java_Programs;

import java.util.Arrays;

import Test.Practies;

public class MergeArray {


		
static void merge(int c[],int a[],int b[]) {
	
	
	for(int i=0;i<a.length;i++) {
		
		c[i]=a[i];
	}
	
for(int i=0;i<b.length;i++) {
		
		c[i+a.length]=b[i];
	}

System.out.println("Before Sorting "+Arrays.toString(c));
		
	}


static void sort(int c[]) {
	//System.out.println(c.length);
	
	int n=c.length;
	
	for(int i=0;i<n-1;i++) {
		
		for(int j=0;j<n-1;j++){
			
			if(c[j]>c[j+1]) {
				
				int temp=c[j];
				c[j]=c[j+1];
				c[j+1]=temp;
			}
		}
	}
	System.out.println("After Sorting "+Arrays.toString(c));
}
	
public static void main(String arg[]) {
	int a[] = {1,2,5,7,9};
	int b[]={2,4,6,8};
	int c[]=new int[a.length+b.length];
	MergeArray.merge(c,a, b);
	MergeArray.sort(c);
	
	}

}
