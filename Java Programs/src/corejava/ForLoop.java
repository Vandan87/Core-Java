package corejava;

/* Program's aim is to print star pattern to given number from user */

import java.util.*;

public class ForLoop {
	
	public static void main(String args[]) {
		
// 		Input from user and denotes number of rows you want to print
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number :");
		int number = input.nextInt(); 
		
//		Outer loop for rows
		for (int i = 1; i <= number; i++) {
			
//			Inner loop for columns
			for (int j = 1; j <= i; j++) {
				System.out.print("*"); // Print stars
			}
			System.out.println(); // Print new line
		}

//		Outer loop for rows
		for (int i = 1; i <= number; i++) {
			
//			Inner loop for columns
			for (int j = 5; j >= i; j--) {
				System.out.print("*"); // Print stars
			}
			System.out.println(); // Print new line
		}
		input.close();
	}
	
}
