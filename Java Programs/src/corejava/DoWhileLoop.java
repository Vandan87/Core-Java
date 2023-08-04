package corejava;
/* Program's aim is to print 1 to 10 numbers using do-while loop */
public class DoWhileLoop {
	
	public static void main(String args[]) {
		int number = 1;
//		First print number than increment and after it is check condition
		do {
			System.out.println(number);
			number++;
		} while (number >= 10);
	}
	
}
