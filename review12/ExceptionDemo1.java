package com.neotech.review12;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		division(2,8);
		division(12,2);
		division(2,0);
		division(50,8);

	}
	public static void division(int num1, int num2) {
		
		
		try {
			int result = num1/num2;
			System.out.println("result -> "+ result);
		}catch(ArithmeticException ex ){
			
			System.out.println("Problem when dividinng "+ num1 + " by "+ num2);
			
		} finally {
			System.out.println("NEOTECH is the best!!!");
		}
		
		
		
		
		
	}	
}
