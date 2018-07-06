package com.cg.eis.pl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.cs.eis.service.EmployeeServiceImplementation;

public class Main extends EmployeeServiceImplementation{

	public static void main(String[] args)  {
		
     Main m = new Main();
     Scanner sc = new Scanner(System.in); 
      int id;
 	  String name;
 	  long salary;
 	  String designation;
      
     System.out.println("Enter the details: ");
     
     System.out.println("Employee id: ");
     id = sc.nextInt();
     
     sc.nextLine();
     System.out.println("Employee Name: ");
     name = sc.nextLine(); 
     
     System.out.println("Employee Salary: ");
	 salary = sc.nextLong();
	 sc.nextLine();
	 System.out.println("Employee designation: ");
	 designation = sc.nextLine();
	 
	 m.setId(id);
	 
	 m.setName(name);
	 
	 m.setSalary(salary);
	 
	 m.setDesignation(designation);
	 
	 System.out.println("Employee Insurance Service Offered: ");
	 m.EmployeeServices();
	 
	 FileWriter fw;
	 FileReader fr;
	try {
		
		fw = new FileWriter("Employee.txt");
		 BufferedWriter bw = new BufferedWriter(fw);
		 bw.write(m.toString());
		 bw.close();
		 
		 fr = new FileReader("Employee.txt");
		 BufferedReader br = new BufferedReader(fr);
		 
		 int i = br.read();
		 
		 while(i!= -1)
		 {
			 System.out.print((char) i);
			 
			 i = br.read();
		 }
		 
		 br.close();
		 
	} 
	
	catch (IOException e) {
	
		e.printStackTrace();
	}
	
	}

}
