package LinkedLists;

import java.util.LinkedList;

public class linkedLists {

	public static void main(String arg[]) {
	LinkedList ll= new LinkedList<String>();
	ll.add("Car");
	ll.add("Jeep");
	ll.addFirst("Vechical");
	ll.addLast("Dont Buy");
	System.out.println(ll);
	System.out.println(ll.getFirst());
	System.out.println(ll.get(2));
	/*
	 * ll.remove(); ll.removeAll(ll);
	 * 
	 * ll.removeFirst();
	 */
	
	if(ll.contains("Dont Buy")){
		
		System.out.println(ll.indexOf("Dont Buy"));
	}
	}
}
