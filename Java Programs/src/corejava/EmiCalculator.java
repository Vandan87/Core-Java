package corejava;

import java.util.*;
/* Program is about for EMI calculator */
class Calculation {
	double emicalculation;
//	EMI formula using interest formula	
	Calculation(double principle, double rate, double time) {
		emicalculation = (principle * rate * Math.pow(1 + rate , time) / (Math.pow(1 + rate , time) - 1));
	}
}

public class EmiCalculator {

	public static void main(String args[]) {
//	 	Input form user
		Scanner scanner = new Scanner(System.in);
		double principle, rate, time;
		System.out.print("Enter Principle : ");
		principle = scanner.nextFloat();
		System.out.print("Enter Rate : ");
		rate = scanner.nextFloat();
		System.out.print("Enter Time(In months) : ");
		time = scanner.nextFloat();
		rate = rate / (12 * 100); // Calculate interest rate
		Calculation interestCalculation = new Calculation(principle, rate, time);
		System.out.print("EMI is " + interestCalculation.emicalculation);
		scanner.close();
	}

}