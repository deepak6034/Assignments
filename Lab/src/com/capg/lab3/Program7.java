package com.capg.lab3;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		
		Program7 p = new Program7();
		String username,str="_job",phone,email;
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter the Username of atleast 8 characters: ");
   	
		   while(true)
	        {    
			     
	        	 username = sc.nextLine();
	        	 boolean value = p.validate(username);
	        	 if(value==false)
	        	 {
	        	 
	             System.out.println("Username correct? : "+value);		 
	        	 System.out.println("Enter Username of atleast 8 characters"); 
	     		 System.out.println("Try Again: ");
	     		 System.out.println("Enter the Username : ");
	        	 }
	        	 
	        	 else
	        	 {
	        		 System.out.println("Username correct? : "+value);
	        		 break;
	        		 
	        	 }
	        	 
	        	 
	        }
	             username+=str;
     
	             System.out.println("Enter your phone number : ");
	             phone = sc.nextLine();
	             
	             System.out.println("Enter your email id : ");
	             email= sc.nextLine();
                 
	             System.out.println("Details : ");
	             System.out.println("Username: "+ username);
	             System.out.println("phone number : " + phone);
	             System.out.println("email id : " + email);
	          
                

	}
                   
	              
	public boolean validate(String s)
	{      
		 if(s.length()<8)
    	 {  return false;
    	 
    	 }
    	 else
    	 {
    		return true;
    	 }
    }
	
}
