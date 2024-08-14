package com.neotech.lesson20;

import java.util.Scanner;

public class Homework1 {
	public static String getVowels(String str ) {
	
	
	String result = str.replaceAll("[^aeiouAEIOU]","");
	return result;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String onlyVowels = getVowels(str);
		System.out.println(onlyVowels);
		
	}
	
}
