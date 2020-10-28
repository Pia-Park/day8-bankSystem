package ca.java.project;

import java.util.ArrayList;

public class Driver {
	
	public static void printInfo(User users) {
		System.out.println("User Name: " + users.getFName() + " " + users.getLName()
		+ "\nUser Postal Code: " + users.getPostalCode()
		+ "\nUser Phone number: " + users.getPNum()
		+ "\nUser Account information:\n");
		printAccInfo(users.getAccount());
	}
	
	public static void printAccInfo(ArrayList<BankAccount> acc) {
		for(BankAccount a : acc) {
			System.out.println("Deposit: $" + a.getDeposit()
			+ "\nAccount Number: " + a.getAccNum()
			+ "\nCreated date: " + a.getYear() + "/" + a.getMonth()+"\n");
		}
	}

	public static void main(String[] args) {
		
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		BankAccount a1 = new BankAccount(200, 2012, 12);
		BankAccount a2 = new BankAccount(150, 1878, 2);
		
		ArrayList<User> users = new ArrayList<User>();
		User u1 = new User("Inae", "Park", "V42G55", "236-400-8000");
		
		u1.addAccount(a1);
		u1.addAccount(a2);
		
		printInfo(u1);
					
		

	}

}
