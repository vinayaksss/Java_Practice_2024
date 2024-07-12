package java_Programs;

public class ReverseEachWord {

	public static void main(String[] args) {
	
		String str="Java is very Hard";
		
		String[] words=str.split(" ");
		String ReverseString="";
		
		
		for(int i=0;i<words.length;i++) {
			
			String word=words[i];
			String revWord="";
			
			for(int j=word.length()-1;j>=0;j--) {
				
				revWord=revWord+word.charAt(j);
			}
			ReverseString=ReverseString+revWord+" ";
			
		
	}
		System.out.println(ReverseString);
	}
}
