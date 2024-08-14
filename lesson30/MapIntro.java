package com.neotech.lesson30;

import java.util.HashMap;
import java.util.Map;






public class MapIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> building = new HashMap<>();
		building.put(1, "Google");
		building.put(2, "Apple");
		building.put(3, "Dell");
		building.put(4, "HP");
		building.put(5, "NeoTech");
		building.put(6, "Lenovo");
		building.put(7, "Amazon");
		building.put(8, "Samsung");
		
		
		
		System.out.println(building.size());
		building.remove(7);
		System.out.println(building);

	}

}
