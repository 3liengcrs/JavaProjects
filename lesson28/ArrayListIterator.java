package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> choco = new ArrayList<>();
		choco.add("Ulker");
		choco.add("World");
		choco.add("Godiva");
		choco.add("Hershey");
		choco.add("Kinder");
		
		ArrayList<String> sweets = new ArrayList<>();
		
		sweets.add("Milk");
		sweets.add("Chocolet");
		sweets.add("Milkshake");
		
		
		
		choco.addAll(sweets);
		System.out.println(choco);
		
		
		Iterator<String> it = choco.iterator();
		  
		
		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
			if (element.equals("Milkshake")) {
				it.remove();
			}
		}System.out.println(choco);

	}

}
