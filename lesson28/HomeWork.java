package com.neotech.lesson28;

import java.util.ArrayList;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Ali");
		names.add("Mark");
		names.add("Tima");
		names.add("Kevin");
		names.add("Devid");
		
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.isEmpty());
		 // check if specific item exists in list
		System.out.println("Does it contains Kevis? " + names.contains(""));
		for (String name: names) {
			System.out.print(name + " - ");
		}
		

	}

}
