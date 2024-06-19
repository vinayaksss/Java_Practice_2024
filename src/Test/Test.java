package Test;

import java.util.Arrays;
import java.util.HashMap;

import collections.Array;

public class Test {

public static void main(String[] args) {
	
	String str="testing is what i like";
	
	
	char ch[]=str.toCharArray();
	
	HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
	
	for(int i=0;i<ch.length;i++) {
		char charh=ch[i];
		
		
		if(hm.containsKey(charh)) {
			
			hm.put(charh, hm.get(charh)+1);
			
		}
		
		else {
			
			hm.put(charh, 1);
			
		}
		
		
	}
	
	for(HashMap.Entry<Character,Integer>entry:hm.entrySet()) {

		if(entry.getValue()>1) {
			
			System.out.println(entry.getKey()+"::"+ entry.getValue());
		}
	}
	
	
	
}

}
