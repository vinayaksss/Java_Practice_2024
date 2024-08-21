package java_Programs;

public class numAmstrong {

public static void main(String[] args) {

int sum=0;
int rev=0;

int n=153;
int temp=n;


while(temp>0) {
	
	rev=temp%10;
	temp=temp/10;
	sum=sum+(rev*rev*rev);
}
	}

}
