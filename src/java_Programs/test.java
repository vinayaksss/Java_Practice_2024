package java_Programs;

public class test {
	
	public static void main(String arg[]) {
		
	String str="Vinayak Sonar";
	StringBuilder sb= new StringBuilder();
	
	
	for(int i=0;i<str.length();i++) {
		int count=0;
		
		for(int j=0;j<str.length();j++) {
			
			if(str.charAt(i)==str.charAt(j)) {
				
				count++;
			}
		}
		
		if(count<2) {
			
				sb.append(str.charAt(i));
			
		}
	}
	
	System.out.println(sb);
		}

}
