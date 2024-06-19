package java_Programs;

public class Stringrep {

	public static void main(String[] args) {

		String str = "Tests";

		char[] ch = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println("i value "+i+" "+ch[i]);

			for (int j = i+1 ; j < str.length(); j++) {
			
				
				System.out.println("J value "+j+" "+ch[j]);
				
				if (ch[i] == ch[j]) {

					System.out.println(ch[j]+"");
					break;
				}

			}
		}

	}

}
