package com.capg.lab11;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string: ");
		String str = sc.nextLine();

		IProgram2 obj = (s) -> s.replaceAll("\\B", " ");

		String result = obj.spaces(str);
		System.out.println(result);
	}

}
