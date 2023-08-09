package oopsconcept;

import java.util.*;
/* Program's is define the use of List. */
public class UseOfList {
	
	public static void main(String args[]) {
		List<String> names = new ArrayList<>();
		names.add("Hello");
		names.add("World");
		names.add("Vandan");
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println(value);
		}
	}
	
}