package com.capg.lab11;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value 1 =");
		double a = sc.nextDouble();

		System.out.println("Enter value 2 =");
		double b = sc.nextDouble();

		IProgram1 obj = (x, y) -> Math.pow(x, y);

		double result = obj.power(a, b);

		System.out.println(result);
	}

}
