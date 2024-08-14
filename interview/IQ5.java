package com.neotech.interview;

public class IQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "NeoTech";

		// 1st way
		System.out.println("reverse str -> " + reverseOne(str));

		// 2nd way
		System.out.println("reverse str -> " + reverseTwo(str));

		// 3rd way, using StringBuffer
		StringBuffer sb = new StringBuffer(str);
		sb.reverse(); // StringBuffer is mutable
		System.out.println("reverse string using StringBuffer -> " + sb);

		System.out.println("--------------------------------");
		// Second part of the question: Reverse a string word by word?

		String longStr = "Bye bye Java Hello Selenium";
		System.out.println(longStr);

		String[] words = longStr.split(" ");

		String reverseSentence = "";

		for (int i = words.length - 1; i >= 0; i--) {
			reverseSentence += words[i] + " ";
		}

		System.out.println("reverse sentence -> " + reverseSentence);
	}

	public static String reverseOne(String str) {
		// 1st way, using charAt();

		String reverse = "";

		// Starting from the last character, down to the first one
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}

		return reverse;
	}

	public static String reverseTwo(String str) {
		// 2nd way, using toCharArray();

		String reverseStr = "";

		char[] chArray = str.toCharArray();

		// Getting the char from the array one by one, backwards
		for (int i = chArray.length - 1; i >= 0; i--) {
			reverseStr += chArray[i];
		}

		return reverseStr;

	}

}
