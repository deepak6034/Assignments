package com.cs.eis.service;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

public class EmployeeServiceImplementation extends Employee implements EmployeeInterface  {

	public static void main(String[] args) {
		
		EmployeeServiceImplementation obj = new EmployeeServiceImplementation();
		obj.EmployeeServices();
	}

	@Override
	public void EmployeeServices() {
		
	if((salary>=5000 && salary<20000) && (designation.equalsIgnoreCase("System Associate")))
	{
	System.out.println("Scheme C");	
	}
	
	else if((salary>=20000 && salary <40000) && (designation.equalsIgnoreCase("Programmer")))
	{
		System.out.println("Scheme B");	
	}
	
	else if(salary>=40000 && designation.equalsIgnoreCase("Manager"))
	{
		System.out.println("Scheme A");
	}
	
	else if(salary<5000 && salary >=3000)
	{
		System.out.println("No Scheme");
	}
	
	else
	{
		try {
			
			throw new EmployeeException("EmployeeSalaryExceptionFound");
		} 
		
		catch (EmployeeException e) {
			
			System.err.println(e);
		}
	}

}
}
