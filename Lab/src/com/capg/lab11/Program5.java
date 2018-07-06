package com.capg.lab11;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		IProgram5 obj = (n) -> {
			int fact = 1;
			if (n != 0) {
				while (n > 0) {
					fact = fact * n;
					n--;
				}
				return fact;
			} else
				return n;
		};

		System.out.println("Enter number for the factorial: ");
		int num = sc.nextInt();

		int result = obj.factorial(num);

		System.out.println(result);
	}

}
