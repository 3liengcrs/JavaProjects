package com.neotech.lesson15;

public class Calculator {
	// This class have 3 methods : add, multiply,divide and min;
	// add two number;
	void add(int a, int b) {
		int sum = a + b;
		System.out.println("The resulte of : " + a + " + " + b + " = " + sum);
	}
	
	void multiply(int a, int b) {
		int sum = a*b;
		System.out.println("The resulte of : " + a + " * " + b + " = " + sum);
	}
	
	void divide(double a, double b) {
		double sum = a/b;
		System.out.println("The resulte of : " + a + " / " + b + " = " + sum);
	}
	
	void minuse(int a, int b) {
		int sum = a - b;
		System.out.println("The resulte of : " + a + " - " + b + " = " + sum);
	}

}
