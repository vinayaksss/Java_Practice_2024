package java_Programs;

public class Frequance {

	public static void main(String[] args) {
		int a[]= {20,20,30,30,40};
		
		int freq=1;
		int i=1;
		while(i<a.length) {
			
			while(i<a.length && a[i]==a[i-1]) {
				
				freq++;
				i++;
			}
			System.out.println(a[i-1]+" "+freq);
			freq=1;
			i++;
		}
		
		if(a[i-1]!=a[i-2]) {
			
				System.out.println(a[i-1]+" "+freq);
			}
			
		}
		
	
	
}