package java_Programs;

public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Beautifull Beach in Gokarna";
		String[] ch=str.split(" ");
		String longest="";
		
		for(String word:ch) {
			
			if(word.length()>longest.length()) {
				longest=word;
			}
		}
		System.out.println("Longest Word in String is=="+longest);

	}

}
