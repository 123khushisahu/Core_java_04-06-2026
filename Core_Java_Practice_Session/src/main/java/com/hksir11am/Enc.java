package com.hksir11am;

public class Enc {
private double balance;
public void setBalance(double balance) {
	
	if(balance>=0) {
		this.balance = balance;
	}
	else {
		System.out.println("Balance cannot be negative");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
