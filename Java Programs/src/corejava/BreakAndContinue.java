package corejava;

/* Program's aim is how to use of break and continue statement */

public class BreakAndContinue {

	public static void main(String args[]) {
		for (int number = 1; number <= 10; number++) {
//			Check condition and when condition is true than loop is stop with this number
			if (number == 8) {
				break;
			}
//			Check condition and when condition is true it is skip this number and continue
			if (number == 2) {
				continue;
			}
			System.out.println(number);
		}
	}
	
}
