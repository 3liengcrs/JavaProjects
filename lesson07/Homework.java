package com.neotech.lesson07;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your height:");
		height = userInput.nextInt();
		if (height > 0 && height < 60) {
			System.out.println("You are classified as short");
		}
		else if (height >= 60 && height <= 72) { 
			System.out.println("You are classified as medium");
		}
		else if(height >= 72) {
			System.out.println("You are classified as tall");
		}
		else {
			System.out.println("Invalid Input");
		}

	}

}
