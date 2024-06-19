package ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AList1 {

	public static void main(String[] args) {
		
	List<String> al= new ArrayList<String>();
	al.add("Apple");
	al.add("Car");
	al.add("Finish");
	
	System.out.println(al);
	
	
	for(int i=0;i<al.size();i++){
		System.out.println(al.get(i));
		
	}
	
	for(String all:al) {
		
		System.out.println(all);
			
	}
	
	Iterator it=al.iterator();
	while(it.hasNext()) {
		System.out.println("Iterator "+it.next());
	}
	
	
	//basic loop with Iterator
	
	for(Iterator itt=al.iterator();itt.hasNext();) {
		System.out.println("Basic loop with Iterator "+itt.next());
		
	}
		
		
	}

}
