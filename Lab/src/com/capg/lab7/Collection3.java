package com.capg.lab7;

import java.util.ArrayList;
import java.util.List;

public class Collection3 {

	public static void main(String[] args)
	{
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
		List<String> list2 = new ArrayList<String>();
		
		list2.add("D");
		list2.add("B");
		list2.add("C");
		
		ArrayList<String> list= new ArrayList<String>();
		
		 list1.removeAll(list2);
		 
		System.out.println(list1);
		
	}
	
}
