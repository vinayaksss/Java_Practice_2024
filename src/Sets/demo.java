package Sets;

import java.util.HashMap;

public class demo {

	public static void main(String[] args) {
	
		
		String str="i am vinayak";
		
		char[] str1 = str.toCharArray();
		
		
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		
		for(int i=0;i<str1.length;i++) {
			
			char ch=str1[i];
		
		
		if(hm.containsKey(ch)) {
			
		hm.put(ch,hm.get(ch)+1)	;
		
		}
		else
		{
			
		hm.put(ch, 1);	
		}
		
		

	}
	
		System.out.println(hm);				
		
			}
	
			
			
			
		}
	

