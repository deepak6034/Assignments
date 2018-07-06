package com.capg.lab11;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		IProgram4 obj = () -> {
			return new Simple();
		};

		Simple s = obj.methodDemo();

		System.out.println("Enter firstname: ");
		String fname = sc.nextLine();

		System.out.println("Enter lastname: ");
		String lname = sc.nextLine();

		s.setFname(fname);
		s.setLname(lname);

		System.out.println(s);

	}

}
