package oopsconcept;
/* Program's aim is to use of encapsulation. */
//This class represent bankaccount with private fields and public method 
class BankAccount {
	private String accountNumber;
	private double balance;
	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposite(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited Amount : " + amount);
		} else {
			System.out.println("Invalid Deposite Amount");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn : " + amount);
		} else {
			System.out.println("Invalid withdrawal amount");
		}
	}
}

public class Encapsulation {

	public static void main(String args[]) {
		BankAccount account = new BankAccount("1001", 10000);
		System.out.println("Account Number : " + account.getAccountNumber());
		System.out.println("Initial Balance : " + account.getBalance());
		account.deposite(500);
		account.withdraw(200);
		System.out.println("Updated Balance : " + account.getBalance());
	}
	
}