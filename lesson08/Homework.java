package com.neotech.lesson08;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your grade: ");
		char grade = userInput.next().charAt(0);
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("A-Excellent!");
			break;
		case 'B':
		case 'b':
			System.out.println("B-Good!");
			break;
		case 'C':
		case 'c':
			System.out.println("c-Average!");
			break;
		case 'D':
		case 'd':
			System.out.println("D-Bad!");
			break;
		default :
			System.out.println("NOT accepteble!");
			break;
		}

}
}