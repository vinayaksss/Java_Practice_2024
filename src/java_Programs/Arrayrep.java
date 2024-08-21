package java_Programs;

public class Arrayrep {

	public static void main(String[] args) {
		
		
		int a[]= {1,3,4,3,5,6,1,6};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println(a[j]);
					
				}
			}
		}

	}

}
