package oopsconcept;
/* Program's aim is to show the use of all exception handling */
public class CustomException {
	public static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("Person is not eligible for vote");
		} else {
			System.out.println("Person is eligible for vote");
		}
	}

	public static void main(String args[]) {
		try {
//			below code do not throw any exception
			int equation = 25 / 5;
			System.out.println(equation);
		}
//		catch won't be executed
		catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally block always executed");
		}
		validate(13);
		System.out.println("Rest of the code...");
	}

}