package com.neotech.lesson08;

import java.util.Scanner;

public class IntroToWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int var = 50;
		int n;
		while(var > 0) {
			System.out.println("Enter a number: ");
			n = scan.nextInt();
			var--;
		}

	}

}
