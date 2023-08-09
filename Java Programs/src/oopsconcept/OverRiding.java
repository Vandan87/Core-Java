package oopsconcept;

import java.util.*;
/* Program's aim is to use of Overloading Concept. */
class Manager {
	protected int idendityNumber;
	protected String name;
	protected float salary, houseRentAllowance, providentFund, netSalary;
	Scanner scanner = new Scanner(System.in);
	
	public void setData() {
		System.out.print("Enter Idendity Number : ");
		idendityNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Your Name : ");
		name = scanner.nextLine();
		System.out.print("Enter Your Salary : ");
		salary = scanner.nextFloat();
	}

	public void getSalary() {
		houseRentAllowance = salary * 0.50f;
		providentFund = salary * 0.12f;
		netSalary = salary + houseRentAllowance - providentFund;
		System.out.println("Manager Idendity Number : " + idendityNumber);
		System.out.println("Manager Name : " + name);
		System.out.println("Manager Salary : " + salary);
		System.out.println("Manager House Rent Allowance : " + houseRentAllowance);
		System.out.println("Manager Provident Fund : " + providentFund);
		System.out.println("Manager Net Salary : " + netSalary);
	}
}

class Worker extends Manager {
	private float bonus;
	@Override
	public void getSalary() {
		bonus = salary * 0.10f;
		netSalary = salary + bonus;
		System.out.println("Worker Idendity Number : " + idendityNumber);
		System.out.println("Worker Name : " + name);
		System.out.println("Worker Salary : " + salary);
		System.out.println("Worker Bonus : " + bonus);
		System.out.println("Worker Net Salary : " + netSalary);
	}
}

public class OverRiding {
	
	public static void main(String args[]) {
		Manager manager = new Manager();
		manager.setData();
		manager.getSalary();
	}
	
}