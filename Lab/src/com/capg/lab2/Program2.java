package com.capg.lab2;

public class Program2 {

	public static void main(String[] args) {

		int num ;
		num=Integer.parseInt(args[0]);
		
		if(num>0)
		{
			System.out.println(num + " is positive");
		}
		
		else if(num<0)
		{
			 System.out.println(num + " is negative");
		}
		
		else
		{
			System.out.println(num + " is neither positive nor negative");
		}
		

	}

}
