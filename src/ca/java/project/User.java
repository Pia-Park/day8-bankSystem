package ca.java.project;

import java.util.ArrayList;

public class User {
		
	private String fName;
	private String lName;
	private String postalCode;
	private String pNum;
	private ArrayList<BankAccount> accounts;
	
	//in constructor iniitalize the array list of bank account 
	
	//void addBankAccount 
	
	public User(String fName, String lName, String postalCode, String pNum) {
		
		setFName(fName);
		setLName(lName);
		setPostalCode(postalCode);
		setPNum(pNum);
		this.accounts = new ArrayList<BankAccount>();
		
	}
	
	public String getFName() {
		return fName;
	}
	
	public String getLName() {
		return lName;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public String getPNum() {
		return pNum;
	}
	
	public ArrayList<BankAccount> getAccount() {
		return accounts;
	}
	
	public void setFName(String fName) {
		if(!fName.isEmpty() && !fName.equalsIgnoreCase(null)) {
			this.fName = fName;
		} else {
			this.fName = "Unknown";
		}
	}
	
	public void setLName(String lName) {
		if(!lName.isEmpty() && !lName.equalsIgnoreCase(null)) {
			this.lName = lName;
		} else {
			this.lName = "Unknown";
		}
	}
	
	public void setPostalCode(String postalCode) {
		if(!postalCode.isEmpty() && !postalCode.equalsIgnoreCase(null)) {
			this.postalCode = postalCode;
		} else {
			this.postalCode = "Unknown";
		}
	}
	
	public void setPNum(String pNum) {
		if(!pNum.isEmpty() && !pNum.equalsIgnoreCase(null)) {
			this.pNum = pNum;
		} else {
			this.pNum = "Unknown";
		}
	}
	
	public void addAccount(BankAccount account) {
		this.accounts.add(account);
	}
	
	@Override
	public String toString() {
		return "User Name: " + fName + " " + lName
				+ "\nUser Postal Code: " + postalCode
				+ "\nUser Phone Number: " + pNum;
	}
	
	

}
