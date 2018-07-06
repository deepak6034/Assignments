package com.capg.lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
	
	    System.out.println("Enter 1st date you want to give: ");
	    String s;
	    s = sc.nextLine();
	    
	    System.out.println("Enter 2nd date you want to give: ");
	    String s1;
	    s1 = sc.nextLine();

        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter date1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        		
	    LocalDate ld = LocalDate.parse(s,date);
	    LocalDate ld1 = LocalDate.parse(s1,date1);

	    Period p = Period.between(ld, ld1);
	    System.out.println(p.getYears()+ " years "+ p.getMonths()+" month ");
	}

}
