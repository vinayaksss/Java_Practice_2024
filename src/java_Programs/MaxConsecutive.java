package java_Programs;

public class MaxConsecutive {

	public static void main(String[] args) {
	int a[]= {0,0,1,1,0,1,0,1,1,1,1,0,0,0};
		int count=0;
		int maxcount=0;
		for(int i=0;i<a.length;i++) {

if(a[i]==0) {
	
	count=0;
}
else
{
	count++;
	maxcount=Math.max(count, maxcount);
}
		
	}
		
		System.out.println(maxcount);	
}}

