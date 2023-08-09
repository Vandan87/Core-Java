package oopsconcept;
/* Program's aim is to use of Throws Keyword. */
public class ThrowsKeyword {
	public int divideNumber(int value1, int value2) throws ArithmeticException {
		int divide = value1 / value2;
		return divide;
	}

	public static void main(String args[]) {
		ThrowsKeyword throwsKeyword = new ThrowsKeyword();
		try {
			System.out.println(throwsKeyword.divideNumber(45, 0));
		} catch (ArithmeticException e) {
			System.out.println("Number can not divide by zero");
		}
		System.out.println("Rest of the code....");
	}
	
}