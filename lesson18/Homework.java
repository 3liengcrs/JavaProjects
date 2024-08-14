package com.neotech.lesson18;

import java.util.Arrays;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Today is Tuesday and we have a Java Class!!";
		String[] words = sentence.split(" ");
		System.out.println(Arrays.toString(words));
		for (String word : words) {
			StringBuffer strBuffer = new StringBuffer(word);
			System.out.print(strBuffer.reverse() + " ");
		}

	}

}
