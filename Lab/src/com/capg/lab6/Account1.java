package com.capg.lab6;

import java.util.Random;
import java.util.Scanner;

public class Account1 extends CurrentAccount
{

	public static void main(String[] args) {
		
		Account1 obj = new Account1();
		SavingAccount obj1 = new SavingAccount();
		double bal;
		boolean value = false;
		
		Random rand = new Random();
		long accno =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Holder name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Account Holder age(min 15): ");
		float age = sc.nextFloat();
		
		if(age<=15)
		{
			try {
				throw new InvalidAgeException("InvalidAgeExceptionFound");
			} 
			
			catch (InvalidAgeException e) {
				System.err.println(e);
				System.exit(0);
			}
		}
		
		for(int i =0; i<10; i++)
		{
			accno += rand.nextInt();
		}

		System.out.println("Enter Account Balance ... (minimum 500)");
		
		while(true)
		{
			bal = sc.nextDouble();
			if(bal>=500)
		       break;
			System.out.println("wrong input ..enter again");
		}

		
        System.out.println("Enter the amount you want to withdraw");
		double amount = sc.nextDouble();
		
		System.out.println("Enter Account type: ");
		System.out.println("1. Current \n 2. Savings ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			value= obj.withdraw(amount);
			break;

		case 2:
			value = obj1.withdraw(bal);
			break;
		}
		
		if(value)
		{
			bal-=amount;
			System.out.println("Withdrawn Done!");
		}
		
		System.out.println("User Details: ");
		System.out.println("Account Holder Name: "+ name);
		System.out.println("Account Holder Age: "+ age);
		System.out.println("Account Number: "+ accno);
		System.out.println("Balance: "+ bal);
		
	}

}
