package com. neotech.lesson28;

import java. util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words = new ArrayList<>();
		 words.add("apple");
	     words.add("banana");
	     words.add("grape");
	     words.add("orange");
	     words.add("pear");
	     words.add("pine");
		
	     Iterator<String> it = words.iterator();
	     while(it.hasNext()) {
//	    	 String word = it.next();
	    	 if (it.next().contains("g"))
	    		 it.remove();
	     }
	     System.out.print(words + " " );

	}
	


}
