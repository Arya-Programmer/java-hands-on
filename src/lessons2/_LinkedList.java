package lessons2;

import java.util.LinkedList;

public class _LinkedList {

	public static void main(String[] args) {
		// this is queue 
		// first in first out - FIFO
		LinkedList<String> name = new LinkedList<String>();
		name.add("ali");
		name.add("abas");
		name.add("fatah");
		
		System.out.println(name.remove());
		System.out.println(name.remove());
		System.out.println(name.remove());
		
		
		
		// this is a stack
		// first in last out - FILO
		LinkedList<String> stack = new LinkedList<String>();
		stack.push("ali");
		stack.push("abas");
		stack.push("fatah");
		
		System.out.println(stack.pop());
		System.out.println(stack.removeFirst());
		System.out.println(stack.remove());

	}

}
