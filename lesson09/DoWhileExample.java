package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int myLuckyNumber = 5;
		int userGuess;
//		System.out.println("Please guess a number: ");
		
		do {
			System.out.println("Please my luckey number : ");
			
		    userGuess = userInput.nextInt();
		  
		}while(myLuckyNumber!= userGuess);
			
		System.out.println("You got it, you are the winner!");

	}

}
