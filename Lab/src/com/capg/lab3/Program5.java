package com.capg.lab3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int years,months;
	    System.out.println("Enter product purchase date: ");
	    String s;
	    s = sc.nextLine();
	    
	    System.out.println("Enter warranty details:");
	    System.out.println("Years: ");
	    years=sc.nextInt();
	    System.out.print(" months: ");
	    months=sc.nextInt();
		
	    DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
	    LocalDate ld = LocalDate.parse(s,date);
	     ld = LocalDate.of(ld.getYear()+years,ld.getMonthValue(), ld.getDayOfMonth());
	    System.out.println(ld.plusMonths(months));
	    
	}

}
