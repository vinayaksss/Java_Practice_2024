package java_Programs;

public class AlternatePattern {

	public static void main(String[] args) {
			
		String str="AABAAB";
		
		int deletions=0;
		
		for(int i=1;i<str.length();i++) {
			
			if(str.charAt(i)==str.charAt(i-1)) {
				deletions++;
				
				
			}
			
		}
		

		System.out.println(deletions);		
		
	}

}
