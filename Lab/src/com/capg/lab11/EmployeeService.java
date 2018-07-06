package com.capg.lab11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class EmployeeService {
	double sum = 0;
	String departmentName;
	int count = 0;

	public void salary(List<Employee> obj) {
		Stream<Employee> s = obj.stream();
		s.forEach(sa -> sum = sum + sa.getSalary());

		System.out.println("Total Salary: " + sum);
	}

	public void department(List<Employee> obj) {
		Stream<Employee> s = obj.stream();
		Set<String> set = new HashSet<>();
		s.forEach(sa -> set.add(sa.getDepartment().getDepartmentName()));

		for (String str : set) {

			Iterator<Employee> i = obj.iterator();

			while (i.hasNext()) {

				Employee obj1 = i.next();

				if (obj1.getDepartment().getDepartmentName().equals(str)) {
					count++;
				}

			}

			System.out.println("Department " + str + ": No. of employees = " + count);
			count = 0;
		}

	}
	
	public void seniorMost(List<Employee> obj)
	{
		List<Integer> list = new ArrayList<>();
		
		obj.forEach(sa -> list.add(sa.getAge()));
		
		Collections.sort(list);
		int b =0;
		for(int age : list)
		{
			b = age;
		}
		
		
		for(Employee obj1 : obj)
		{
			if(obj1.getAge()==b)
			{
				System.out.println("senior most employee = "+obj1.getFirstName()+" "+obj1.getLastName());
			}
		}
	}
}
