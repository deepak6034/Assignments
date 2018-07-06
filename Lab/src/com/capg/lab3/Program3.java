package com.capg.lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
	
	    System.out.println("Enter a date you want to give: ");
	
	    String s;
	    s = sc.nextLine();
	    DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    
	    LocalDate ld = LocalDate.now();
	    LocalDate ld1 = LocalDate.parse(s,date);

	    Period p = ld1.until(ld);
	    System.out.println(p.get(ChronoUnit.YEARS)+ " years "+ p.get(ChronoUnit.MONTHS)+" month "+ p.get(ChronoUnit.DAYS)+" days");
	}

}
