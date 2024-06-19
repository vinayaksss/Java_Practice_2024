package HashMap;

import java.util.HashMap;

public class duplicatechar {

	public static void main(String[] args) {
		
		
		String str="Vinayaksn";
		
		HashMap<Character,Integer>hm= new HashMap<Character,Integer>();
		char[] charray=str.toCharArray();
		
		for(int i=0;i<charray.length;i++) {
			
			char ch = charray[i];
	  if(hm.containsKey(ch)){
		  
		  hm.put(ch,hm.get(ch)+1);
		  
	  }
	  else {
		  
		  hm.put(ch, 1);
	  }
	 
     

	}
		 for (HashMap.Entry<Character, Integer> entry : hm.entrySet()) {
	          if (entry.getValue() > 1) {
	              System.out.println(entry.getKey() + " : " + entry.getValue());
	          }
	      }
		
	}
}
