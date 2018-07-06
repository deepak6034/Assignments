package com.capg.lab2;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		
		String fname = new String();
		String lname = new String();
		char gender;
		int age;
		double weight;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details: ");
		
		System.out.println("Enter First Name: ");
		fname=sc.nextLine();
		
		System.out.println("Enter Last Name: ");
		lname=sc.nextLine();
		
		System.out.println("Enter Gender: ");
		gender=sc.next().charAt(0);
		
		System.out.println("Enter age: ");
		age=sc.nextInt();
		
		System.out.println("Enter weight: ");
		weight=sc.nextDouble();
		
		
		System.out.println("Personal Details: ");
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(weight);
		
	
		

	}

}
