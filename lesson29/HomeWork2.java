package com.neotech.lesson29;

import java.util.ArrayList;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for ( int i = 2; i<= 50; i = i+2) {
			numbers.add(i);
		}
//		System.out.println(numbers);
		
		 ArrayList<Integer> number = new ArrayList<>();
		 
		
		for (int num : numbers) {
			if (num%5 != 0) {
				number.add(num);
			}
		}System.out.println(number);

	}

}
