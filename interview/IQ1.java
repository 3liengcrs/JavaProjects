package com.neotech.interview;

public class IQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 8;
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = "+ a + " b = "+ b);
		
		System.out.println("________________________");
		
		
		String str1 = "Java";
		String str2 = "Selenium";
		
		
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length()- str2.length());
		
		str1 = str1.substring(str2.length());
		
		System.out.println(str1 +" "+ str2);
		
		
		
		
		
		int number = 37; // Not prime, it is divisible by 1, 5, 7, 35
		boolean prime = true;

		if (number <= 1) {
			prime = false;
		} else {

			for (int i = 2; i < number; i++) {

				if (number % i == 0) {
					System.out.println(number + " is divisible by " + i);
					prime = false;
					break;
				} else {
					System.out.println(number + " is NOT divisible by " + i);
				}

			}

		}

		System.out.println("--------------------------------");
		System.out.println(number + " is prime? " + prime);

				
		
		
		}

	}


