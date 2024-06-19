package Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {

		
		Set set= new HashSet<>();
		set.add("test");
		set.add("Execution");
		set.add("test");
		System.out.println("\n");
		Iterator it= set.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		

	}

}
