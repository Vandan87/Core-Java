package oopsconcept;

import java.util.*;
/* Program's is define the use of Set. */
public class UseOfSet {

	public static void main(String args[]) {
		Set<String> names = new HashSet<>();
		names.add("Hello");
		names.add("World");
		names.add("Vandan");
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String result = iterator.next();
			System.out.println(result);
		}
	}

}