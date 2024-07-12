package java_Programs;

public class LeaderElments {

	public static void main(String[] args) {
		
		int a[]= {8,11,5,11,7,6,3};
		int current_Leader=a[a.length-1];
		System.out.println("Current Leader = "+current_Leader);
		for(int i=a.length-2;i>0;i--) {
			if(a[i]>current_Leader) {
				current_Leader=a[i];
				System.out.println("Current Leader = "+current_Leader);
			}
			
		}
		
		/*
		 * int a[]= {8,11,5,11,7,6,3};
		 * 
		 * for(int i=0;i<a.length;i++) {
		 *  boolean leader=true; for(int
		 * j=i+1;j<a.length;j++) {
		 * 
		 * if(a[j]>=a[i]) {
		 * 
		 * //System.out.println(a[j]); leader=false; break; }
		 * 
		 * 
		 * }
		 * 
		 * if(leader==true) { System.out.println(a[i]); } }
		 */
	}

}
