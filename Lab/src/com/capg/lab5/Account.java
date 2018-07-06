package com.capg.lab5;

import java.util.Scanner;

public abstract class Account {
	
	private long accNum;
	protected double balance;
	Person accHolder;
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit()
	{   double amount;
    Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the amount you want to deposit:");
	amount = scanner.nextDouble();
	
	balance+=amount;
		
	}
	

	public abstract void withdraw(AccountPersonMain obj);
	
	

	public double balance()
	{   
		System.out.println("Enter the amount you want to deposit: " +balance);
		return balance;
	}
	
	@Override
	public String toString() {
		
	return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	
	}
	
	

}
