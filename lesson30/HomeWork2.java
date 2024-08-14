package com.neotech.lesson30;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> cities = new LinkedHashSet<>();
		
		
		cities.add("New York");
		cities.add("Boston");
		cities.add("Vegas");
		cities.add("Albany");
		cities.add("Chicago");
		cities.add("Orlando");
		cities.add("Auston");
		System.out.println(cities);
		Iterator<String> it = cities.iterator();
		while(it.hasNext()) {
		String city = it.next();
		if(city.startsWith("A")) {
			it.remove();
		} 
		


	}  System.out.println(cities);
	
	}
}
