package com.neotech.review11;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;



public class EnglishSoanishDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> dictionary = new TreeMap<>();
		dictionary.put("house", "casa");
		dictionary.put("cat", "gato");
		dictionary.put("donkey", "burro");
		dictionary.put("flag", "bandera");
		dictionary.put("banner", "bandera");

		System.out.println("map -> " + dictionary);
		
		
		
		Set< Entry <String, String>> entries = dictionary.entrySet();
		System.out.println(entries);
		
		
		for(Entry<String, String> pair: entries) {
			
			String k = pair.getKey();	
			String v = pair.getValue();
			System.out.println(k + " -> "+ v);
		}
		Iterator<Map.Entry<String, String>> iterator = dictionary.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
		

	}

}
