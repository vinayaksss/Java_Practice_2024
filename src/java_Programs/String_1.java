package java_Programs;

public class String_1 {

	public static void main(String[] args) {
		
		
		String str="A1B2C3D4";
		int count=0;
		StringBuffer letter=new StringBuffer();
		StringBuffer dig=new StringBuffer();
		
		for(int i=0;i<str.length();i++){
			
			char ch=str.charAt(i);
			
		if(Character.isLetter(ch)) {
			
			letter.append(ch);
			count++;
		}
		
		else if(Character.isDigit(ch)) {
			
			dig.append(ch);
		}
		
			
			
		}
	
		System.out.println(count);
		System.out.println(letter+""+dig);

	}

}
