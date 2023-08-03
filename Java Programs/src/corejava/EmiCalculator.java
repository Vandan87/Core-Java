package corejava;

/* Program is about for EMI calculator */

import java.util.*;

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
		Scanner input = new Scanner(System.in);
		double principle,rate,time;

		System.out.print("Enter Principle : ");
		principle = input.nextFloat();

		System.out.print("Enter Rate : ");
		rate = input.nextFloat();

		System.out.print("Enter Time(In months) : ");
		time = input.nextFloat();

		rate = rate / (12 * 100); // Calculate interest rate

		Calculation interestcalculation = new Calculation(principle, rate, time);

		System.out.print("EMI is " + interestcalculation.emicalculation);
		input.close();
	}

}
