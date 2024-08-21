package Test;

import java.util.HashMap;
import java.util.Map.Entry;

public class haspOpt implements hashOpeation{
	
	HashMap<String,Integer>hm=new HashMap<String,Integer>();
	int sum=0;
	
	
	@Override
	public void addDetails(String key, Integer value) {
		hm.put(key, value);
		for(Entry<String, Integer> hl:hm.entrySet()) {
			 sum=hl.getValue();
			 sum=sum+sum;
		}
		
	}

	@Override
	public String toString() {
		return "haspOpt [hm=" + hm + "]";
	}

	public static void main(String[] args) {
		haspOpt ho= new haspOpt();
		ho.addDetails("Vinayak", 23);
		ho.addDetails("Shruthi", 23);
		System.out.println(ho);
		
	}
	}

	


