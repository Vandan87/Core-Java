package oopsconcept;

import java.util.*;
/* Program's aim is to add the values in list and remove duplicate values from this list. */
public class RemoveDuplicateValues {

	public static void main(String args[]) {
		List<String> alphabet = new ArrayList<>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		alphabet.add("A");
		alphabet.add("C");
		alphabet.add("E");
		alphabet.add("E");
		alphabet.add("F");
		List<String> uniqueList = removeDuplicates(alphabet);
		System.out.println("Alphabet : " + alphabet);
		System.out.println("List with removed duplicate alphabets : " + uniqueList);
	}
	public static List<String> removeDuplicates(List<String> list) {
		HashSet<String> hashSet = new HashSet<>(list);
		return new ArrayList<>(hashSet);
	}
	
}