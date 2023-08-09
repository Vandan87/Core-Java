package oopsconcept;
/* program's aim is to use of interface. */
interface Bank {
	float rateOfInterest(); // Abstract method to be implemented by classes that implement this interface
}
class SBI implements Bank {
	public float rateOfInterest() {
		return 9.15f;
	}
}

class HDFC implements Bank {
	public float rateOfInterest() {
		return 9.40f;
	}
}

public class Interface {

	public static void main(String args[]) {
		Bank bank = new SBI();
		System.out.println(bank.rateOfInterest());
	}

}