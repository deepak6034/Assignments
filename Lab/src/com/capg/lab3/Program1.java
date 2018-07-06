package com.capg.lab3;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		Program1 p = new Program1();
		int num;
		String str = new String();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		str = sc.nextLine();
		System.out.println("Enter the choice:");
		System.out.println("1. Add the String to itself");
		System.out.println("2. Replace odd positions with #");
		System.out.println("3. Remove duplicate characters in the String");
		System.out.println("4. Change odd characters to upper case");
		System.out.println("5. Exit");
	
		   while(true)
		   {
			   num = sc.nextInt();
			   
			   if(num>1 && num<5)
			   {
				   break;
			   }
			   else
			   {
				  System.out.println("Wrong choice try again"); 
			   }
			     
		   }
		   
	    StringBuilder sb1 =  p.choice(str,num);
	    
	    System.out.println(sb1);
	   
		
	}

	public StringBuilder choice(String s,int c)
	{  
		StringBuilder sb = new StringBuilder(s);
		switch(c)
		{
			case 1:
				
			     sb.append(s);	
			     break;
			     
			     
			case 2:
				
				 for(int i=0;i<s.length();i++)
					{
						if(i%2==0)
						{
							sb.setCharAt(i,'#');
						}
					}
				  break;
				  
				  
			case 3:
				   
				char a[]= s.toCharArray();
				sb.delete(0,s.length());
				for(char ch: a)
				{
					if(sb.indexOf(String.valueOf(ch))!=-1)
					{
						continue;
					}
					else
					{
						sb.append(ch);
					}
				}
			
			   break;
			   
			
			case 4:
				
				 for(int i=0;i<s.length();i++)
					{
						if(i%2==0)
						{
							sb.setCharAt(i, s.toUpperCase().charAt(i));
						}
					}
				 break;
				 
				 
			case 5: 
				 
				 System.exit(0);
				 break;
				 
		
		}
		
		return sb;
	}
	
}
