package Test;

import java.util.Random;

public class RandomNumberAndString {

	public static void main(String[] args) {
		
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder sb= new StringBuilder();
		
		Random random = new Random();
		int randomIntRange = (int) (Math.random() * 100);
        System.out.println("Random Integer (0-99): " + randomIntRange);
        
        int randomInt = random.nextInt();
        System.out.println("Random Integer: " + randomInt);
        
        //String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		//StringBuilder sb= new StringBuilder();       
        for(int i=0;i<10;i++) {
        	
        	int index=random.nextInt(str.length());
        	 sb.append(str.charAt(index));
        }
        
        System.out.println(sb+"@"+"."+"Com");
	}

}
