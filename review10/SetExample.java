package com.neotech.review10;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			Set<String> africaLinked = new LinkedHashSet<>(); // Up-casting

			africaLinked.add("Nigeria");
			africaLinked.add("Morocco");
			africaLinked.add("Algeria");
			africaLinked.add("Ghana");

			System.out.println("Size -> " + africaLinked.size());

			// It will NOT add in the Set, because it already exists!
			africaLinked.add("Morocco");

			System.out.println("Size -> " + africaLinked.size());

			// Can I add with an index in a Set? NO
			// africaLinked.add(2, "Mali");

			System.out.println("LinkedHashSet -> " + africaLinked); // The order of insertion is preserved

			Set<String> africaHash = new HashSet<>(africaLinked); // The order is random
			System.out.println("HashSet -> " + africaHash);

			Set<String> africaTree = new TreeSet<>(africaLinked); // Alphabetical order
			System.out.println("TreeSet -> " + africaTree);

			int size = africaTree.size();
			boolean contains = africaTree.contains("Mali");
			boolean empty = africaTree.isEmpty();

			boolean ableToRemove = africaTree.remove("Mali");
			System.out.println("TreeSet -> " + africaTree);
			System.out.println("Was I able to remove Mali? " + ableToRemove);
			
			
			for(String country:africaTree) {
				System.out.print(country +' ');
			}

			// Note: We are NOT able to get/add/remove by index in a SET
			// africaTree.get(2);

			System.out.println("--------1st way, for loop DOES NOT work in a SET--------");
//			for (int i = 0; i < africaTree.size(); i++) {
//				africaTree.get(i);
//			}

			System.out.println("--------2nd way, enhanced/advanced for loop--------");

			System.out.println("--------3rd way, using iterator--------");

	}

}
