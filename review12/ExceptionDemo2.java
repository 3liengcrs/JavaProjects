package com.neotech.review12;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[3];
		
		try {
		numbers[0] = 10;
		numbers[1] = 42;
		numbers[2] = 26;
		numbers[3] = 8;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		for(int num :numbers) {
			System.out.print(num + " ");
			System.out.println(" ");
		}
		System.out.print("Will this line be printed? ");
		
		
		
		

	}

}
