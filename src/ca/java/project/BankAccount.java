package ca.java.project;

public class BankAccount {
	//deposit 
	//account number 
	//created year  
	//created month
	
	private double balance;
	private int accNum;
	private int year;
	private int month;
	
	//constructor 
	public BankAccount(double balance, int year, int month) {
		
		setBalance(balance);
		setAccNum();
		setYear(year);
		setMonth(month);
		
	}
	
	//setter --> check int valuable
	
	//getter 
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccNum() {
		return accNum;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setBalance(double balance) {
		if(balance > 0) {
			this.balance = balance;
		} else {
			this.balance = 0;
		}
	}
	
	public void setAccNum() {
		this.accNum = (int)(Math.random()*(10000 - 1000)+1) + 1000;		
	}
	
	public void setYear(int year) {
		if(year < 1900) {
			this.year = 1900;
		} else {
			this.year = year;
		}
	}
	
	public void setMonth(int month) {
		if(month > 0 && month < 13) {
			this.month = month;
		} else {
			this.month = 0;
		}
	}
	
	@Override 
	public String toString(){
	 return "Account Information\nAccount Number: " + accNum
			 + "\nAccount balance: $" + balance
			 + "\nCreated date: " + year + "/" + month;}
	
	
	public void deposit(double depositAmount) {
		if(depositAmount > 0) {
			System.out.println("\n$" + depositAmount + " deposit to the account: " + accNum + "\n");
			balance += depositAmount;
		} else {
			System.err.println("Deposit Amount should be more than Zero.");
		}
	}
	
	public void withdraw(double withdrawAmount) {
		if(withdrawAmount <= balance && withdrawAmount > 0) {
			System.out.println("\n$" + withdrawAmount + " withdraw from account: " + accNum + "\n");
			balance -= withdrawAmount;
		} else if(withdrawAmount < 0) {
			System.err.println("Withdraw Amount should be more than Zero.");
		} else if(withdrawAmount > balance) {
			System.err.println("Withdraw Amount should be less than your balance.");
		}
	}


}
