package oopsconcept;

import java.util.*;
/* Program's is define the use of Map. */
public class UseOfMap {
	
	public static void main(String args[]) {
		Map<Integer, String> names = new HashMap<>();
		names.put(1, "Hello");
		names.put(2, "World");
		names.put(3, "Vandan");
		Iterator<Map.Entry<Integer, String>> iterator = names.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key : " + key + " Value : " + value);
		}
	}
	
}