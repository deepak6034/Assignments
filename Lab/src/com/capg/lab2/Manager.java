package com.capg.lab2;

class Employee
{
String name;
int id;
public Employee(String name,int id)
{
this.name = name;
this.id=id;
System.out.println(id);
}
}
public class Manager extends Employee
{
	
	
public Manager(String name, int id) {
		super(name, id);
	
	}

public static void main(String []args)
{
Manager mgr = new Manager("dee", 10);
}
}