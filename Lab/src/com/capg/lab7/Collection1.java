package com.capg.lab7;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Collection1 {

	public static void main(String[] args) 
	
	{
	 
		int[] arr = new int[4];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the integer array \n");
		int i=0;
		
		for(i=0; i<4; i++)
		{
			arr[i] = sc.nextInt();
		}
	
		String  s[] = new String[arr.length];
		
		for(i=0; i<4;i++)
		{
			s[i] = String.valueOf(arr[i]);
		}
		
		String t[] = new String[s.length];
		i=0;
	    for(String word: s)
	    {
	    	StringBuilder sb = new StringBuilder(word);
	    	t[i] = sb.reverse().toString();
	    	i++;
	    }
	    
	    int b[]= new int[4];  
	    for(i=0; i<4;i++)
		{
			b[i] = Integer.parseInt(t[i]);
		}
	   List<Integer> list = new ArrayList<>(b.length);
	   
	  for(int u: b)
	  {
		   list.add(u);
	   }
	   
	   Collections.sort(list);
	   System.out.println(list);
		
	}

}
