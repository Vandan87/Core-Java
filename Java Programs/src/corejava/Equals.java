package corejava;
/* Demonstrate the difference between equals() or == operator*/
public class Equals {
	
	public static void main(String args[]) {
		String message1 = "Hello";
		String message2 = "Hello";
		String message3 = new String("Hello");
		System.out.println("Using == operator String : " + (message1 == message2)); // same reference
		System.out.println("Using == operator String : " + (message1 == message3)); // different reference
		System.out.println("Using equals() method String : " + message1.equals(message2)); // same content
		System.out.println("Using equals() method String : " + message1.equals(message3)); // different content
		int number1 = 45;
		int number2 = 45;
		System.out.println("Using == operator Integer : " + (number1 == number2)); // same reference
		System.out.println("Using equals() method Integer : " + Integer.valueOf(number1).equals(number2));
		double number3 = 3.14;
		double number4 = 4.13;
		System.out.println("Using == operator Double : " + (number3 == number4));
		System.out.println("Using equals() method Double : " + Double.valueOf(number3).equals(number4));
		char value1 = 'V';
		char value2 = 'V';
		System.out.println("Using == operator Character : " + (value1 == value2));
		System.out.println("Using equals() method Character : " + Character.valueOf(value1).equals(value2));
	}
	
}