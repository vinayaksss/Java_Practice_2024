package DSA;

public class MaxValueOfArray {

	public static void main(String[] args) {
		
		
		
		int a[]= {91,10,9,2,11,45};
		
		int max=0;
		int secondmax=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			
			
			if(a[i]>max) {
				
				//secondmax=max;
				max=a[i];
			
			}
			else if (a[i] > secondmax && a[i] != max) {
               
                secondmax = a[i];
            }
			
			
		}
		System.out.println(max+"  "+secondmax);
		
	}

}
