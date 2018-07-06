package com.capg.lab3;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
        
		Program6 p = new Program6();
		String zoneID;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Zoneid like(Europe/Paris) : ");
        zoneID = sc.nextLine();
        p.displayZoneDateTime(zoneID);
	
	}

	public void displayZoneDateTime(String s)
	{
		
		
	ZonedDateTime currentTime = ZonedDateTime.now();
		
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of(s));
		
		System.out.println("Date and Time as per to CurrentZone: " + currentTime);
		System.out.println("Date and Time as per to "+s+": " + zdt);
	}
}
