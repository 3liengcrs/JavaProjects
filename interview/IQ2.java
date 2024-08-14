package com.neotech.interview;

public class IQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 1;
		int num2 = 1;
		int next;
		for (int i=1; i<= 10; i++) {
			System.out.print(num1 + ",");
			
			next = num1+num2;
			num1=num2;
			num2=next;
			
		}

	}

}
