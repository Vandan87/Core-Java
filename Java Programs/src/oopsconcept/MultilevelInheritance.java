package oopsconcept;

import java.util.*;
/* Program's aim is to use MultilevelInheritance. */
// Base Class
class BioData {
	private String name, age;
	Scanner scanner = new Scanner(System.in);
//  Method to set the Bio Data
	public void setBioData() {
		System.out.print("Enter Your Name : ");
		name = scanner.nextLine();
		System.out.print("Enter Your Age : ");
		age = scanner.nextLine();
	}
//  Method to display the Bio Data
	public void showBioData() {
		System.out.println("======================================");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
// EmployeeDetails inheriting from BioData
class EmployeeDetails extends BioData {
	private String companyName;
	private float salary;
//  Method to set the Employee Detail
	public void setEmployeeDetail() {
		System.out.print("Enter Your Company Name : ");
		companyName = scanner.nextLine();
		System.out.print("Enter Your Salary : ");
		salary = scanner.nextFloat();
		scanner.nextLine();
	}
//  Method to display the Employee Detail
	public void showEmployeeDetail() {
		System.out.println("Company Name : " + companyName);
		System.out.println("Salary : " + salary);
	}
}
// DeveloperData inheriting from EmployeeDetails
class DeveloperData extends EmployeeDetails {
	private String language;
	private float experience;
//  Method to set the Developer Data
	public void setDeveloperData() {
		System.out.print("Enter known Computer Language : ");
		language = scanner.nextLine();
		System.out.print("Enter Your Experience : ");
		experience = scanner.nextFloat();
	}
//  Method to display the Developer Data
	public void showDeveloperData() {
		System.out.println("Computer Language Known : " + language);
		System.out.println("Experience : " + experience);
		System.out.println("======================================");
	}
}

public class MultilevelInheritance {
	
	public static void main(String args[]) {
		DeveloperData developer = new DeveloperData();
		developer.setBioData();
		developer.setEmployeeDetail();
		developer.setDeveloperData();
		developer.showBioData();
		developer.showEmployeeDetail();
		developer.showDeveloperData();
	}

}