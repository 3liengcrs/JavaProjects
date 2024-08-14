package com.neotech.lesson07;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a number from 1 to 7: ");
		int day = userInput.nextInt();
		if(day >= 0 && day <= 5) {
			System.out.println("It is a weekday!");
		}
		else if (day >= 6 && day <=7 ) {
			System.out.println("It is a weekend!!");
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}
