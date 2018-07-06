package com.capg.lab4;

public class SavingAccount {
	
	private final double minimumBalance = 1000;
	
	public boolean withdraw(double balance)
	{
		if(balance>=minimumBalance)
		
		return true;	
		
		else 
			
	    return false;
	}

}
