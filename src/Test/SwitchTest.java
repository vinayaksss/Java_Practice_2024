package Test;

import java.util.Scanner;

public class SwitchTest {

public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Monthe");
		String month=scanner.nextLine();		
				
		switch(month) {
		case "jan":
			System.out.println("Happy New Year");
			break;
		case "feb":
			System.out.println("Year End");
			break;
		default:
			System.out.println("No month");
			break;
			
		}
		

	}

}
