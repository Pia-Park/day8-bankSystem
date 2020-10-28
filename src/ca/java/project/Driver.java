package ca.java.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static void printInfo(User users) {
		System.out.println("-----------------------\nUser Information\n\nUser Name: " + users.getFName() + " " + users.getLName()
		+ "\nUser Postal Code: " + users.getPostalCode()
		+ "\nUser Phone number: " + users.getPNum()
		+ "\n\n-----------------------\nUser Account information\n");
		printAccInfo(users.getAccount());
		System.out.println("-----------------------");
	}
	
	public static void printAccInfo(ArrayList<BankAccount> acc) {
		for(BankAccount a : acc) {
			System.out.println("Deposit: $" + a.getBalance()
			+ "\nAccount Number: " + a.getAccNum()
			+ "\nCreated date: " + a.getYear() + "/" + a.getMonth());
		}
	}

	
	public static User checkPcode(ArrayList<User> users, String ppCode) {
		for(User u : users) {
			if(u.getPostalCode().equalsIgnoreCase(ppCode)) {
				return u;
			}
		}
		return null;
	}
	
	public static int printInstruction() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		System.out.println("1. deposit \n2. withdraw\n");
		return input.nextInt();
	}
	
	public static BankAccount checkAccNum(User u, int accNum) {
		for(BankAccount b : u.getAccount()) {
			if(b.getAccNum() == accNum) {
				return b;
			}
		}
		return null;
	}
	
	public static void makeTransation() {
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<User> users = new ArrayList<User>();
		
		BankAccount a1 = new BankAccount(200, 2012, 12);
		BankAccount a2 = new BankAccount(150, 1878, 2);
		
		User u1 = new User("Inae", "Park", "V42G55", "236-400-8000");
		
		u1.addAccount(a1);
		u1.addAccount(a2);
		
		printInfo(u1);
		
		users.add(u1);
//		System.out.println(u1.toString());
		
		System.out.println("Enter the Postal code format of A00A00: ");
		String pCode = input.nextLine();
		User returnedUser = checkPcode(users, pCode);
		
		if(returnedUser != null) {
			printInfo(returnedUser);
			System.out.println();
			int numChoosen = printInstruction();
			
			System.out.println("Enter the account number: ");
			int enteredAccNum = input.nextInt();
			BankAccount retuBankAccount = checkAccNum(u1, enteredAccNum);
			
			if(retuBankAccount != null) {
				System.out.println("Enter the amount that you want to do the transaction: ");
				double amountE = input.nextDouble();
				
			} else {
				System.err.println("There is no Account number.");
			}
			
		} else {
			System.out.println("There is no postal code.");
		}
		
		
					
		

	}

}
