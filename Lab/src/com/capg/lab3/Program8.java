package com.capg.lab3;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		
		Program8 p = new Program8();
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter number of string objects");
		num = sc.nextInt();
		
		System.out.println("Enter the strings: ");
		
		
		String[] s = new String[num];
		
		sc.nextLine();
		
		for(int i=0;i<num;i++)
		{
		s[i] = sc.nextLine();
		}
		
		String result[] = p.sortAndCase(s);
		
		  
		System.out.println("The resulting strings are: ");
		
		   for(int k=0;k<result.length;k++)
		   {
		          System.out.println(result[k]);
		
	       }
		   
	}
	
	public String[] sortAndCase(String str[])
	{
		
		for(int i=0;i<str.length-1;i++)
		{
		
			for(int j=i;j<str.length-1;j++)
			{
		      int value = str[i].compareTo(str[j+1]);
        	   if(value>0)
        	    {
                  String temp = str[i];
                  str[i] = str[j+1];
                  str[j+1] = temp;
        	    }
            }
	    }
		int i;
		
		if(str.length%2 ==0)
		{
			
			for(i=0;i<(str.length/2);i++)
			{
			  str[i] = str[i].toUpperCase();
			}
			
			
			for(int a= i;a<str.length;a++)
			{
				str[a ]= str[a].toLowerCase();
			}
		}
			
		else {
		
		    for(i=0;i<(str.length/2+1);i++)
		    {
		        str[i] = str[i].toUpperCase();
		    }
		
		
		    for(int a= i;a<str.length;a++)
		    {
			    str[a ]= str[a].toLowerCase();
		    }
		    
		}
		
		return str;
	}
	

}

