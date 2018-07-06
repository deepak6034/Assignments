package com.capg.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AccountPersonMain extends Account {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of users you want to create account for: ");
		int num = sc.nextInt();
		
		
		List<AccountPersonMain> l1 = new ArrayList<AccountPersonMain>();
		
		
		System.out.println("Account Registration:");
		
		for(int a=0; a<num; a++)
		{   Person p1 = new Person();
			AccountPersonMain obj = new AccountPersonMain();
			System.out.println("Enter "+ (a+1)+ " user");
		    l1.add(obj.createAccount(p1,obj));
		}
		
			System.out.println(l1);
		}
		
		


	public  AccountPersonMain createAccount(Person p1, AccountPersonMain obj)
	{   
		Random rand = new Random();
		long n=0;
		double bal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Holder name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Account Holder age: ");
		float age = sc.nextFloat();
		
		p1.setName(name);
		p1.setAge(age);
		
		obj.setAccHolder(p1);
		
		for(int i =0; i<12; i++)
		{
			n += rand.nextInt();
		}

		obj.setAccNum(n);
		

		System.out.println("Enter Account Balance ... (minimum 500)");
		
		while(true)
		{
			bal = sc.nextDouble();
			if(bal>=500)
		       break;
			System.out.println("wrong input ..enter again");
		}
		
		obj.setBalance(bal);
		
		obj.deposit();
		obj.withdraw(obj);
		
		System.out.println("Balance is :"+obj.getBalance());
		
		return obj;
		
	}




	@Override
	public void withdraw(AccountPersonMain obj1)
	{   
		double amount;
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount you want to withdraw:");
		amount = scanner.nextDouble();
		
		obj1.balance-=amount;
	}
}
