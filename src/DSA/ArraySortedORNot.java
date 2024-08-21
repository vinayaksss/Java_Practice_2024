package DSA;

public class ArraySortedORNot {
	
static boolean sortedOrNot(int a[]) {
	
for(int i=1;i<a.length;i++) {
	
			if(a[i]<a[i-1]) {
		
			return false;
			}
			
		}
		return true;
}
	public static void main(String[] args) {
	int a[]= {2,5,6,8,10};
	System.out.println(sortedOrNot(a));
		}
}
