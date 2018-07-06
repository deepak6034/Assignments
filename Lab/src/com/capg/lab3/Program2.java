package com.capg.lab3;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Program2 p = new Program2();
		String str = new String();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		str = sc.nextLine();
		
		boolean num = p.checkPositive(str);
		
		System.out.println("Is "+ str + " a positive string ? : " + num);
		
	}
	
	public boolean checkPositive(String s)
	{
		int i;
		
		for(i= 0;i<s.length()-1;i++)
		{
			if(s.charAt(i)<s.charAt(i+1))
			{
				continue;
			}
			
			else
			{
				break;
			}
		}
		
		if(i==(s.length()-1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}


}
