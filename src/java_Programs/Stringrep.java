package java_Programs;

public class Stringrep {
public static void main(String[] args) {
		String str = "tests";
		for (int i = 0; i < str.length(); i++) {
		for (int j = i+1 ; j < str.length(); j++) {
						
				if (str.charAt(i)== str.charAt(j)) {

					System.out.println(str.charAt(j)+"");
					
				}

			}
		}

	}

}
