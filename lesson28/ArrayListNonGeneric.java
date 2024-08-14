package com.neotech.lesson28;

import java.util.ArrayList;

public class ArrayListNonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> numbers = new ArrayList<>();
		 numbers.add(3.5);
		 numbers.add(2.5);
		 numbers.add(1.5);
		 
		 numbers.set(0, 5.65);
		 System.out.println(numbers);
		 numbers.remove(1);
		 System.out.println(numbers);
		 numbers.add(4.55);
		 numbers.add(20.58);
		 numbers.add(11.5);
		for(double num:numbers) {
			System.out.print(num + " ");
		}
		System.out.println("");
		System.out.println("_____________________________");
		
		
		
		ArrayList arry = new ArrayList();
		arry.add(14);
		arry.add("Hello");
		arry.add(5.89);
		arry.add('#');
		
		for (Object item: arry) {
			System.out.print(item + " " );
		}

	}

}
