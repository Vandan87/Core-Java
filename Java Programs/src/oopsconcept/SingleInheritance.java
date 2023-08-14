package oopsconcept;

import java.util.*;
/* Program's aim is to use SingleInheritance. */
// Base Class
class PersonalDetails {
	private int age, mobileNumber;
	private String name, city;
	Scanner scanner = new Scanner(System.in);
// 	Method to set the personal details
	public void setBioData() {
		System.out.print("Enter Your Name : ");
		name = scanner.nextLine();
		System.out.print("Enter Your Age : ");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Your City : ");
		city = scanner.nextLine();
		System.out.print("Enter Your Mobile No : ");
		mobileNumber = scanner.nextInt();
	}
//  Method to display the personal details
	public void showBioData() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Mobile Number : " + mobileNumber);
		System.out.println("City : " + city);
	}
}

// StudentDetails inheriting from PersonalDetails
class StudentDetails extends PersonalDetails {
	private int standard, enrollmentNumber;
//  Method to set student details	
	public void setData() {
		System.out.print("Enter Your Standard : ");
		standard = scanner.nextInt();
		System.out.print("Enter Your Enrollment No : ");
		enrollmentNumber = scanner.nextInt();
	}
//  Method to display the student details
	public void showData() {
		System.out.println("Standand : " + standard);
		System.out.println("Enrollment Number : " + enrollmentNumber);
	}
}

public class SingleInheritance {

	public static void main(String args[]) {
		StudentDetails detail = new StudentDetails();
		detail.setBioData();
		detail.setData();
		detail.showBioData();
		detail.showData();
	}

}