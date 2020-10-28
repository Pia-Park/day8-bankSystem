package ca.java.project;

public class BankAccount {
	//deposit 
	//account number 
	//created year  
	//created month
	
	private double deposit;
	private int accNum;
	private int year;
	private int month;
	
	//constructor 
	public BankAccount(double deposit, int year, int month) {
		
		setDeposit(deposit);
		setAccNum();
		setYear(year);
		setMonth(month);
		
	}
	
	//setter --> check int valuable
	
	//getter 
	
	public double getDeposit() {
		return deposit;
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
	
	public void setDeposit(double deposit) {
		if(deposit > 0) {
			this.deposit = deposit;
		} else {
			this.deposit = 0;
		}
	}
	
	public void setAccNum() {
		this.accNum = (int)(Math.random()*(10000 - 100)+1) + 100;		
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
	


}
