package com.capg.lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		Scanner sc = new Scanner(new File("numbers.txt"));
		
		String contents = sc.next();
		
		String[] str = contents.split(",");
		
		for(String s : str)
		{
			int num = Integer.parseInt(s);
			if(num%2 == 0)
			{
				System.out.println(num);
			}
		}

	}

}
