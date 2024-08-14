package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>  list1 = new ArrayList<>();
		list1.add("Mark");
		list1.add("Jake");
		list1.add("Devis");
		list1.add("James");
		list1.add("Jeo");
		
		System.out.println(list1  + " The size of list2 is : " + list1.size());
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("Nida");
		list2.add("Paul");
		list2.add("Rayan");
		list2.add("Conor");
		list2.addFirst("Mike");
		
		
		System.out.println(list2 + " The size of list2 is : " + list2.size());
		
		for (String item: list2) {
			System.out.print(item + " - ");
		}
		
	}

}
