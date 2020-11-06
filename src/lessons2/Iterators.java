package lessons2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iterators {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		names.push("Ali");
		names.push("Abas");
		names.push("Fatah");
		
		Iterator<String> it = names.iterator();
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		// -----------LIST ITERATRO----------- 
		
		
		LinkedList<String> names1 = new LinkedList<String>();
		names1.push("Ali");
		names1.push("Abas");
		names1.push("Fatah");
		
		ListIterator<String> it1 = names1.listIterator();
		it1.next();
		it1.next();
		it1.add("aliao"); // aliao will be added to the after the two nexts
		
		for(String s: names1) {
			System.out.println(s);
		}
	
		
		
	}

}
