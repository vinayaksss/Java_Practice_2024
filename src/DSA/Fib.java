package DSA;

public class Fib {

	public static void main(String[] args) {
//0,1,2,3,4
int n=0;
int n1=1;

for(int i=0;i<5;i++) {
	
	int sum =n+n1;
	n=n1;
	n1=sum;
	System.out.println(sum);
}
		
		
		
	}

}
