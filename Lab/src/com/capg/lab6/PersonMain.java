package com.capg.lab6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PersonMain {
	

	public static void main(String[] args) throws IOException {
	
	
		Scanner sc = new Scanner(System.in);
		
		
		
			
			System.out.println("Enter First Name: ");
			 String fname= sc.nextLine();
			
			System.out.println("Enter Last Name: ");
			String lname= sc.nextLine();
	
				
			if(fname.isEmpty() == true && lname.isEmpty() == true)
				
			{
				
					try {
						throw new NotNullException("NotNullExceptionFound");
					} 
					catch (NotNullException e) {
						
						System.err.println(e);
					}
				
			}
			else
			{
				
			System.out.println("Enter Gender: ");
		    char gender= sc.nextLine().charAt(0);
			
			Person p = new Person();
			Person p1 = new Person(fname,lname,gender);
			
			p1.setFname(fname);
			p1.setLname(lname);
			p1.setGender(gender);
			
			System.out.println(p1);
			
			}
			
			
		
	}

}
