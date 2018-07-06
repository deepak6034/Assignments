package com.capg.lab11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepository {

	public static void main(String[] args) {

		EmployeeService er = new EmployeeService();

		List<Employee> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of employees");
		int num = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < num; i++) {
			
			System.out.println("Enter details:");

			Employee obj = new Employee();
			Department department = new Department();

			System.out.println("Enter Employee id :");
			int employeeID = sc.nextInt();

			sc.nextLine();
			System.out.println("Enter first name :");
			String firstName = sc.nextLine();

			System.out.println("Enter last name: ");
			String lastName = sc.nextLine();

			System.out.println("Enter Employee age :");
			int age = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter email: ");
			String email = sc.nextLine();

			System.out.println("Enter phone Number: ");
			String phoneNumber = sc.nextLine();

			System.out.println("Enter designation: ");
			String designation = sc.nextLine();

			System.out.println("Enter department id: ");
			int departmentID = sc.nextInt();

			sc.nextLine();
			
			System.out.println("Enter department name: ");
			String departmentName = sc.nextLine();

			System.out.println("Enter salary: ");
			double salary = sc.nextDouble();

			obj.setEmployeeID(employeeID);
			obj.setFirstName(firstName);
			obj.setLastName(lastName);
			obj.setAge(age);
			obj.setEmail(email);
			obj.setPhoneNumber(phoneNumber);
			obj.setDesignation(designation);
			obj.setSalary(salary);
			department.setDepartmentID(departmentID);
			department.setDepartmentName(departmentName);

			obj.setDepartment(department);
			list.add(obj);

		}

		er.salary(list);
		er.department(list);
		er.seniorMost(list);

	}
}
