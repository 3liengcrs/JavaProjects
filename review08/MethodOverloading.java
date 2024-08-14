package com.neotech.review08;

public class MethodOverloading {
	//Method signature = method name + parameters
	//Access modifier is not part of the method signature
	//
	public void calculateInterest() {
		
	}
    public void calculateInterest(int a) {
		
	}
   public void calculateInterest(String a) {
		
	}
   public void calculateInterest(double a, double b) {
		
	}
   public void calculateInterest(int a, double b) {
		
	}
   public static void main(String[] args) {
	   MethodOverloading mo = new MethodOverloading();
	   mo.calculateInterest(0);
	   mo.calculateInterest(5,4.5);
	   
	   // Polymorphism
	   // Method Overloading
	   // Compile time Poly/early binding/static binding
		
		
	}

}


