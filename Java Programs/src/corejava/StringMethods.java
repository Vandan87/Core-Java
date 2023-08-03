package corejava;

/* Java program to demonstrate use of string methods */

public class StringMethods {

	public static void main(String args[]) {
		
		String word = "Vandan";
		System.out.println(word.toUpperCase()); // VANDAN
		System.out.println(word.toLowerCase()); // vandan

		System.out.println(word.charAt(2)); // n
		System.out.println(word.charAt(4)); // a

		System.out.println(word.length()); // 6

		System.out.println(word.startsWith("Va")); // true
		System.out.println(word.endsWith("a")); // false

		System.out.println(word.substring(3,5)); // da

		String replaceString = word.replace("Vandan", "Vanshika");
		System.out.println(replaceString); // replace string with Vanshika

		int index1 = word.indexOf("n");
		int index2 = word.lastIndexOf("a");
		System.out.println(index1); // 2
		System.out.println(index2); // 4

		String word1 = "I";
		String word2 = "Am";
		String word3 = "Vandan";
		String word4 = word1.concat(word2).concat(word3); // IAmVandan
		System.out.println(word4);

		System.out.println(word1.isEmpty()); // false

		System.out.println(word4.contains("Vandan")); // true

		System.out.println(word1.compareTo(word2)); // I=9 and A=1 i is 8 time grater than a

		String word5 = "Vandan";
		System.out.println(word1.equals(word2)); // false
		System.out.println(word3.equals(word5)); // true

		String word7 = " QDev ";
		System.out.println(word7); // (space)QDev
		System.out.println(word7.trim()); // QDev

		int number = 10;
		String number1 = String.valueOf(number);
		System.out.println(number1 + 11); // 1011

		String joinString1 = String.join("-", "I", "Am", "Vandan");
		System.out.println(joinString1); // I-Am-Vandan
	}

}
