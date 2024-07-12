package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class Practies {
public static void main(String arg[]) {
String str[]= {"Help","Help","Java","option","default","Help","Java"};
HashMap<String,Integer>hm= new HashMap<String,Integer>();

for(String ele:str) {
	
	if(hm.containsKey(ele)) {
		
		hm.put(ele, hm.get(ele)+1);
		
	}
	else
	{
		hm.put(ele, 1);
	}
}
System.out.println(hm);
	}


}
	
	
	
	

