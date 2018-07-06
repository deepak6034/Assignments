package com.capg.lab11;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter username: ");
		String uname = sc.nextLine();

		System.out.println("Enter password: ");
		String pass = sc.nextLine();

		IProgram3 obj = (username, password) -> {
			if (username.isEmpty() == true || password.isEmpty() == true)
				return false;
			else
				return true;
		};

		boolean result = obj.details(uname, pass);

		System.out.println(result);
	}

}
