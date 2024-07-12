package java_Programs;

import java.util.HashMap;

public class FrequencyInArray {

	public static void main(String[] args) {
	int a[]= {20,20,30,30,40,50,50,50};
	HashMap<Integer,Integer>hm= new HashMap<Integer,Integer>();
	for(int numbers:a) {
		
		if(hm.containsKey(numbers)) {
			
			hm.put(numbers, hm.get(numbers)+1);
			
		}
		else {
			
			hm.put(numbers, 1);
		}
		
	}
	System.out.println(hm);
		
	
	}

}
