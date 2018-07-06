package com.capg.lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonMain1 {
	
public enum Gender
	{
		M,F,m,f;
	}

	public static void main(String[] args) {
	
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {

			
			System.out.println("Enter First Name: ");
			 String fname= br.readLine();
			
			System.out.println("Enter Last Name: ");
			String lname= br.readLine();
			
			System.out.println("Enter Gender: ");
			char gender= br.readLine().charAt(0);

			
			outer: while(true)
			{
			
			for(Gender g:Gender.values())
			{
				if(gender==(g.name().charAt(0)))
				{
	             break outer;
				}
				
			}
		
				System.out.println("Wrong Gender try again: ");
			    gender= br.readLine().charAt(0);
			
			}
			
			
			System.out.println("Enter Phone no: ");
			String phone= br.readLine();
			
			Person1 p = new Person1();
			Person1 p1 = new Person1(fname,lname,gender,phone);
			
			p1.setFname(fname);
			p1.setLname(lname);
			p1.setGender(gender);
			p1.setPhone(phone);
			
			p1.displayDetails(p1);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
