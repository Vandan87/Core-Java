package corejava;
/* Java program to demonstrate use of string methods */
public class StringMethods {

	public static void main(String args[]) {
		String name = "Vandan";
		System.out.println(name.toUpperCase()); // VANDAN
		System.out.println(name.toLowerCase()); // vandan
		System.out.println(name.charAt(2)); // n
		System.out.println(name.charAt(4)); // a
		System.out.println(name.length()); // 6
		System.out.println(name.startsWith("Va")); // true
		System.out.println(name.endsWith("a")); // false
		System.out.println(name.substring(3,5)); // da
		String replaceString = name.replace("Vandan", "Vanshika");
		System.out.println(replaceString); // replace string with Vanshika
		int index1 = name.indexOf("n");
		int index2 = name.lastIndexOf("a");
		System.out.println(index1); // 2
		System.out.println(index2); // 4
		String message1 = "I";
		String message2 = "Am";
		String message3 = "Vandan";
		String message4 = message1.concat(message2).concat(message3); // IAmVandan
		System.out.println(message4);
		System.out.println(message1.isEmpty()); // false
		System.out.println(message4.contains("Vandan")); // true
		System.out.println(message1.compareTo(message2)); // I=9 and A=1 i is 8 time grater than a
		String message5 = "Vandan";
		System.out.println(message1.equals(message2)); // false
		System.out.println(message3.equals(message5)); // true
		String companyName = " QDev ";
		System.out.println(companyName); // (space)QDev
		System.out.println(companyName.trim()); // QDev
		int number = 10;
		String result = String.valueOf(number);
		System.out.println(result + 11); // 1011
		String sentence = String.join("-", "I", "Am", "Vandan");
		System.out.println(sentence); // I-Am-Vandan
	}

}