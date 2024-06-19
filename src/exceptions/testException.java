package exceptions;

public class testException {
	/*"Syntax error, insert 'Finally' to complete TryStatement" typically means that you have written a 
	try block without either a catch block or a finally block. In Java, a try block must be followed 
	by at least one catch block or a finally block. 
	The finally block is not mandatory if there is at least one catch block, and vice versa.*/

	public static void main(String[] args) {
		
	int result,a=10;
	try {
		
		result=a/0;
	}
	
	catch(NullPointerException e) {
		
	 e.printStackTrace();
	
	}
	catch(Exception er) {
		er.printStackTrace();
		System.out.println("This catched ");
	}
	/*catch(ArithmeticException at) {
		Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception*/
	}
		
	}
