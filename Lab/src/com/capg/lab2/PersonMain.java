package com.capg.lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonMain {

	public static void main(String[] args) {
	
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			
			System.out.println("Enter First Name: ");
			 String fname= br.readLine();
			
			System.out.println("Enter Last Name: ");
			String lname= br.readLine();
			
			System.out.println("Enter Gender: ");
			char gender= br.readLine().charAt(0);
			
			Person p = new Person();
			Person p1 = new Person(fname,lname,gender);
			
			p1.setFname(fname);
			p1.setLname(lname);
			p1.setGender(gender);
			
			System.out.println(p);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
