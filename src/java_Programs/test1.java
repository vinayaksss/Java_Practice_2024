package java_Programs;

public class test1 {
	
	public static void main(String arg[]) {
	
	int arr[]= {2,3,4,5,6,3,2,5};
	
	
	int fist=arr[0];
	int last=arr[arr.length-1];
	//System.out.println("last "+fist);
	//System.out.println(arr.length);
	
	for(int i=0;i<arr.length;i++) {
		
	
		for(int j=i+1;j<arr.length;j++) {

			
			if(arr[i]==arr[j]) {
				
				System.out.println(arr[j]);
			}
		
	}
	}}
	
	

	
	}
	
	


