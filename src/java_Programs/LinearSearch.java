package java_Programs;

public class LinearSearch {

	public static void main(String[] args) {
		
		
		int a[]= {45,67,89,90};
		int num=890;
		boolean flag=false;
		for(int i=0;i<a.length;i++) 
		{
			
			if(num==a[i]) {
				
				flag=true;
				break;
			}
							
		}
		
		if(flag==true) {
			System.out.println("Found in Given Array "+num);
		}
		else {
			
			System.err.println("Not Found");
		}

	}

}
