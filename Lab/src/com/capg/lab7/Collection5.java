package com.capg.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection5 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();

		list1.add("Carrot");
		list1.add("Banana");
		list1.add("Apple");
		list1.add("Mango");
		list1.add("Icecream");
		
		Collections.sort(list1);
		
		System.out.println("Details");
		for(String str : list1)
		{
			System.out.println(str);
		}
	}
}
