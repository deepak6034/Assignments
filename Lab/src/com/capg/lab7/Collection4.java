package com.capg.lab7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection4 {
	
	public static void main(String[] args)
	{
		
		int[] arr = new int[4];
		
		System.out.println("Enter The Elements = ");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<4;i++)
		{
			
			arr[i] = sc.nextInt();
		}
		
         Map<Integer,Integer> mp = new HashMap<>(); 
         
         
		
		for(int i=0; i<4;i++)
		{
			int sqr = arr[i]*arr[i];
			mp.put(arr[i], sqr);
			
		}
		
		System.out.println(mp);
		
	}

}
