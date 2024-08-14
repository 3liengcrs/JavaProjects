package com.neotech.lesson29;

import java.util.ArrayList;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> drinks = new ArrayList<>();
		
		drinks.add("Coffee");
		drinks.add("Soda");
		drinks.add("Tea");
		drinks.add("Milk");
		drinks.add(1,"cola");
		
		
		
		
		for (String drink: drinks) {
			if(drink.contains("a")||drink.contains("e") ) {
				drink = drink.replace(drink, "Water");
				
			}System.out.print(drink + " ");
		}
		
		

		
	}

}
