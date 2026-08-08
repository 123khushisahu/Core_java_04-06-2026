package com.hksir11am;

public class BankAccount {


	private static String bankName;
	
	private long accNum;
	private boolean active;

	public static void setBankName(String bankName) {
		BankAccount.bankName = bankName;
	}

	public static String getBankName() {
		return bankName;
	}
	
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	
	public long getAccNum() {
		return accNum;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isActive() {
		return active;
	}

	public void display(){
		System.out.println("  bankName\t: "	+ bankName);
		System.out.println("  accNum\t: "	+ accNum);
		System.out.println("  active\t: "	+ active);
	}
}

