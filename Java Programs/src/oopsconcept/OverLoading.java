package oopsconcept;
/* Program's aim is to use of Overloading Concept. */
class Employee {
	private int idendityNumber;
	private String name;
	private float salary;
	Employee() {
	}
	Employee(int employeeNumber) {
		idendityNumber = employeeNumber;
	}
	Employee(int employeeNumber, String employeeName) {
		idendityNumber = employeeNumber;
		name = employeeName;
	}
	Employee(int employeeNumber, String employeeName, float employeeSalary) {
		idendityNumber = employeeNumber;
		name = employeeName;
		salary = employeeSalary;
	}
	public void setData(int employeeNumber, String employeeName, float employeeSalary) {
		idendityNumber = employeeNumber;
		name = employeeName;
		salary = employeeSalary;
	}

	public void showData() {
		System.out.println("ID Number : " + idendityNumber);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
	}

	public void searchData(int employeeNumber) {
		System.out.println("Searching Employee By ID Number : " + employeeNumber);
	}

	public void searchData(String employeeName) {
		System.out.println("Searching Employee By Name : " + employeeName);
	}

	public void searchData(float employeeSalary) {
		System.out.println("Searching Employee By Salary : " + employeeSalary);
	}
}

public class OverLoading {
	
	public static void main(String args[]) {
		Employee employee = new Employee();
		employee.searchData(15000f);
	}
	
}