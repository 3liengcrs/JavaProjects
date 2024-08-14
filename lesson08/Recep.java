package com.neotech.lesson08;

import java.util.Scanner;

public class Recep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double a,b,c;
		System.out.println("Enter three different number!!!");
		a =scan.nextDouble();
		b =scan.nextDouble();
		c =scan.nextDouble();
//		a = 15;
//		b = 45;
//		c = -5;
//		if(a>b) {
//			if (a>c) {
//				System.out.println(a + " is the largest number!!!");
//			}
//			else {
//				System.out.println(c + " is the largest number!!!");
//			}
//		}else {
//			if(b>c) {
//				System.out.println(b + " is the largest number!!!");
//				
//			}else {
//				System.out.println(c + " is the largest number!!!");
//			}
//		}
//		
		
		
		if ( a > b && a > c ) {
			System.out.println(a + " is the largest number!!!");	
		}
		else if (b > a && b > c) {
			System.out.println(b + " is the largest number!!!");
		}
		else {
			System.out.println(c + " is the largest number!!!");
		}

	}

}
