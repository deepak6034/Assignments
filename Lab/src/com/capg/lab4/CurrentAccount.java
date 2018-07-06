package com.capg.lab4;

public class CurrentAccount extends SavingAccount
{

	private double overdraftLimit = 20000;
	
	public boolean withdraw(double withdrawAmount)
	{
		if(withdrawAmount<=overdraftLimit)
		
		return true;	
		
		else 
			
	    return false;
	}

}
